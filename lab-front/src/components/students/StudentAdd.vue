<template>

  <div class="flex center">
    <p class="cool-text bolder">Add Student</p>
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
    <CommitButton @click="addStudent">Add</CommitButton>
    <BackButton to="/student"></BackButton>
  </div>
  </div>
</template>

<script>
import StudentService from "./StudentService";
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";

export default {

  name: "StudentAdd",
  components: {BackButton, CommitButton},
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