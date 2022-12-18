<template>
  <div>
    <div class="schedules" v-for="sch in schedules">
      <h1 class="sch_title">{{ sch.name }}</h1>
      <h3 class="sch_subject">{{ sch.discipline_id +" in classroom "+ sch.classroom }}</h3>
      <h3 class="sch_date">Time: {{ sch.time }}</h3>
      <h3 class="sch_group">Group: {{ sch.group_id }}</h3>
      <h3 class="sch_teacher">Teacher: {{sch.teacher_id.name+" "+sch.teacher_id.surname}}</h3>
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
      ScheduleService.getAllSchedules2().then((response) => this.schedules = response.data)
    },
  },
  created() {
    this.getAllSchedules()
  }
}
</script>

<style scoped>

</style>