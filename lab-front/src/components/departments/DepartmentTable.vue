<template>
  <Table :columns="columns" :rows="departments" entity="department"></Table>
  <router-link to="/department/add">Add</router-link>
  <router-link to="/">Back</router-link>
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