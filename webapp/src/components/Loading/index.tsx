import ReactLoading from "react-loading";

type Props = {
  type: any;
  color: string;
};

export default function Loading({ type, color }: Props) {
  return (
    <div>
      <ReactLoading type={type} color={color} height={667} width={375} />
    </div>
  );
}
