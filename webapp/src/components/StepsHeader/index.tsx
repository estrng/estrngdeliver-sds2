export default function StepsHeader() {
  return (
    <header className="orders-steps-container">
      <div className="orders-steps-content">
        <h1 className="steps-title">Siga as etapas</h1>
        <ul className="step-items">
          <li>
            <span className="steps-number">1 </span>
            Selecione os produtos e localização.
          </li>
          <li>
            <span className="steps-number">2 </span>
            Depois clieque em <strong>"ENVIAR PEDIDO"</strong>
          </li>
        </ul>
      </div>
    </header>
  );
}

/*TIP A estilização dessa pagina 
 esta junto com o arquivo styles de order*/
