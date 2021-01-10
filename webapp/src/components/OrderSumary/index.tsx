export default function OrderSummary() {
  return (
    <div className="order-summary-container">
      <div className="order-summary-content">
        <div>
          <span className="amount-selected-container">
            <h2 className="amount-selected">2</h2>
            PEDIDOS SELECIONADOS
          </span>
          <span className="order-summary-total">
            <h2 className="amount-selected">R$ 50,00</h2>
            VALOR TOTAL
          </span>
        </div>
        <button className="order-summary-make-order">FAZER PEDIDO</button>
      </div>
    </div>
  );
}
