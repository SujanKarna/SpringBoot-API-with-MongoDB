import { BrowserRouter, Routes, Route } from "react-router-dom";
import HomePage from "./pages/HomePage";
import CreatePersonPage from "./pages/CreatePersonPage";
import EditPersonPage from "./pages/EditPersonPage";

export default function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/create" element={<CreatePersonPage />} />
        <Route path="/edit/:id" element={<EditPersonPage />} />
      </Routes>
    </BrowserRouter>
  );
}
