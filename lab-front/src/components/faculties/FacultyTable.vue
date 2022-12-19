<template>
  <Table :columns="columns" :rows="faculties" entity="faculty"></Table>
    <router-link to="/faculty/add"><img class="add_but" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFMCQy3gEyULvSfGBuNMDwuJof_4GCsx42LnCGwAIYT3KrxYPRoN-Sng779xxYlW_Bj2I&usqp=CAU"></router-link>
    <router-link to="/"><img class="back" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWYHt9NT496QIJVyQoZzu2yPJjcp0obnYgIr-irZ-0wreRazh54BvYPTJrW8HbuC93QGc&usqp=CAU"></router-link>
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