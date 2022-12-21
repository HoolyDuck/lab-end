<template>

  <div class="edit-add-wrapper">

    <div class="edit-add-field-wrapper">
  <div class="input-text">
    <p>Name</p>
    <input type="text" name = "name" v-model="teacher.name">
  </div>

  <div class="input-text">
    <p>Surname</p>
    <input type="text" name="surname" v-model="teacher.surname">
  </div>

  <div class="input-text">
    <p>Email</p>
    <input type="text" name="email" v-model="teacher.email">
  </div>

  <div class="input-text">
    <p>Phone</p>
    <input type="text" name="phone" v-model="teacher.phone">
  </div>

  <div class="input-text">
    <p>Department_Id</p>
    <input type="text" name="department" v-model="teacher.department_id">
  </div>
    </div>
  <button @click="addTeacher">Add</button>
  <button><router-link to="/teacher">Back</router-link></button>
  </div>
</template>

<script>

import TeacherService from "./TeacherService";

export default {
  name: "TeacherAdd",
  data: () => ({
    teacher: {
      email: "",
      name: "",
      phone: "",
      surname: "",
      department_id:0
    }
  }),
  methods: {
    addTeacher() {
      TeacherService.addTeacher(this.teacher)
      this.$router.push('/teacher')
    }
  }
}
</script>

<style scoped>

</style>