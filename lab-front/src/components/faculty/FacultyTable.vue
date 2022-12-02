<template>
  <Table :columns="columns" :rows="faculties" entity="faculty"></Table>
  <button><router-link to="/faculty/add">Add</router-link></button>
</template>

<script>
import Table from "../layouts/Table.vue";
import FacultyService from "./FacultyService";

export default {
  name: "FacultyTable",

  components: {Table},
  data: () => ({
    columns: ["ID", "Name", "University"],
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