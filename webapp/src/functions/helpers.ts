import { Product } from "../pages/Orders/types";

export function checkIsSelected(selectedProducts: Product[], product: Product) {
  return selectedProducts.some((item) => item.id === product.id);
}
