<template>
  <div class="edit-add-wrapper">

    <div class="edit-add-field-wrapper">

  <div class="input-text">
    <p>Date</p>
    <input type="date" name = "date" v-model="New.date">
  </div>

  <div class="input-text">
    <p>Text</p>
    <input type="text" name="text" v-model="New.text">
  </div>

  <div class="input-text">
    <p>Title</p>
    <input type="text" name="subject" v-model="New.title">
  </div>

  <div class="input-text">
    <p>Img</p>
    <input type="text" name="subject" v-model="New.img">
  </div>

    </div>
  <button @click="addNew">Add</button>
  <button><router-link to="/new">Back</router-link></button>
  </div>
</template>

<script>

import NewService from "./NewService";

export default {
  name: "NewAdd",
  data: () => ({
    New: {
      date:"",
      text:"",
      title:"",
      img:""
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