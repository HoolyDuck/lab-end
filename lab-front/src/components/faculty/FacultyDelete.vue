<template>
<p>Are you sure?</p>
  <button @click="deleteFaculty">Yes</button>
  <button>No</button>
</template>

<script>
import FacultyService from "./FacultyService";

export default {
  name: "FacultyDelete",
  methods: {
    deleteFaculty() {
      FacultyService.deleteFaculty(this.$route.params.id).then((response) => (console.log(response)))
    }
  },
}
</script>

<style scoped>

</style>