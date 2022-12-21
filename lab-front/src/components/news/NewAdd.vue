<template>
  <div class="flex center">
    <p class="cool-text bolder">Add News</p>
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
        <textarea  name="text" v-model="New.text"/>
      </div>

      <div class="input-text">
        <p>Img</p>
        <input type="text" name="subject" v-model="New.img">
      </div>

    </div>

    <CommitButton @click="addNew"></CommitButton>
    <BackButton to="/new"></BackButton>

  </div>
  </div>
</template>

<script>

import NewService from "./NewService";
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";

export default {
  name: "NewAdd",
  components: {BackButton, CommitButton},

  data: () => ({
    New: {
      date: "",
      text: "",
      title: "",
      img: ""
    }
  }),
  methods: {
    addNew() {
      NewService.addNew(this.New).then(this.$router.go('/new'))
    }
  }
}
</script>

<style scoped>

</style>