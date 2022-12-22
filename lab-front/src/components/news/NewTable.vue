<template>
  <router-link class="icon" to="/new/add">
    <i class="fa-solid fa-plus"></i>
    <p class="cool-text bold"> Add</p>
  </router-link>
  <Table :columns="columns" :rows="news" entity="new"></Table>

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