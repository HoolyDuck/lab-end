<template>
  <Table :columns="columns" :rows="students" entity="student"></Table>
  <router-link to="/student/add">Add</router-link>
  <router-link to="/">Back</router-link>
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