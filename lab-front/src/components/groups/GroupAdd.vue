<template>
  <div class="flex center">
    <p class="cool-text bolder">Add Group</p>
  <div class="edit-add-wrapper">

    <div class="edit-add-field-wrapper">
      <div class="input-text">
        <p>Name</p>
        <input type="text" v-model="group.name">
      </div>

      <div class="input-text">
        <p>Course</p>
        <input type="number" max="5" min="1"  v-model="group.course">
      </div>

      <div class="input-text">
        <p>Department ID</p>
        <input type="number" v-model="group.department_id">
      </div>

    </div>
    <div class="error-text" v-if="showError">{{ errorText }}</div>
    <CommitButton @click="addGroup"></CommitButton>
    <BackButton to="/group"></BackButton>
  </div>
  </div>
</template>

<script>
import GroupService from "./GroupService";
import CommitButton from "../layouts/CommitButton.vue";
import BackButton from "../layouts/BackButton.vue";
import crudErrorHandler from "../../error_handlers/crudErrorHandler";

export default {

  name: "GroupAdd",
  components: {BackButton, CommitButton},
  data: () => ({
    group: {
      name: "",
      course: 0,
      department_id: 0
    },
    showError: false,
    errorText: ""
  }),
  methods: {
    addGroup() {
      GroupService.addGroup(this.group).then(() => {
        this.$router.push('/group')
      })
          .catch(err => {
            this.showError = true
            this.errorText = crudErrorHandler.catchError(err)
          });
    }
  }
}
</script>

<style scoped>


</style>