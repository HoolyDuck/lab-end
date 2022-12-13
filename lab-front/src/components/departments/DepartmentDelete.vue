<template>
<p>Are you sure?</p>
  <button @click="deleteDepartment">Yes</button>
  <button>No</button>
</template>

<script>
import DepartmentService from "./DepartmentService";

export default {
  name: "DepartmentDelete",
  methods: {
    deleteDepartment() {
      DepartmentService.deleteDepartment(this.$route.params.id)
    }
  },
}
</script>

<style scoped>

</style>