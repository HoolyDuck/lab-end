<template>
  <div class="input-text">
    <p>Name</p>
    <input type="text" name="name" v-model="faculty.name">
  </div>

  <div class="input-text">
    <p>University</p>
    <input type="text" name="university" v-model="faculty.university">
  </div>


  <button @click="updateFaculty">Update</button>
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
    }
  },
}
</script>

<style scoped>


</style>