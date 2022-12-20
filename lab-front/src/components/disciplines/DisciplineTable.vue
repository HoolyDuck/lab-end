<template>
  <Table :columns="columns" :rows="disciplines" entity="discipline"></Table>
  <button>
    <router-link to="/discipline/add">Add</router-link>
  </button>
  <button>
    <router-link to="/">Back</router-link>
  </button>
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