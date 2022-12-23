<template>
  <div class="flex center">
    <p class="cool-text bolder">Delete Teacher</p>
    <div class="edit-add-wrapper">
      <div class="edit-add-field-wrapper">
        <p>Are you sure?</p>
      </div>
      <p class="error-text" v-if="showError">Something went wrong...</p>
      <button @click="deleteTeacher">Yes</button>
      <BackButton to="/teacher"></BackButton>
      </div>
  </div>
</template>

<script>
import TeacherService from "./TeacherService";
import BackButton from "../layouts/BackButton.vue";

export default {
  name: "TeacherDelete",
  components: {BackButton},
  data: () => ({
    showError: false
  }),
  methods: {
    deleteTeacher() {
      TeacherService.deleteTeacher(this.$route.params.id)
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