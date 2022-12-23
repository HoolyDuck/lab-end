<template>
  <div class="flex center">
    <p class="cool-text bolder">Delete Department</p>
    <div class="edit-add-wrapper">
      <div class="edit-add-field-wrapper">
        <p>Are you sure?</p>
      </div>
      <p class="error-text" v-if="showError">Something went wrong...</p>
      <button class="wide-button" @click="deleteDepartment">Yes</button>
      <BackButton to="/department"></BackButton>
    </div>
  </div>
</template>

<script>
import DepartmentService from "./DepartmentService";
import BackButton from "../layouts/BackButton.vue";

export default {
  name: "DepartmentDelete",
  components: {BackButton},
  data: () => ({
    showError: false
  }),
  methods: {
    deleteDepartment() {
      DepartmentService.deleteDepartment(this.$route.params.id).then(() => {
        this.$router.push('/department')
      }).catch(err => {
        this.showError = true
      });
    }
  },
}
</script>

<style scoped>

</style>