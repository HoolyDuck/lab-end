import axios from "axios";

const TEACHER_API_URL = "http://localhost:8080/api/teachers"

class TeacherService {
    getAllTeachers() {
        return axios.get(TEACHER_API_URL + '/all')
    };

    addTeacher(teacher) {
        return axios.post(TEACHER_API_URL + '/add', teacher)
    };

    updateTeacher(teacher, id) {
        return axios.put(TEACHER_API_URL + '/update/' + id, teacher)
    };

    deleteTeacher(id) {
        return axios.delete(TEACHER_API_URL + '/delete/' + id)
    };
}

export default new TeacherService()