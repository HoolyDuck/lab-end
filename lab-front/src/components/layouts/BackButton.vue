<template>
  <router-link :to="to">
    <button class="wide-button button-grey">
      Back
    </button>
  </router-link>
</template>

<script>
export default {
  name: "BackButton",
  props: {
    to: String
  }
}
</script>

<style scoped>

</style>