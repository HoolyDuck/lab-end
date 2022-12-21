<template>

  <div class="flex center">
    <p class="cool-text bolder">Edit Group</p>
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

    <CommitButton @click="updateGroup"></CommitButton>
    <BackButton to="/group"></BackButton>
  </div>
  </div>
</template>

<script>
import GroupService from "./GroupService";
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";

export default {

  name: "GroupEdit",
  components: {BackButton, CommitButton},
  data: () => ({
    group: {}
  }),
  methods: {
    updateGroup() {
      GroupService.updateGroup(this.group, this.$route.params.id)
    }
  },
}
</script>

<style scoped>


</style>