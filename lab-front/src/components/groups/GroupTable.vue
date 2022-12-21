<template>
  <Table :columns="columns" :rows="groups" entity="group"></Table>
  <router-link to="/group/add"><img class="add_but" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFMCQy3gEyULvSfGBuNMDwuJof_4GCsx42LnCGwAIYT3KrxYPRoN-Sng779xxYlW_Bj2I&usqp=CAU"></router-link>
  <router-link to="/"><img class="back" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWYHt9NT496QIJVyQoZzu2yPJjcp0obnYgIr-irZ-0wreRazh54BvYPTJrW8HbuC93QGc&usqp=CAU"></router-link>
</template>

<script>
import Table from "../layouts/Table.vue";
import GroupService from "./GroupService";

export default {
  name: "GroupTable",

  components: {Table},
  data: () => ({
    columns: ["ID",  "Course", "Name","Department ID"],
    groups: []
  }),
  methods: {
    getAllGroups() {
      GroupService.getAllGroups().then((response) => this.groups = response.data)
    }
  },
  created() {
    this.getAllGroups()
  }

}
</script>

<style scoped>

</style>