<template>
  <Table :columns="columns" :rows="news" entity="new"></Table>
  <router-link to="/new/add"><img class="add_but" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFMCQy3gEyULvSfGBuNMDwuJof_4GCsx42LnCGwAIYT3KrxYPRoN-Sng779xxYlW_Bj2I&usqp=CAU"></router-link>
  <router-link to="/"><img class="back" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWYHt9NT496QIJVyQoZzu2yPJjcp0obnYgIr-irZ-0wreRazh54BvYPTJrW8HbuC93QGc&usqp=CAU"></router-link>
</template>

<script>

import Table from "../layouts/Table.vue";
import NewService from "./NewService";

export default {
  name: "NewTable",
  components: {Table},
  data: () => ({
    columns: ["ID", "Subject", "Text", "Date"],
    news: []
  }),
  methods: {
    getAllNews() {
      NewService.getAllNews().then((response) => this.news = response.data)
    },
  },
  created() {
    this.getAllNews()
  }

}
</script>

<style scoped>

</style>