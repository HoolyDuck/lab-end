<template>
  <p>Are you sure?</p>
  <button @click="deleteFaculty">Yes</button>
  <button>
    <router-link to="/faculty">No</router-link>
  </button>
</template>

<script>
import FacultyService from "./FacultyService";

export default {
  name: "FacultyDelete",
  methods: {
    deleteFaculty() {
      FacultyService.deleteFaculty(this.$route.params.id)
      this.$router.push('/faculty')
    }
  },
}
</script>

<style scoped>

</style>