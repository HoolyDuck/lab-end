<template>
  <div class="page-dont-exist">
  <p class="page-dont-exist-text">This page does not exist</p>
  </div>
</template>

<script>
export default {
  name: "Test"
}
</script>

<style>
.page-dont-exist {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 1rem;
  height: 50vh;
}

.page-dont-exist-text {
  text-align: center;
  font-weight: bolder;
  font-size: 4rem;
  color: rgba(63, 63, 63, 0.52);
}
</style>