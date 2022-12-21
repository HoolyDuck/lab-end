<template>
  <div class="edit-add-wrapper">

    <div class="edit-add-field-wrapper">
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
    <input v-model="student.group_id">
  </div>

    </div>
  <button @click="addStudent">Add</button>

  </div>
</template>

<script>
import StudentService from "./StudentService";
export default {

  name: "StudentAdd",
  data: () => ({
    student: {
      name: "",
      email: "",
      phone: "",
      group_id: 0
    }
  }),
  methods: {
    addStudent() {
      StudentService.addStudent(this.student)
    }
  }
}
</script>

<style scoped>


</style>