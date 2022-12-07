<template>
  <p>Are you sure?</p>
  <button @click="deleteSchedule">Yes</button>
  <button>
    <router-link to="/schedule">No</router-link>
  </button>
</template>

<script>

import ScheduleService from "./ScheduleService";

export default {
  name: "ScheduleDelete",
  methods: {
    deleteSchedule() {
      ScheduleService.deleteSchedule(this.$route.params.id)
      this.$router.push('/schedule')
    }
  },
}
</script>

<style scoped>

</style>