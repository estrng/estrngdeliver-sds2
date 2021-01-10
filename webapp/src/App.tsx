import "./App.css";
import Routes from "./Routes";
import { ToastContainer, toast } from "react-toastify";

import "react-toastify/dist/ReactToastify.css";

function App() {
  return (
    <>
      <ToastContainer />
      <Routes />
    </>
  );
}

export default App;
