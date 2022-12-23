<template>
  <div class="flex center">
    <p class="cool-text bolder">Delete Schedule</p>
    <div class="edit-add-wrapper">
      <div class="edit-add-field-wrapper">
        <p>Are you sure?</p>
      </div>
      <p class="error-text" v-if="showError">Something went wrong...</p>
      <p>Are you sure?</p>
      <button class="wide-button" @click="deleteSchedule">Yes</button>
      <BackButton to="/schedule"></BackButton>
    </div>
  </div>
</template>

<script>

import ScheduleService from "./ScheduleService";
import BackButton from "../layouts/BackButton.vue";

export default {
  name: "ScheduleDelete",
  components: {BackButton},
  data: () => ({
    showError: false
  }),
  methods: {
    deleteSchedule() {
      ScheduleService.deleteSchedule(this.$route.params.id)
          .then(() => {
            this.$router.push('/new')
          }).catch(err => {
        this.showError = true
      })
    }
  },
}
</script>

<style scoped>

</style>