<template>
  <Table :columns="columns" :rows="disciplines" entity="discipline"></Table>
  <router-link to="/discipline/add"><img class="add_but" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFMCQy3gEyULvSfGBuNMDwuJof_4GCsx42LnCGwAIYT3KrxYPRoN-Sng779xxYlW_Bj2I&usqp=CAU"></router-link>
  <router-link to="/"><img class="back" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWYHt9NT496QIJVyQoZzu2yPJjcp0obnYgIr-irZ-0wreRazh54BvYPTJrW8HbuC93QGc&usqp=CAU"></router-link>
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