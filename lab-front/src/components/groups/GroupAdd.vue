<template>

  <div class="edit-add-wrapper">

    <div class="edit-add-field-wrapper">
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
    <input type="text" v-model="group.department_id">
  </div>

    </div>
  <button @click="addGroup">Add</button>
  </div>
</template>

<script>
import GroupService from "./GroupService";
export default {

  name: "GroupAdd",
  data: () => ({
    group: {
      name: "",
      course: "",
      department_id: 0
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