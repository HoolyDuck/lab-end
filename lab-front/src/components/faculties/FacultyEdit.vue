<template>
  <div class="edit-add-wrapper">

    <div class="edit-add-field-wrapper">

      <div class="input-text">
        <p>Name</p>
        <input type="text" name="name" v-model="faculty.name">
      </div>

      <div class="input-text">
        <p>Short_Name</p>
        <input type="text" name="short_name" v-model="faculty.short_name">
      </div>
    </div>

    <button @click="updateFaculty">Update</button>
    <button>
      <router-link to="/faculty">Back</router-link>
    </button>
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
      this.$router.push('/faculty')
    }
  },
}
</script>

<style scoped>


</style>