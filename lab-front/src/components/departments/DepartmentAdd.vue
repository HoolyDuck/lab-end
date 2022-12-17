<template>
  <div class="input-text">
    <p>Name</p>
    <input type="text" v-model="department.name">
  </div>
  <div class="input-text">
    <p>Name</p>
    <input type="text" v-model="department.short_name">
  </div>

  <div class="input-text">
    <p>Faculty ID</p>
    <input type="number" v-model="department.faculty_id">
  </div>


  <button @click="addDepartment">Add</button>
</template>

<script>

import DepartmentService from "./DepartmentService";

export default {


  name: "DepartmentAdd",
  data: () => ({
    department: {
      name: "",
      short_name: "",
      faculty_id: 0
    }
  }),
  methods: {
    addDepartment() {
      DepartmentService.addDepartment(this.department);
    }
  }
}
</script>

<style scoped>


</style>