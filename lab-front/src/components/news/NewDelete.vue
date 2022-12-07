<template>
  <p>Are you sure?</p>
  <button @click="deleteNew">Yes</button>
  <button>
    <router-link to="/new">No</router-link>
  </button>
</template>

<script>

import NewService from "./NewService";

export default {
  name: "NewDelete",
  methods: {
    deleteNew() {
      NewService.deleteNew(this.$route.params.id)
      this.$router.push('/new')
    }
  },
}
</script>

<style scoped>

</style>