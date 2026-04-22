import type { PersonResponse } from "../types/person";

interface Props {
  people: PersonResponse[];
  onEdit: (id: string) => void;
  onDelete: (id: string) => void;
}

export default function PersonTable({ people, onEdit, onDelete }: Props) {
  return (
    <table>
      <thead>
        <tr>
          <th>Name</th><th>Email</th><th>Gender</th><th>Actions</th>
        </tr>
      </thead>
      <tbody>
        {people.map(p => (
          <tr key={p.id}>
            <td>{p.firstName} {p.lastName}</td>
            <td>{p.email}</td>
            <td>{p.gender}</td>
            <td>
              <button onClick={() => onEdit(p.id)}>Edit</button>
              <button onClick={() => onDelete(p.id)}>Delete</button>
            </td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}
