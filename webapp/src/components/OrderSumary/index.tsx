import { formatPrice } from "../../functions/helpers";

type Props = {
  amount: number;
  totalPrice: number;
  onSubmit: () => void;
};

export default function OrderSummary({ amount, totalPrice, onSubmit }: Props) {
  return (
    <div className="order-summary-container">
      <div className="order-summary-content">
        <div>
          <span className="amount-selected-container">
            <h2 className="amount-selected">{amount}</h2>
            PEDIDOS SELECIONADOS
          </span>
          <span className="order-summary-total">
            <h2 className="amount-selected">{formatPrice(totalPrice)}</h2>
            VALOR TOTAL
          </span>
        </div>
        <button onClick={onSubmit} className="order-summary-make-order">
          FAZER PEDIDO
        </button>
      </div>
    </div>
  );
}
