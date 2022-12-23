<template>
  <div class="flex center">
    <p class="cool-text bolder">Delete Student</p>
    <div class="edit-add-wrapper">
      <div class="edit-add-field-wrapper">
        <p>Are you sure?</p>
      </div>
      <p class="error-text" v-if="showError">Something went wrong...</p>
      <button class="wide-button" @click="deleteStudent">Yes</button>
      <BackButton to="/student"></BackButton>
    </div>
  </div>
</template>

<script>
import StudentService from "./StudentService";
import BackButton from "../layouts/BackButton.vue";

export default {
  name: "StudentDelete",
  components: {BackButton},
  data: () => ({
    showError: false
  }),
  methods: {
    deleteStudent() {
      StudentService.deleteStudent(this.$route.params.id)
          .then(() => {
            this.$router.push('/student')
          }).catch(err => {
        this.showError = true
      })
    }
  },
}
</script>

<style scoped>

</style>