<template>
  <div class="flex center">
    <p class="cool-text bolder">Add Discipline</p>
    <div class="edit-add-wrapper">

      <div class="edit-add-field-wrapper">

        <div class="input-text">
          <p>Name</p>
          <input type="text" name="name" v-model="discipline.name">
        </div>
      </div>
      <div class="error-text" v-if="showError">{{ errorText }}</div>
      <CommitButton @click="addDiscipline"></CommitButton>
      <BackButton to="/discipline"></BackButton>
    </div>
  </div>

</template>

<script>

import DisciplineService from "./DisciplineService";
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";
import crudErrorHandler from "../../error_handlers/crudErrorHandler";

export default {
  name: "DisciplineAdd",
  components: {BackButton, CommitButton},
  data: () => ({
    discipline: {
      name: ""
    },
    showError: false,
    errorText: ""
  }),
  methods: {
    addDiscipline() {
      DisciplineService.addDiscipline(this.discipline).then(() => {
        this.$router.push('/discipline')
      })
          .catch(err => {
            this.showError = true
            this.errorText = crudErrorHandler.catchError(err)
          });

    }
  }
}
</script>

<style scoped>

</style>