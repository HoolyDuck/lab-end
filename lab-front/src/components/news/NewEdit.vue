<template>
  <div class="flex center">
    <p class="cool-text bolder">Edit News</p>
    <div class="edit-add-wrapper">

      <div class="edit-add-field-wrapper">

        <div class="input-text">
          <p>Date</p>
          <input type="date" name="date" v-model="New.date">
        </div>

        <div class="input-text">
          <p>Title</p>
          <input type="text" name="subject" v-model="New.title">
        </div>

        <div class="input-text">
          <p>Text</p>
          <textarea name="text" v-model="New.text"/>
        </div>

      </div>
      <div class="error-text" v-if="showError">{{ errorText }}</div>
      <CommitButton @click="upgradeNew">Edit</CommitButton>
      <BackButton to="/new"></BackButton>

    </div>
  </div>
</template>

<script>

import NewService from "./NewService";
import BackButton from "../layouts/BackButton.vue";
import CommitButton from "../layouts/CommitButton.vue";
import crudErrorHandler from "../../error_handlers/crudErrorHandler";


export default {
  components: {CommitButton, BackButton},

  name: "NewEdit",
  data: () => ({
    New: {
      date: "",
      title: "",
      text: "",
      img: ""
    },
    showError: false,
    errorText: ""
  }),
  methods: {
    upgradeNew() {
      NewService.updateNew(this.New, this.$route.params.id).then(() => {
        this.$router.push('/new')
      })
          .catch(err => {
            this.showError = true
            this.errorText = crudErrorHandler.catchError(err)
          });
    }
  },
}
</script>

<style scoped>

</style>