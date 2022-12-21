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
      <CommitButton @click="addDiscipline"></CommitButton>
      <BackButton to="/discipline"></BackButton>
    </div>
  </div>

</template>

<script>

import DisciplineService from "./DisciplineService";
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";

export default {
  name: "DisciplineAdd",
  components: {BackButton, CommitButton},
  data: () => ({
    discipline: {
      name: ""
    }
  }),
  methods: {
    addDiscipline() {
      DisciplineService.addDiscipline(this.discipline).then( this.$router.go('/discipline'))

    }
  }
}
</script>

<style scoped>

</style>