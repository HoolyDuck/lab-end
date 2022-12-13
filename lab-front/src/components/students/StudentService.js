import axios from "axios";

const FACULTY_API_URL = "http://localhost:8080/api/students"

class StudentService {
    getAllStudents() {
        return axios.get(FACULTY_API_URL)
    };

    addStudent(student) {
        return axios.post(FACULTY_API_URL, student)
    };

    updateStudent(student, id) {
        return axios.put(FACULTY_API_URL + '/' + id, student )
    };

    deleteStudent(id) {
        return axios.delete(FACULTY_API_URL + '/' + id)
    }
}

export default new StudentService()
