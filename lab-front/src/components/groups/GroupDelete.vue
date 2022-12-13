<template>
<p>Are you sure?</p>
  <button @click="deleteGroup">Yes</button>
  <button>No</button>
</template>

<script>
import GroupService from "./GroupService";

export default {
  name: "GroupDelete",
  methods: {
    deleteGroup() {
      GroupService.deleteGroup(this.$route.params.id)
    }
  },
}
</script>

<style scoped>

</style>