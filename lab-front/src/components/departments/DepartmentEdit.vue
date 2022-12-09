<template>
  <div class="input-text">
    <p>Name</p>
    <input type="text"  v-model="department.name">
  </div>

  <div class="input-text">
    <p>Short name</p>
    <input type="text"  v-model="department.short_name">
  </div>

  <div class="input-text">
    <p>Faculty ID</p>
    <input  v-model="department.faculty_id">
  </div>



  <button @click="updateDepartment">Update</button>
</template>

<script>
import DepartmentService from "./DepartmentService";

export default {

  name: "DepartmentEdit",
  data: () => ({
    department: {
      name: "",
      short_name: "",
      faculty_id: 0
    }
  }),
  methods: {
    updateDepartment() {
DepartmentService.updateDepartment(this.department, this.$route.params.id)
    }
  },
}
</script>

<style scoped>


</style>