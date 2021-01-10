import { checkIsSelected } from "../../functions/helpers";
import { Product } from "../../pages/Orders/types";
import ProductCard from "../ProductCard";

type Props = {
  products: Product[];
  selectedProducts: Product[];
  onSelectProduct: (product: Product) => void;
};

export default function ProductsList({
  products,
  selectedProducts,
  onSelectProduct,
}: Props) {
  return (
    <div className="orders-list-container">
      <div className="orders-list-items">
        {products.map((product) => (
          <ProductCard
            key={product.id}
            product={product}
            onSelectProduct={onSelectProduct}
            isSelected={checkIsSelected(selectedProducts, product)}
          />
        ))}
      </div>
    </div>
  );
}
