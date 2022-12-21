<template>
  <Table :columns="columns" :rows="faculties" entity="faculty"></Table>
    <router-link to="/faculty/add">Add</router-link>
    <router-link to="/">Back</router-link>
</template>

<script>
import Table from "../layouts/Table.vue";
import FacultyService from "./FacultyService";

export default {
  name: "FacultyTable",

  components: {Table},
  data: () => ({
    columns: ["ID", "Name", "Short_Name"],
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