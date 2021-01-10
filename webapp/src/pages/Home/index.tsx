import "./styles.css";
import { ReactComponent as MainImage } from "./main.svg";
import Footer from "../../components/Footer";

function Home() {
  return (
    <>
      <div className="home-container">
        <div className="home-content">
          <div className="home-actiions">
            <h1 className="home-title">Faça seu pedido!</h1>
            <h3 className="home-sobtitle">
              Faça seu pedido escolha os itens <br /> que lhe entregaremos
            </h3>
            <a href="/order" rel="noopener noreferrer">
              Fazer pedido
            </a>
          </div>
          <div className="home-image">
            <MainImage />
          </div>
        </div>
      </div>

      <Footer />
    </>
  );
}

export default Home;
