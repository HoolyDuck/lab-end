<template>
  <Table :columns="columns" :rows="news" entity="new"></Table>
  <router-link to="/new/add">Add</router-link>
  <router-link to="/">Back</router-link>
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