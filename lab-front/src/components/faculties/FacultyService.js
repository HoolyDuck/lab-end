import axios from "axios";

const FACULTY_API_URL = "http://localhost:8080/api/faculties"

class FacultyService {
    getAllFaculties() {
        return axios.get(FACULTY_API_URL)
    };

    addFaculty(faculty) {
        return axios.post(FACULTY_API_URL, faculty)
    };

    updateFaculty(faculty, id) {
        return axios.put(FACULTY_API_URL + '/' + id, faculty )
    };

    deleteFaculty(id) {
        return axios.delete(FACULTY_API_URL + '/' + id)
    }
}

export default new FacultyService()
