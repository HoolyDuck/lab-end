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
    <CommitButton @click="updateDiscipline"></CommitButton>
    <BackButton to="/discipline"></BackButton>
  </div>
  </div>
</template>

<script>
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";
import DisciplineService from "./DisciplineService";

export default {
  name: "DisciplineEdit",
  components: {
    CommitButton,
    BackButton
  },
  data: () => ({
    discipline: {
      name: ""
    }
  }),
  methods: {
    updateDiscipline() {
      DisciplineService.updateDiscipline(this.discipline, this.$route.params.id).then( this.$router.go('/discipline'))
    }
  }
}
</script>

<style scoped>

</style>