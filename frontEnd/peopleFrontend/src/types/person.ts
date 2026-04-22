export interface PersonRequest {
  firstName: string;
  lastName: string;
  age: number;
  email: string;
  gender: string;
  education: string;
  salary: number;
  maritalStatus: string;
}

export interface PersonResponse extends PersonRequest {
  id: string;
}

export interface PageResponse<T> {
  content: T[];
  totalPages: number;
  totalElements: number;
  number: number;
  size: number;
}
