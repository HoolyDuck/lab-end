import axios from "axios";

const DISCIPLINE_API_URL = "http://localhost:8080/api/disciplines"

class DisciplineService {
    getAllDisciplines() {
        return axios.get(DISCIPLINE_API_URL + '/all')
    };

    addDiscipline(discipline) {
        return axios.post(DISCIPLINE_API_URL + '/add', discipline)
    };

    updateDiscipline(discipline, id) {
        return axios.put(DISCIPLINE_API_URL + '/update/' + id, discipline)
    };

    deleteDiscipline(id) {
        return axios.delete(DISCIPLINE_API_URL + '/delete/' + id)
    };
}

export default new DisciplineService()