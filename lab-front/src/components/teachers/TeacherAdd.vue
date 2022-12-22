<template>
  <div class="flex center">
    <p class="cool-text bolder">Add Teacher</p>
  <div class="edit-add-wrapper">

    <div class="edit-add-field-wrapper">
      <div class="input-text">
        <p>Name</p>
        <input type="text" name="name" v-model="teacher.name">
      </div>

      <div class="input-text">
        <p>Surname</p>
        <input type="text" name="surname" v-model="teacher.surname">
      </div>

      <div class="input-text">
        <p>Email</p>
        <input type="text" name="email" v-model="teacher.email">
      </div>

      <div class="input-text">
        <p>Phone</p>
        <input type="text" name="phone" v-model="teacher.phone">
      </div>

      <div class="input-text">
        <p>Department_Id</p>
        <input type="number" name="department" v-model="teacher.department_id">
      </div>
    </div>
    <div class="error-text" v-if="showError">{{ errorText }}</div>
    <CommitButton @click="addTeacher"></CommitButton>
    <BackButton to="/teacher"></BackButton>
  </div>
  </div>
</template>

<script>

import TeacherService from "./TeacherService";
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";
import crudErrorHandler from "../../error_handlers/crudErrorHandler";

export default {
  name: "TeacherAdd",
  components: {BackButton, CommitButton},
  data: () => ({
    teacher: {
      email: "",
      name: "",
      phone: "",
      surname: "",
      department_id: 0
    },
    showError: false,
    errorText: ""
  }),
  methods: {
    addTeacher() {
      TeacherService.addTeacher(this.teacher).then(() => {
        this.$router.push('/teacher')
      })
          .catch(err => {
            this.showError = true
            this.errorText = crudErrorHandler.catchError(err)
          });
    }
  }
}
</script>

<style scoped>

</style>