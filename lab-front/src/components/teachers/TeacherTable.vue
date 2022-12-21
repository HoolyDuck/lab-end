<template>
  <Table :columns="columns" :rows="teachers" entity="teacher"></Table>
  <router-link to="/teacher/add">Add</router-link>
  <router-link to="/">Back</router-link>
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