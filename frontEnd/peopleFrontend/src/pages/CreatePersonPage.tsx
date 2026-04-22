import PersonForm from "../components/PersonForm";
import { createPerson } from "../api/personApi";
import { useNavigate } from "react-router-dom";

export default function CreatePersonPage() {
  const navigate = useNavigate();

  return (
    <PersonForm
      onSubmit={async (data) => {
        await createPerson(data);
        navigate("/");
      }}
    />
  );
}
