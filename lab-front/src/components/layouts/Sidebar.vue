<template>
  <div class="sidebar">
    <div class="sidebar-link sidebar-title">
      Admin
    </div>
    <router-link class="sidebar-link"
                 v-for="link in routelinks"
                 :to="link['link']">
      {{ link['name'] }}
    </router-link>
  </div>


</template>

<script>
export default {
  name: "Sidebar",
  props: {
    routelinks: Array
  }
}
</script>

<style scoped>
.sidebar {
  position: absolute;
  right: calc(100% - 3rem);
  z-index: 1;
  display: flex;
  flex-direction: column;
  background: #3b3b3b;
}

.sidebar-link {
  padding: 0.9rem;
  min-width: 10rem;
  box-shadow:  0 2px rgba(0, 0, 0, 0.2);
  text-align: left;
}

.sidebar-title {
  font-weight: bold;
  font-size: 1.1rem;
  text-align: center;
  background: mediumseagreen;
}

</style>