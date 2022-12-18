<template>
  <div>
    <div class="schedules" v-for="sch in schedules">
      <h1 class="sch_title">{{ sch.name }}</h1>
      <h3 class="sch_subject">{{ sch.disciplineId.name +" in classroom "+ sch.classroom }}</h3>
      <h3 class="sch_date">Time: {{ sch.time }}</h3>
      <h3 class="sch_group">Group: {{ sch.groupId.name }}</h3>
      <h3 class="sch_teacher">Teacher: {{sch.teacherId.name+" "+sch.teacherId.surname}}</h3>
    </div>
  </div>
</template>

<script>
import ScheduleService from "./ScheduleService";

export default {
  name: "SchedulesPage",
  data: () => ({
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