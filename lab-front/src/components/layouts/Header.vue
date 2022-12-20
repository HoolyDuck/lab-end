<template>
  <header>
    <div class="header-part">
    <div class="header-link">Logo</div>
      <router-link class="header-link" to="/">Home</router-link>
    <router-link class="header-link" to="/schedule/page">Schedule</router-link>
    <router-link class="header-link" to="/new/page">News</router-link>
    </div>
    <div class="sidebar-menu">
      <div class="burger-button" @click="this.showSidebar=!this.showSidebar">|||</div>
      <Sidebar @click="this.showSidebar=!this.showSidebar"
               :routelinks="this.routeLinks"
               v-if="this.showSidebar"></Sidebar>
    </div>
  </header>
</template>

<script>
import Sidebar from "./Sidebar.vue";

export default {
  name: "Header",
  components: {
    Sidebar
  },
  data: () => ({
    showSidebar: false,
    routeLinks: [
      {'link': "/faculty", 'name': 'Faculty'},
      {'link': "/department", 'name': 'Departments'},
      {'link': "/group", 'name': 'Groups'},
      {'link': "/student", 'name': 'Students'},
      {'link': "/teacher", 'name': 'Teachers'},
      {'link': "/new", 'name': 'NewsTable'},
      {'link': "/new/page", 'name': 'News'},
      {'link': "/schedule/page", 'name': 'Schedules'},
      {'link': "/schedule", 'name': 'SchedulesTable'},
      {'link': "/discipline", 'name': 'Disciplines'}
    ]
  }),
  methods: () => ({})
}
</script>
<style>

header {
  z-index: 1;
  position: fixed;
  width: 100%;
  top:0;
  left: 0;
  display: flex;
  justify-content: space-between;
  margin-bottom: 1rem;
  box-shadow: 3px 7px 3px rgba(0, 0, 0, 0.2);
}

.header-link{
  padding-left: 24%;
  padding-right: 24%;
}

.header-part {
  display: flex;
  justify-content: space-between;
  flex-direction: row;
}

.header-link {
  display: flex;
  padding: 1rem;
  align-items: center;
}

.burger-button {
  display: flex;
  justify-content: center;
  align-items: center;
  font-weight: bold;
  height: 3rem;
  width: 3rem;
  text-align: center;
  rotate: 90deg;
  transition: .4s;
}

.burger-button:hover {
  background: rgba(32, 178, 100, 0.63);
}
</style>