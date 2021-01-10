import { Link } from "react-router-dom";
import { ReactComponent as Logo } from "./logo.svg";

import "./styles.css";

function Header() {
  return (
    <nav className="main-navbar">
      <Logo />
      <Link className="logo-text" to="/">
        estrngdeliver
      </Link>
    </nav>
  );
}

export default Header;
