import axios from "axios";

const mapApi = axios.create({
  baseURL: `https://api.mapbox.com/geocoding/v5/mapbox.places/`,
});

export default mapApi;
