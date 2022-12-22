class CrudErrorHandler {
    catchError(err) {
        if (err.response) {
            if (err.response.status === 400) {
                return "Invalid data. Try again"
            }
            return "Error happened on server. Check your ids and try again"
        }
        return "Server is down"
    };
}
export default new CrudErrorHandler()