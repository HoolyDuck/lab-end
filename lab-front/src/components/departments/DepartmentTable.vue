<template>
  <Table :columns="columns" :rows="departments" entity="department"></Table>
  <router-link to="/department/add"><img class="add_but" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFMCQy3gEyULvSfGBuNMDwuJof_4GCsx42LnCGwAIYT3KrxYPRoN-Sng779xxYlW_Bj2I&usqp=CAU"></router-link>
  <router-link to="/"><img class="back" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWYHt9NT496QIJVyQoZzu2yPJjcp0obnYgIr-irZ-0wreRazh54BvYPTJrW8HbuC93QGc&usqp=CAU"></router-link>
</template>

<script>

import Table from "../layouts/Table.vue";
import DepartmentService from "./DepartmentService";

export default {
  name: "DepartmentTable",
  components: {Table},
  data: () => ({
    columns: ["ID", "Name", "Short Name", "Faculty ID"],
    departments: []
  }),
  methods: {
    getAllDepartments() {
      DepartmentService.getAllDepartments().then((response) => this.departments = response.data)
    }
  },
  created() {
    this.getAllDepartments()
  }
}
</script>

<style scoped>

</style>