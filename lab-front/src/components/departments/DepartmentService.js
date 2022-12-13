import axios from "axios";

const DEPARTMENT_API_URL = "http://localhost:8080/api/departments"

class DepartmentService  {
    getAllDepartments() {
        return axios.get(DEPARTMENT_API_URL)
    };

    addDepartment(department) {
        return axios.post(DEPARTMENT_API_URL, department)
    };

    updateDepartment(department, id) {
        return axios.put(DEPARTMENT_API_URL + '/' + id, department )
    };

    deleteDepartment(id) {
        return axios.delete(DEPARTMENT_API_URL + '/' + id)
    }
}

export default new DepartmentService()
