<template>
  <router-link class="icon" to="/student/add">
    <i class="fa-solid fa-plus"></i>
    <p class="cool-text bold"> Add</p>
  </router-link>
  <Table :columns="columns" :rows="students" entity="student"></Table>

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