import { BrowserRouter, Switch, Route } from "react-router-dom";
import Header from "./components/Header";
import Home from "./pages/Home";
import Orders from "./pages/Orders";

function Routes() {
  return (
    <BrowserRouter>
      <Header />
      <Switch>
        <Route path="/" component={Home} exact />
        <Route path="/orders" component={Orders} />
      </Switch>
    </BrowserRouter>
  );
}

export default Routes;
