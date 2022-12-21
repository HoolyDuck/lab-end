<template>
  <div class="edit-add-wrapper">

    <div class="edit-add-field-wrapper">
      <div class="input-text">
        <p>Name</p>
        <input type="text" v-model="faculty.name">
      </div>

      <div class="input-text">
        <p>Short_Name</p>
        <input type="text" name="short_name" v-model="faculty.short_name">
      </div>
    </div>

    <button @click="addFaculty">Add</button>
    <button>
      <router-link to="/faculty">Back</router-link>
    </button>
  </div>
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