<template>
  <p>Are you sure?</p>
  <button @click="deleteDiscipline">Yes</button>
  <button>
    <router-link to="/discipline">No</router-link>
  </button>
</template>

<script>

import DisciplineService from "./DisciplineService";

export default {
  name: "DisciplineDelete",
  methods: {
    deleteDiscipline() {
      DisciplineService.deleteDiscipline(this.$route.params.id)
      this.$router.push('/discipline')
    }
  },
}
</script>

<style scoped>

</style>