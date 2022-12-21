<template>
  <div class="edit-add-wrapper">

    <div class="edit-add-field-wrapper">>
  <div class="input-text">
    <p>Name</p>
    <input type="text" name="name" v-model="teacher.name">
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
  <button @click="upgradeTeacher">Update</button>
  <button>
    <router-link to="/teacher">Back</router-link>
  </button>
  </div>
</template>

<script>
import TeacherService from "./TeacherService";

export default {
  name: "TeacherEdit",
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
    upgradeTeacher() {
      TeacherService.updateTeacher(this.teacher, this.$route.params.id)
      this.$router.push('/teacher')
    }
  }
}
</script>

<style scoped>

</style>