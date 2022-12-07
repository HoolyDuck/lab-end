<template>
  <div class="input-text">
    <p>Date</p>
    <input type="date" name = "date" v-model="New.date">
  </div>

  <div class="input-text">
    <p>Text</p>
    <input type="text" name="text" v-model="New.text">
  </div>

  <div class="input-text">
    <p>Subject(ID)</p>
    <input type="text" name="subject" v-model="New.discipline.id">
  </div>

  <button @click="addNew">Add</button>
  <button><router-link to="/new">Back</router-link></button>
</template>

<script>

import NewService from "./NewService";

export default {
  name: "NewAdd",
  data: () => ({
    New: {
      date:"",
      text:"",
      discipline:{
        id:0
      }
    }
  }),
  methods: {
    addNew() {
      NewService.addNew(this.New)
      this.$router.push('/new')
    }
  }
}
</script>

<style scoped>

</style>