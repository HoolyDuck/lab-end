<template>
  <Table :columns="columns" :rows="schedules" entity="schedule"></Table>
  <router-link to="/schedule/add">Add</router-link>
  <router-link to="/">Back</router-link>
</template>

<script>

import Table from "../layouts/Table.vue";
import ScheduleService from "./ScheduleService";

export default {
  name: "ScheduleTable",
  components: {Table},
  data: () => ({
    columns: ["ID", "Name", "Group_ID", "Teacher_ID", "Discipline_ID", "Time", "Classroom"],
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