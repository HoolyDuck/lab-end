<template>

  <div class="flex center">
    <p class="cool-text bolder">Edit Faculty</p>
    <div class="edit-add-wrapper">

      <div class="edit-add-field-wrapper">

        <div class="input-text">
          <p>Name</p>
          <input type="text" name="name" v-model="faculty.name" >
        </div>

        <div class="input-text">
          <p>Short name</p>
          <input type="text" name="short_name" v-model="faculty.short_name">
        </div>
      </div>
      <div class="error-text" v-if="showError">{{ errorText }}</div>
      <CommitButton @click="updateFaculty"></CommitButton>
      <BackButton to="/faculty"></BackButton>
    </div>
  </div>
</template>

<script>
import FacultyService from "./FacultyService";
import BackButton from "../layouts/BackButton.vue";
import CommitButton from "../layouts/CommitButton.vue";
import crudErrorHandler from "../../error_handlers/crudErrorHandler";

export default {

  name: "FacultyEdit",
  components: {CommitButton, BackButton},
  data: () => ({
    faculty: {},
    showError: false,
    errorText: ""
  }),
  methods: {
    updateFaculty() {
      FacultyService.updateFaculty(this.faculty, this.$route.params.id)
          .then(() => {
            this.$router.push('/faculty')
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