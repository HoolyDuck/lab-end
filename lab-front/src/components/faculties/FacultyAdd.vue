<template>
  <div class="input-text">
    <p>Name</p>
    <input type="text" v-model="faculty.name">
  </div>

  <div class="input-text">
    <p>Short_Name</p>
    <input type="text" name="short_name" v-model="faculty.short_name">
  </div>


  <button @click="addFaculty">Add</button>
  <router-link to="/faculty"><img class="back" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWYHt9NT496QIJVyQoZzu2yPJjcp0obnYgIr-irZ-0wreRazh54BvYPTJrW8HbuC93QGc&usqp=CAU"></router-link>
</template>

<script>
import FacultyService from "./FacultyService";
export default {

  name: "FacultyAdd",
  data: () => ({
    faculty: {
      name: "",
      short_name: ""
    }
  }),
  methods: {
    addFaculty() {
      FacultyService.addFaculty(this.faculty)
      this.$router.push('/faculty')
    }
  }
}
</script>

<style scoped>


</style>