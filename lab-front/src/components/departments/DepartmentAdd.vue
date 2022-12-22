<template>
  <div class="flex center">
    <p class="cool-text bolder">Add Department</p>
    <div class="edit-add-wrapper">

      <div class="edit-add-field-wrapper">
        <div class="input-text">
          <p>Name</p>
          <input type="text" v-model="department.name">
        </div>

        <div class="input-text">
          <p>Short name</p>
          <input type="text" v-model="department.short_name">
        </div>

        <div class="input-text">
          <p>Faculty ID</p>
          <input type="number" v-model="department.faculty_id">

        </div>
      </div>
      <div class="error-text" v-if="showError">{{ errorText }}</div>
      <CommitButton @click="addDepartment"></CommitButton>
      <BackButton to="/department"></BackButton>
    </div>
  </div>


</template>

<script>

import DepartmentService from "./DepartmentService";
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";
import crudErrorHandler from "../../error_handlers/crudErrorHandler";

export default {


  name: "DepartmentAdd",
  components: {BackButton, CommitButton},
  data: () => ({
    department: {
      name: "",
      short_name: "",
      faculty_id: 0
    },
    showError: false,
    errorText: ""

  }),
  methods: {
    addDepartment: function () {
      DepartmentService.addDepartment(this.department)
          .then(() => {
            this.$router.push('/department')
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