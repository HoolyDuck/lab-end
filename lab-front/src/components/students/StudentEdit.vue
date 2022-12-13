<template>
  <div class="input-text">
    <p>Name</p>
    <input type="text" v-model="student.name">
  </div>

  <div class="input-text">
    <p>Email</p>
    <input type="text" v-model="student.email">
  </div>

  <div class="input-text">
    <p>Phone</p>
    <input type="text" v-model="student.phone">
  </div>

  <div class="input-text">
    <p>Group ID</p>
    <input v-model="student.group.id">
  </div>


  <button @click="updateStudent">Update</button>
</template>

<script>
import StudentService from "./StudentService";
export default {

  name: "StudentEdit",
  data: () => ({
    student: {
      name: "",
      email: "",
      phone: "",
      group: {
        id: 0
      }
    }
  }),
  methods: {
    updateStudent() {
      StudentService.updateStudent(this.student, this.$route.params.id)
    }
  },
}
</script>

<style scoped>


</style>