import { useState, useEffect } from "react";
import { OrderLocationData, Product } from "./types";
import ProductsList from "../../components/ProductsList.tsx";
import StepsHeader from "../../components/StepsHeader";

import api from "../../services/api";

import "./styles.css";
import Loading from "../../components/Loading";
import OrderLocation from "../../components/OrderLocation";
import Footer from "../../components/Footer";
import OrderSummary from "../../components/OrderSumary";
import { checkIsSelected, sumOfPrices } from "../../functions/helpers";
import { toast } from "react-toastify";

function Orders() {
  const [orderLocation, setOrderLocation] = useState<OrderLocationData>();
  const [products, setProducts] = useState<Product[]>([]); // TIP para typescript
  const [selectedProducts, setSelectedProducts] = useState<Product[]>([]); // TIP para typescript

  async function getOrders() {
    try {
      const { data } = await api.get("/products");
      setProducts(data);
    } catch (error) {
      toast.error("Não foi pssivel fazer a requisição");
      console.log(error);
    }
  }

  useEffect(() => {
    getOrders();
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  const handleSelectProduct = (product: Product) => {
    const isAlreadySelected = checkIsSelected(selectedProducts, product);

    if (isAlreadySelected) {
      const selected = selectedProducts.filter(
        (item) => item.id !== product.id
      );
      setSelectedProducts(selected);
    } else {
      setSelectedProducts((previous) => [...previous, product]);
    }
  };

  const handleSubmit = () => {
    const productsIds = selectedProducts.map(({ id }) => ({ id }));
    const payload = {
      ...orderLocation!,
      products: productsIds,
    };

    api
      .post("/orders", payload)
      .then((response) => {
        toast.error(`Pedido enviado com sucesso! N° ${response.data.id}`);
        setSelectedProducts([]);
      })
      .catch(() => {
        toast.warning("Erro ao enviar pedido");
      });
  };

  return (
    <div className="orders-container">
      <StepsHeader />
      {!products ? (
        <Loading type="bubbles" color="#464646" />
      ) : (
        <ProductsList
          onSelectProduct={handleSelectProduct}
          products={products}
          selectedProducts={selectedProducts}
        />
      )}
      <OrderLocation
        onChangeLocation={(location) => setOrderLocation(location)} // TIP o eventofilho esta enviando um envento para o pai
      />
      <OrderSummary
        amount={selectedProducts.length}
        totalPrice={sumOfPrices(selectedProducts)}
        onSubmit={handleSubmit}
      />
      <Footer />
    </div>
  );
}

export default Orders;
