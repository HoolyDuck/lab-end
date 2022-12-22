<template>
  <div class="flex center">
    <p class="cool-text bolder">Edit Student</p>
    <div class="edit-add-wrapper">

      <div class="edit-add-field-wrapper">

        <div class="input-text">
          <p>Name</p>
          <input type="text" v-model="student.name">
        </div>

        <div class="input-text">
          <p>Email</p>
          <input type="text" v-model="student.email">
        </div>

        <div class="input-text">
          <p>Phone</p>
          <input type="text" v-model="student.phone">
        </div>

        <div class="input-text">
          <p>Group ID</p>
          <input v-model="student.group_id">
        </div>
      </div>
      <div class="error-text" v-if="showError">{{ errorText }}</div>
      <CommitButton @click="updateStudent">Edit</CommitButton>
      <BackButton to="/student"></BackButton>
    </div>
  </div>
</template>

<script>
import StudentService from "./StudentService";
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";
import crudErrorHandler from "../../error_handlers/crudErrorHandler";

export default {

  name: "StudentEdit",
  components: {BackButton, CommitButton},
  data: () => ({
    student: {
      name: "",
      email: "",
      phone: "",
      group_id: 0
    },
    showError: false,
    errorText: ""
  }),
  methods: {
    updateStudent() {
      StudentService.updateStudent(this.student, this.$route.params.id).then(() => {
        this.$router.push('/student')
      })
          .catch(err => {
            this.showError = true
            this.errorText = crudErrorHandler.catchError(err)
          });
    }
  },
}
</script>

<style scoped>


</style>