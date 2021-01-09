import "./styles.css";
import { ReactComponent as Logo } from "./logo.svg";
function Header() {
  return (
    <nav className="main-navbar">
      <Logo />
      <a href="/home" className="logo-text">
        estrngdeliver
      </a>
    </nav>
  );
}

export default Header;
