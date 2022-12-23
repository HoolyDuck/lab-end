<template>
  <router-link class="icon" to="/schedule/add">
    <i class="fa-solid fa-plus"></i>
    <p class="cool-text bold"> Add</p>
  </router-link>
  <Table :columns="columns" :rows="schedules" entity="schedule"></Table>

</template>

<script>

import Table from "../layouts/Table.vue";
import ScheduleService from "./ScheduleService";

export default {
  name: "ScheduleTable",
  components: {Table},
  data: () => ({
    columns: ["ID","Classroom", "Name"  ,"Time" , "Group_ID", "Teacher_ID", "Discipline_ID"],
    schedules: []
  }),
  methods: {
    getAllSchedules() {
      ScheduleService.getAllSchedules().then((response) => this.schedules = response.data)
    },
  },
  created() {
    this.getAllSchedules()
  }

}
</script>

<style scoped>

</style>