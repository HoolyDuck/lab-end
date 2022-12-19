<template>
  <Table :columns="columns" :rows="students" entity="student"></Table>
  <router-link to="/student/add"><img class="add_but" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFMCQy3gEyULvSfGBuNMDwuJof_4GCsx42LnCGwAIYT3KrxYPRoN-Sng779xxYlW_Bj2I&usqp=CAU"></router-link>
  <router-link to="/"><img class="back" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWYHt9NT496QIJVyQoZzu2yPJjcp0obnYgIr-irZ-0wreRazh54BvYPTJrW8HbuC93QGc&usqp=CAU"></router-link>
</template>

<script>
import Table from "../layouts/Table.vue";
import StudentService from "./StudentService";

export default {
  name: "StudentTable",

  components: {Table},
  data: () => ({
    columns: ["ID", "Name", "Email", "Phone", "Group_id"],
    students: []
  }),
  methods: {
    getAllStudents() {
      StudentService.getAllStudents().then((response) => this.students = response.data)
    }
  },
  created() {
    this.getAllStudents()
  }

}
</script>

<style scoped>

</style>