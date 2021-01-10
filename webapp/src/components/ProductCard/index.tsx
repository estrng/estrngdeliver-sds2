import { formatPrice } from "../../functions/helpers";
import { Product } from "../../pages/Orders/types";

type Props = {
  product: Product;
  onSelectProduct: (product: Product) => void;
  isSelected: boolean;
};

export default function ProductCard({
  product,
  onSelectProduct,
  isSelected,
}: Props) {
  return (
    <div
      className={`order-card-container ${isSelected ? "selected" : ""}`}
      onClick={() => onSelectProduct(product)}
    >
      <h3 className="order-card-title">{product.name}</h3>
      <img
        className="order-card-image"
        src={product.image_uri}
        alt={product.name}
      />
      <h3 className="order-card-price">{formatPrice(product.price)}</h3>
      <div className="order-card-description">
        <h3>Descrição</h3>
        <p>{product.description}</p>
      </div>
    </div>
  );
}
