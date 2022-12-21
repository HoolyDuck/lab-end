<template>

  <div class="flex center">
    <p class="cool-text bolder">Edit Schedule</p>
    <div class="edit-add-wrapper">

      <div class="edit-add-field-wrapper">

        <div class="input-text">
          <p>Classroom</p>
          <input type="text" name="classroom" v-model="schedule.classroom">
        </div>

        <div class="input-text">
          <p>Name</p>
          <input type="text" name="name" v-model="schedule.name">
        </div>

        <div class="input-text">
          <p>Time</p>
          <input type="text" name="time" v-model="schedule.time">
        </div>

        <div class="input-text">
          <p>Discipline_Id</p>
          <input type="text" name="department" v-model="schedule.discipline_id">
        </div>

        <div class="input-text">
          <p>Teacher_Id</p>
          <input type="text" name="department" v-model="schedule.teacher_id">
        </div>

        <div class="input-text">
          <p>Group_Id</p>
          <input type="text" name="department" v-model="schedule.group_id">
        </div>
      </div>
      <CommitButton @click="upgradeSchedule">Edit</CommitButton>
      <BackButton to="/schedule"></BackButton>
    </div>
  </div>
</template>

<script>

import ScheduleService from "./ScheduleService";
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";

export default {
  name: "ScheduleEdit",
  components: {BackButton, CommitButton},
  data: () => ({
    schedule: {
      classroom: "",
      name: "",
      time: "",
      discipline_id: 0,
      teacher_id: 0,
      group_id: 0
    }
  }),
  methods: {
    upgradeSchedule() {
      ScheduleService.updateSchedule(this.schedule, this.$route.params.id)
      this.$router.push('/schedule')
    }
  }
}
</script>

<style scoped>

</style>