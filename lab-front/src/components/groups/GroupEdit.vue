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


  <button @click="updateFaculty">Update</button>
</template>

<script>
import GroupService from "./GroupService";
export default {

  name: "GroupEdit",
  data: () => ({
    group: {}
  }),
  methods: {
    updateFaculty() {
      GroupService.updateGroup(this.group, this.$route.params.id)
    }
  },
}
</script>

<style scoped>


</style>