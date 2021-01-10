import { useState, useEffect } from "react";
import { OrderLocationData, Product } from "./types";
import ProductsList from "../../components/ProductsList.tsx";
import StepsHeader from "../../components/StepsHeader";

import api from "../../services/api";

import "./styles.css";
import Loading from "../../components/Loading";
import OrderLocation from "../../components/OrderLocation";
import Footer from "../../components/Footer";

function Orders() {
  const [orderLocation, setOrderLocation] = useState<OrderLocationData>();
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
      <OrderLocation
        onChangeLocation={(location) => setOrderLocation(location)} // TIP o eventofilho esta enviando um envento para o pai
      />
      <Footer />
    </div>
  );
}

export default Orders;
