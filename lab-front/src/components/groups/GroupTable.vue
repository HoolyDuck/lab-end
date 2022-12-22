<template>
  <router-link class="icon" to="/group/add">
    <i class="fa-solid fa-plus"></i>
    <p class="cool-text bold"> Add</p>
  </router-link>
  <Table :columns="columns" :rows="groups" entity="group"></Table>

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