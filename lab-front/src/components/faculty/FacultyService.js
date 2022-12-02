import axios from "axios";

const FACULTY_API_URL = "http://localhost:8080/api/faculties"

class FacultyService {
    getAllFaculties() {
        return axios.get(FACULTY_API_URL + "/all")
    };

    addFaculty(faculty) {
        return axios.post(FACULTY_API_URL + "/add", faculty).then(r => console.log(r.data))
    };
}

export default new FacultyService()
