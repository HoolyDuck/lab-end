import axios from "axios";

const FACULTY_API_URL = "http://localhost:8080/api/faculties/all"

class FacultyService {
    getAllFaculties() {
        return axios.get(FACULTY_API_URL)
    }
}

export default new FacultyService()
