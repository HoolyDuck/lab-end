<template>
  <router-link class="icon" to="/department/add">
      <i class="fa-solid fa-plus"></i>
    <p class="cool-text bold"> Add</p>
  </router-link>
  <Table :columns="columns" :rows="departments" entity="department"></Table>

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