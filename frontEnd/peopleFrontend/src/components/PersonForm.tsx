import type { PersonRequest } from "../types/person";
import { useState } from "react";

interface Props {
  initial?: PersonRequest;
  onSubmit: (data: PersonRequest) => void;
}

export default function PersonForm({ initial, onSubmit }: Props) {
  const [form, setForm] = useState<PersonRequest>(
    initial || {
      firstName: "",
      lastName: "",
      age: 0,
      email: "",
      gender: "",
      education: "",
      salary: 0,
      maritalStatus: ""
    }
  );

  const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  return (
    <form onSubmit={e => { e.preventDefault(); onSubmit(form); }}>
      <input name="firstName" value={form.firstName} onChange={handleChange} />
      <input name="lastName" value={form.lastName} onChange={handleChange} />
      <input name="email" value={form.email} onChange={handleChange} />
      <input name="age" type="number" value={form.age} onChange={handleChange} />
      <input name="salary" type="number" value={form.salary} onChange={handleChange} />
      <button type="submit">Save</button>
    </form>
  );
}
