<template>
  <div class="flex center">
    <p class="cool-text bolder">Delete Faculty</p>
    <div class="edit-add-wrapper">
      <div class="edit-add-field-wrapper">
        <p>Are you sure?</p>
      </div>
      <p class="error-text" v-if="showError">Something went wrong...</p>
      <button class="wide-button" @click="deleteFaculty">Yes</button>
      <BackButton to="/faculty"></BackButton>
    </div>
  </div>
</template>

<script>
import FacultyService from "./FacultyService";
import BackButton from "../layouts/BackButton.vue";

export default {
  name: "FacultyDelete",
  components: {BackButton},
  data: () => ({
    showError: false
  }),
  methods: {
    deleteFaculty() {
      FacultyService.deleteFaculty(this.$route.params.id)
          .then(() => {
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