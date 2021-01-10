import { type } from "os";

export type Product = {
  id: number;
  name: string;
  price: number;
  description: string;
  image_uri: string;
};

export type OrderLocationData = {
  latitude: number;
  longitude: number;
  address: string;
};

type ProductId = {
  id: number;
};

export type OrderPayload = {
  product: ProductId[];
} & OrderLocationData; // TIP merge de tipos
// TIP tipagem de modelo de dados para ajduar a programação
