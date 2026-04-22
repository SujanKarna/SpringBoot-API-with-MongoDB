import { useEffect, useState } from "react";
import { getAllPeople, deletePerson } from "../api/personApi";
import PersonTable from "../components/PersonTable";
import { useNavigate } from "react-router-dom";

export default function HomePage() {
  const [page, setPage] = useState(0);
  const [data, setData] = useState<any>(null);
  const navigate = useNavigate();

  useEffect(() => {
    getAllPeople(page, 10).then(setData);
  }, [page]);

  return (
    <div>
      <button onClick={() => navigate("/create")}>Add Person</button>

      {data && (
        <>
          <PersonTable
            people={data.content}
            onEdit={(id) => navigate(`/edit/${id}`)}
            onDelete={async (id) => {
              await deletePerson(id);
              getAllPeople(page, 10).then(setData);
            }}
          />

          <button disabled={page === 0} onClick={() => setPage(page - 1)}>Prev</button>
          <button disabled={page === data.totalPages - 1} onClick={() => setPage(page + 1)}>Next</button>
        </>
      )}
    </div>
  );
}
