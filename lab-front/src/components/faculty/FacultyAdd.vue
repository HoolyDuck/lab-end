<template>
  <div class="input-text">
    <p>Name</p>
    <input type="text" name="name" v-model="faculty.name">
  </div>

  <div class="input-text">
    <p>University</p>
    <input type="text" name="university" v-model="faculty.university">
  </div>


  <button @click="addFaculty">Add</button>
</template>

<script>
import FacultyService from "./FacultyService";
export default {

  name: "FacultyAdd",
  data: () => ({
    faculty: {}
  }),
  methods: {
    addFaculty() {
      FacultyService.addFaculty(this.faculty).then((response) => (console.log(response)))
    }
  }
}
</script>

<style scoped>


</style>