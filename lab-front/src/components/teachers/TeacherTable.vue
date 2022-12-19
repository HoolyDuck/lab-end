<template>
  <Table :columns="columns" :rows="teachers" entity="teacher"></Table>
  <router-link to="/teacher/add"><img class="add_but" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFMCQy3gEyULvSfGBuNMDwuJof_4GCsx42LnCGwAIYT3KrxYPRoN-Sng779xxYlW_Bj2I&usqp=CAU"></router-link>
  <router-link to="/"><img class="back" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWYHt9NT496QIJVyQoZzu2yPJjcp0obnYgIr-irZ-0wreRazh54BvYPTJrW8HbuC93QGc&usqp=CAU"></router-link>
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