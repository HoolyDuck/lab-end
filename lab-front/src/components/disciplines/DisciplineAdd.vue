<template>
  <div class="edit-add-wrapper">

    <div class="edit-add-field-wrapper">

      <div class="input-text">
        <p>Name</p>
        <input type="text" name="name" v-model="discipline.name">
      </div>
    </div>
    <button @click="addDiscipline">Add</button>
    <button>
      <router-link to="/discipline">Back</router-link>
    </button>
  </div>
</template>

<script>

import DisciplineService from "./DisciplineService";

export default {
  name: "DisciplineAdd",
  data: () => ({
    discipline: {
      name: ""
    }
  }),
  methods: {
    addDiscipline() {
      DisciplineService.addDiscipline(this.discipline)
      this.$router.push('/discipline')
    }
  }
}
</script>

<style scoped>

</style>