<template>
  <router-link class="icon" to="/teacher/add">
    <i class="fa-solid fa-plus"></i>
    <p class="cool-text bold"> Add</p>
  </router-link>
  <Table :columns="columns" :rows="teachers" entity="teacher"></Table>

</template>

<script>

import Table from "../layouts/Table.vue";
import TeacherService from "./TeacherService";

export default {
  name: "TeacherTable",
  components: {Table},
  data: () => ({
    columns: ["ID", "Name", "Surname", "Email", "Phone", "Department_ID"],
    teachers: []
  }),
  methods: {
    getAllTeachers() {
      TeacherService.getAllTeachers().then((response) => this.teachers = response.data)
    },
  },
  created() {
    this.getAllTeachers()
  }

}
</script>

<style scoped>

</style>