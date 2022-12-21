<template>
  <div class="edit-add-wrapper">

    <div class="edit-add-field-wrapper">
      <div class="input-text">
        <p>Name</p>
        <input type="text" v-model="department.name">
      </div>

      <div class="input-text">
        <p>Short name</p>
        <input type="text" v-model="department.short_name">
      </div>

      <div class="input-text">
        <p>Faculty ID</p>
        <input type="number" v-model="department.faculty_id">

      </div>
    </div>

    <button class="wide-button" @click="addDepartment">Add</button>

  </div>


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