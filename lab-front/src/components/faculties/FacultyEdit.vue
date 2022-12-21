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

      <button class="wide-button" @click="updateFaculty">Edit</button>
      <router-link to="/faculty">
        <button class="wide-button button-grey">
          Back
        </button>
      </router-link>
    </div>
  </div>
</template>

<script>
import FacultyService from "./FacultyService";

export default {

  name: "FacultyEdit",
  data: () => ({
    faculty: {}
  }),
  methods: {
    updateFaculty() {
      FacultyService.updateFaculty(this.faculty, this.$route.params.id)
      this.$router.go('/faculty')
    }
  },
}
</script>

<style scoped>


</style>