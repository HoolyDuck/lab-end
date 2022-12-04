<template>
  <p>Are you sure?</p>
  <button @click="deleteTeacher">Yes</button>
  <button>
    <router-link to="/teacher">No</router-link>
  </button>
</template>

<script>
import TeacherService from "./TeacherService";

export default {
  name: "TeacherDelete",
  methods: {
    deleteTeacher() {
      TeacherService.deleteTeacher(this.$route.params.id)
      this.$router.push('/teacher')
    }
  },
}
</script>

<style scoped>

</style>