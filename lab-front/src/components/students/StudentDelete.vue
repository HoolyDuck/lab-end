<template>
  <p>Are you sure?</p>
  <button @click="deleteStudent">Yes</button>
  <button>No</button>
</template>

<script>
import StudentService from "./StudentService";

export default {
  name: "StudentDelete",
  methods: {
    deleteStudent() {
      StudentService.deleteStudent(this.$route.params.id)
    }
  },
}
</script>

<style scoped>

</style>