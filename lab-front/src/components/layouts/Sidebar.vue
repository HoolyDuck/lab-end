<template>
  <div class="sidebar">
    <div class="sidebar-link sidebar-title">
      Admin
    </div>

    <div class="sidebar-link-list">
      <router-link class="sidebar-link"
                   v-for="link in routelinks"
                   :to="link['link']">
        {{ link['name'] }}
      </router-link>
    </div>

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
  margin: 0 auto;
  top: 100%;
  z-index: 3;
  display: flex;
  flex-direction: column;

}



.sidebar-link-list {
  z-index: 3;
  display: flex;
  flex-direction: column;
  background: #3b3b3b;
  max-height: calc(100vh - 10rem);
  overflow-y: scroll;

}

.sidebar-link {
  z-index: 3;
  padding: 1rem;
  min-width: 10rem;
  box-shadow: 0 2px rgba(0, 0, 0, 0.2);
  text-align: left;
}

.sidebar-title {
  font-weight: bold;
  font-size: 1.1rem;
  text-align: center;
  background: mediumseagreen;
}

</style>