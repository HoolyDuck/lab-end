<template>
  <Table :columns="columns" :rows="groups" entity="group"></Table>
  <button><router-link to="/group/add">Add</router-link></button>
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