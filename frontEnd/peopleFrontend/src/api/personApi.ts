import axios from "axios";
import type { PersonRequest, PersonResponse, PageResponse } from "../types/person";

const API_URL = "http://localhost:8080/api/people";

export const getAllPeople = async (page = 0, size = 10) => {
  const res = await axios.get<PageResponse<PersonResponse>>(
    `${API_URL}?page=${page}&size=${size}`
  );
  return res.data;
};

export const getPersonById = async (id: string) => {
  const res = await axios.get<PersonResponse>(`${API_URL}/${id}`);
  return res.data;
};

export const createPerson = async (data: PersonRequest) => {
  const res = await axios.post<PersonResponse>(API_URL, data);
  return res.data;
};

export const updatePerson = async (id: string, data: PersonRequest) => {
  const res = await axios.put<PersonResponse>(`${API_URL}/${id}`, data);
  return res.data;
};

export const deletePerson = async (id: string) => {
  await axios.delete(`${API_URL}/${id}`);
};
