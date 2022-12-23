<template>
  <div class="flex center">
    <p class="cool-text bolder">Delete News</p>
    <div class="edit-add-wrapper">
      <div class="edit-add-field-wrapper">
        <p>Are you sure?</p>
      </div>
      <p class="error-text" v-if="showError">Something went wrong...</p>
      <button class="wide-button" @click="deleteNew">Yes</button>
      <BackButton to="/new"></BackButton>
    </div>
  </div>
</template>

<script>

import NewService from "./NewService";
import BackButton from "../layouts/BackButton.vue";

export default {
  name: "NewDelete",
  components: {BackButton},
  data: () => ({
    showError: false
  }),
  methods: {
    deleteNew() {
      NewService.deleteNew(this.$route.params.id).then(() => {
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