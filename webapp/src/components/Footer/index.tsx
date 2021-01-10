import { ReactComponent as Instagram } from "./instagram.svg";
import { ReactComponent as Linkedin } from "./linkedin.svg";
import { ReactComponent as Youtube } from "./youtube.svg";
import "./styles.css";

function Footer() {
  return (
    <footer className="main-footer">
      Direitos reservados - Estrngdeliver S/A
      <div className="footer-icons">
        <a
          href="https://instagram.com/estrongbelgier"
          target="_new"
          rel="noopener noreferrer"
        >
          <Instagram />
        </a>
        <a
          href="https://www.linkedin.com/in/estrongbelgier/"
          target="_new"
          rel="noopener noreferrer"
        >
          <Linkedin />
        </a>
        <a href="https://youtube.com" target="_new" rel="noopener noreferrer">
          <Youtube />
        </a>
      </div>
    </footer>
  );
}

export default Footer;
