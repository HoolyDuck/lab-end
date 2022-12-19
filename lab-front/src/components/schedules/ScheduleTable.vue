<template>
  <Table :columns="columns" :rows="schedules" entity="schedule"></Table>
  <router-link to="/schedule/add"><img class="add_but" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFMCQy3gEyULvSfGBuNMDwuJof_4GCsx42LnCGwAIYT3KrxYPRoN-Sng779xxYlW_Bj2I&usqp=CAU"></router-link>
  <router-link to="/"><img class="back" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWYHt9NT496QIJVyQoZzu2yPJjcp0obnYgIr-irZ-0wreRazh54BvYPTJrW8HbuC93QGc&usqp=CAU"></router-link>
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