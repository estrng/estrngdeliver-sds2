import axios from "axios";

const api = axios.create({
  baseURL: "https://estrngdeliver.herokuapp.com/",
});

export default api;
