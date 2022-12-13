import axios from "axios";

const GROUP_API_URL = "http://localhost:8080/api/groups"

class GroupService {
    getAllGroups() {
        return axios.get(GROUP_API_URL)
    };

    addGroup(group) {
        return axios.post(GROUP_API_URL, group)
    };

    updateGroup(group, id) {
        return axios.put(GROUP_API_URL + '/' + id, group )
    };

    deleteGroup(id) {
        return axios.delete(GROUP_API_URL + '/' + id)
    }
}

export default new GroupService()
