<template>
  <div class="input-text">
    <p>Name</p>
    <input type="text" v-model="group.name">
  </div>

  <div class="input-text">
    <p>Course</p>
    <input type="text" v-model="group.course">
  </div>

  <div class="input-text">
    <p>Department ID</p>
    <input type="text" v-model="group.department.id">
  </div>


  <button @click="addGroup">Add</button>
</template>

<script>
import GroupService from "./GroupService";
export default {

  name: "GroupAdd",
  data: () => ({
    group: {
      name: "",
      course: "",
      department: {
        id: 0
      }
    }
  }),
  methods: {
    addGroup() {
      GroupService.addGroup(this.group)
    }
  }
}
</script>

<style scoped>


</style>