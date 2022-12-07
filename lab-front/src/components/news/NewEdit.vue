<template>
  <div class="input-text">
    <p>Date</p>
    <input type="date" name="date" v-model="New.date">
  </div>

  <div class="input-text">
    <p>Text</p>
    <input type="text" name="text" v-model="New.text">
  </div>

  <div class="input-text">
    <p>Subject(ID)</p>
    <input type="text" name="subject" v-model="New.subject.id">
  </div>

  <button @click="upgradeNew">Upgrade</button>
  <button>
    <router-link to="/new">Back</router-link>
  </button>
</template>

<script>

import NewService from "./NewService";

export default {
  name: "NewEdit",
  data: () => ({
    New: {
      date: "",
      text: "",
      subject: {
        id: 0
      }
    }
  }),
  methods: {
    upgradeNew() {
      NewService.updateNew(this.New, this.$route.params.id)
      this.$router.push('/new')
    }
  }
}
</script>

<style scoped>

</style>