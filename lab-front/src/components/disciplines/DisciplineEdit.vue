<template>
  <div class="flex center">
    <p class="cool-text bolder">Edit Discipline</p>
    <div class="edit-add-wrapper">

      <div class="edit-add-field-wrapper">
        <div class="input-text">
          <p>Name</p>
          <input type="text" name="name" v-model="discipline.name">
        </div>
      </div>
      <div class="error-text" v-if="showError">{{ errorText }}</div>
      <CommitButton @click="updateDiscipline"></CommitButton>
      <BackButton to="/discipline"></BackButton>
    </div>
  </div>
</template>

<script>
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";
import DisciplineService from "./DisciplineService";
import crudErrorHandler from "../../error_handlers/crudErrorHandler";

export default {
  name: "DisciplineEdit",
  components: {
    CommitButton,
    BackButton
  },
  data: () => ({
    discipline: {
      name: ""
    },
    showError: false,
    errorText: ""
  }),
  methods: {
    updateDiscipline() {
      DisciplineService.updateDiscipline(this.discipline, this.$route.params.id)
          .then(() => {
        this.$router.push('/discipline')
      })
          .catch(err => {
            this.showError = true
            this.errorText = crudErrorHandler.catchError(err)
          });
    }
  }}
</script>

<style scoped>

</style>