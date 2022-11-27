<template>
  <Table :columns="columns" :rows="faculties"></Table>
</template>

<script>
import Table from "./layouts/Table.vue";
import FacultyService from "../services/FacultyService";

export default {
  name: "Faculty",
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