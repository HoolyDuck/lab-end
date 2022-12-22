<template>
  <router-link class="icon" to="/faculty/add">
    <i class="fa-solid fa-plus"></i>
    <p class="cool-text bold"> Add</p>
  </router-link>
  <Table :columns="columns" :rows="faculties" entity="faculty"></Table>

</template>

<script>
import Table from "../layouts/Table.vue";
import FacultyService from "./FacultyService";

export default {
  name: "FacultyTable",

  components: {Table},
  data: () => ({
    columns: ["ID", "Name", "Short Name"],
    faculties: []
  }),
  methods: {
    getAllFaculties() {
      FacultyService.getAllFaculties().then((response) => this.faculties = response.data)
    }
  },
  created() {
    this.getAllFaculties()
  }

}
</script>

<style scoped>

</style>