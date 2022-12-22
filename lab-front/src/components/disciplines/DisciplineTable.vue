<template>
  <router-link class="icon" to="/discipline/add">
    <i class="fa-solid fa-plus"></i>
    <p class="cool-text bold"> Add</p>
  </router-link>
  <Table :columns="columns" :rows="disciplines" entity="discipline"></Table>

</template>

<script>

import Table from "../layouts/Table.vue";
import DisciplineService from "./DisciplineService";

export default {
  name: "DisciplineTable",
  components: {Table},
  data: () => ({
    columns: ["ID", "Name"],
    disciplines: []
  }),
  methods: {
    getAllDisciplines() {
      DisciplineService.getAllDisciplines().then((response) => this.disciplines = response.data)
    },
  },
  created() {
    this.getAllDisciplines()
  }

}
</script>

<style scoped>

</style>