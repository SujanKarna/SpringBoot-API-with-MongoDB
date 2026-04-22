import { useEffect, useState } from "react";
import { getPersonById, updatePerson } from "../api/personApi";
import PersonForm from "../components/PersonForm";
import { useParams, useNavigate } from "react-router-dom";

export default function EditPersonPage() {
  const { id } = useParams();
  const navigate = useNavigate();
  const [initial, setInitial] = useState<any>(null);

  useEffect(() => {
    if (id) getPersonById(id).then(setInitial);
  }, [id]);

  if (!initial) return <p>Loading...</p>;

  return (
    <PersonForm
      initial={initial}
      onSubmit={async (data) => {
        await updatePerson(id!, data);
        navigate("/");
      }}
    />
  );
}
