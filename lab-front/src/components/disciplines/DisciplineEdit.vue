<template>

  <div class="edit-add-wrapper">

    <div class="edit-add-field-wrapper">
      <div class="input-text">
        <p>Name</p>
        <input type="text" name="name" v-model="discipline.name">
      </div>
    </div>
    <button @click="updateDiscipline">Add</button>
    <button>
      <router-link to="/discipline">Back</router-link>
    </button>
  </div>
</template>

<script>

import DisciplineService from "./DisciplineService";

export default {
  name: "DisciplineEdit",
  data: () => ({
    discipline: {
      name: ""
    }
  }),
  methods: {
    updateDiscipline() {
      DisciplineService.updateDiscipline(this.discipline, this.$route.params.id)
      this.$router.push('/discipline')
    }
  }
}
</script>

<style scoped>

</style>