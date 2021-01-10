import { useState, useEffect } from "react";
import { Product } from "./types";
import ProductsList from "../../components/ProductsList.tsx";
import StepsHeader from "../../components/StepsHeader";

import api from "../../services/api";

import "./styles.css";
import Loading from "../../components/Loading";

function Orders() {
  const [products, setProducts] = useState<Product[]>([]); // TIP para typescript

  async function getOrders() {
    try {
      const { data } = await api.get("/products");
      setProducts(data);
    } catch (error) {
      console.log(error);
    }
  }

  useEffect(() => {
    getOrders();
    console.log(products);
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  return (
    <div className="orders-container">
      <StepsHeader />
      {!products ? (
        <Loading type="bubbles" color="#464646" />
      ) : (
        <ProductsList products={products} />
      )}
    </div>
  );
}

export default Orders;
