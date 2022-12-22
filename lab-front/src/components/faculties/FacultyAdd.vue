<template>

  <div class="flex center">
    <p class="cool-text bolder">Add Faculty</p>
    <div class="edit-add-wrapper">
      <div class="edit-add-field-wrapper">
        <div class="input-text">
          <p>Name</p>
          <input type="text" v-model="faculty.name">
        </div>

        <div class="input-text">
          <p >Short name</p>
          <input type="text" name="short_name" v-model="faculty.short_name">
        </div>
      </div>
      <div class="error-text" v-if="showError">{{ errorText }}</div>
      <CommitButton @click="addFaculty"></CommitButton>
      <BackButton to="/faculty"></BackButton>

    </div>
  </div>
</template>

<script>
import FacultyService from "./FacultyService";
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";
import crudErrorHandler from "../../error_handlers/crudErrorHandler";

export default {

  name: "FacultyAdd",
  components: {BackButton, CommitButton},
  data: () => ({
    faculty: {
      name: "",
      short_name: ""
    },
    showError: false,
    errorText: ""
  }),
  methods: {
    addFaculty() {
      FacultyService.addFaculty(this.faculty)
          .then(() => {
            this.$router.push('/faculty')
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