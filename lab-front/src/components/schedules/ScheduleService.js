import axios from "axios";

const Schedule_API_URL = "http://localhost:8080/api/schedules"

class ScheduleService {
    getAllSchedules() {
        return axios.get(Schedule_API_URL + '/all')
    };

    getAllSchedules2() {
        return axios.get(Schedule_API_URL + '/all2')
    };

    addSchedule(teacher) {
        return axios.post(Schedule_API_URL + '/add', teacher)
    };

    updateSchedule(teacher, id) {
        return axios.put(Schedule_API_URL + '/update/' + id, teacher)
    };

    deleteSchedule(id) {
        return axios.delete(Schedule_API_URL + '/delete/' + id)
    };
}

export default new ScheduleService()