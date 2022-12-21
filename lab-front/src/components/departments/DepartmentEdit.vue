<template>

  <div class="flex center">
    <p class="cool-text bolder">Edit Department</p>
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
          <input v-model="department.faculty_id">
        </div>
      </div>

      <CommitButton @click="updateDepartment"></CommitButton>
      <BackButton to="/department"></BackButton>

    </div>
  </div>
</template>

<script>
import DepartmentService from "./DepartmentService";
import BackButton from "../layouts/BackButton.vue";
import CommitButton from "../layouts/CommitButton.vue";

export default {

  name: "DepartmentEdit",
  components: {CommitButton, BackButton},

  data: () => ({
    department: {
      name: "",
      short_name: "",
      faculty_id: 0
    }
  }),
  methods: {
    updateDepartment() {
      DepartmentService.updateDepartment(this.department, this.$route.params.id).then(this.$router.push('/department'))
    }
  },
}
</script>

<style scoped>


</style>