<template>
  <Table :columns="columns" :rows="news" entity="new"></Table>
  <button>
    <router-link to="/new/add">Add</router-link>
  </button>
  <button>
    <router-link to="/">Back</router-link>
  </button>
</template>

<script>

import Table from "../layouts/Table.vue";
import NewService from "./NewService";

export default {
  name: "NewTable",
  components: {Table},
  data: () => ({
    columns: ["ID", "Date", "Text", "Subject"],
    news: []
  }),
  methods: {
    getAllNews() {
      NewService.getAllNews().then((response) => this.teachers = response.data)
    },
  },
  created() {
    this.getAllNews()
  }

}
</script>

<style scoped>

</style>