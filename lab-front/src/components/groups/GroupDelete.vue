<template>
  <div class="flex center">
    <p class="cool-text bolder">Delete Group</p>
    <div class="edit-add-wrapper">
      <div class="edit-add-field-wrapper">
        <p>Are you sure?</p>
      </div>
      <p class="error-text" v-if="showError">Something went wrong...</p>
      <button class="wide-button" @click="deleteGroup">Yes</button>
      <BackButton to="/group"></BackButton>
    </div>
  </div>
</template>

<script>
import GroupService from "./GroupService";
import BackButton from "../layouts/BackButton.vue";

export default {
  name: "GroupDelete",
  components: {BackButton},
  data: () => ({
    showError: false
  }),
  methods: {
    deleteGroup() {
      GroupService.deleteGroup(this.$route.params.id).then(() => {
        this.$router.push('/department')
      }).catch(err => {
        this.showError = true
      })
    }
  },
}
</script>

<style scoped>

</style>