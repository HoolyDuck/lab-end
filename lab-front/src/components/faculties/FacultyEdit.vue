<template>
  <div class="input-text">
    <p>Name</p>
    <input type="text" name="name" v-model="faculty.name">
  </div>

  <div class="input-text">
    <p>Short_Name</p>
    <input type="text" name="short_name" v-model="faculty.short_name">
  </div>


  <button @click="updateFaculty">Update</button>
  <router-link to="/faculty"><img class="back" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWYHt9NT496QIJVyQoZzu2yPJjcp0obnYgIr-irZ-0wreRazh54BvYPTJrW8HbuC93QGc&usqp=CAU"></router-link>
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
      this.$router.push('/faculty')
    }
  },
}
</script>

<style scoped>


</style>