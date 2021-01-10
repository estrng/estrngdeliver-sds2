import { Product } from "../pages/Orders/types";

export function checkIsSelected(selectedProducts: Product[], product: Product) {
  return selectedProducts.some((item) => item.id === product.id);
}

export function sumOfPrices(selectedProducts: Product[]) {
  const totalPrice = selectedProducts.reduce((sum, item) => {
    return sum + item.price;
  }, 0);

  return totalPrice;
}

export function formatPrice(price: number) {
  const formatter = new Intl.NumberFormat("pt-BR", {
    style: "currency",
    currency: "BRL",
  });

  const priceFormatted = formatter.format(price);

  return priceFormatted;
}
