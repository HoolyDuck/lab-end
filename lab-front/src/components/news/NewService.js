import axios from "axios";

const NEW_API_URL = "http://localhost:8080/api/news"

class NewService {
    getAllNews() {
        return axios.get(NEW_API_URL + '/all')
    };

    addNew(New) {
        return axios.post(NEW_API_URL + '/add', New)
    };

    updateNew(New, id) {
        return axios.put(NEW_API_URL + '/update/' + id, New)
    };

    deleteNew(id) {
        return axios.delete(NEW_API_URL + '/delete/' + id)
    };
}

export default new NewService()