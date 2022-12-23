<template>
  <div class="flex center">
    <p class="cool-text bolder">Delete Discipline</p>
    <div class="edit-add-wrapper">
      <div class="edit-add-field-wrapper">
        <p>Are you sure?</p>
      </div>
        <p class="error-text" v-if="showError">Something went wrong...</p>
        <button class="wide-button" @click="deleteDiscipline">Yes</button>
        <BackButton to="/discipline"></BackButton>
      </div>
    </div>

</template>

<script>

import DisciplineService from "./DisciplineService";
import BackButton from "../layouts/BackButton.vue";

export default {
  name: "DisciplineDelete",
  components: {BackButton},
  data: () => ({
    showError: false
  }),
  methods: {
    deleteDiscipline() {
      DisciplineService.deleteDiscipline(this.$route.params.id).then(() => {
        this.$router.push('/discipline')
      }).catch(err => {
        this.showError = true
      });
    }
  },
}
</script>

<style scoped>

</style>