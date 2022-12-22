<template>
  <header>
    <div class="header-part">
    <div class="header-link"><i class="fa-solid fa-school-flag"></i></div>
    <router-link class="header-link" to="/schedule/page">Schedule</router-link>
    <router-link class="header-link" to="/new/page">News</router-link>
    </div>
    <div class="sidebar-menu">
      <i class="fa-solid fa-bars header-link" @click="this.showSidebar=!this.showSidebar"></i>
     <Transition name="slide-fade">
      <Sidebar @click="this.showSidebar=!this.showSidebar"
               :routelinks="this.routeLinks"
               v-if="this.showSidebar"></Sidebar>
     </Transition>
      <div v-if="this.showSidebar" @click="this.showSidebar=!this.showSidebar" class="sidebar-dark"></div>
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
      {'link': "/new", 'name': 'News'},
      {'link': "/schedule", 'name': 'Schedule'},
      {'link': "/discipline", 'name': 'Disciplines'}
    ]
  }),
  methods: () => ({



  })


}
</script>


<style>

header {
  width: 100vw;
  display: flex;
  justify-content: space-between;

  margin-bottom: 1rem;
  box-shadow: 3px 7px 3px rgba(0, 0, 0, 0.2);
}

.sidebar-menu {
  display: flex;
  flex-direction: column;
  flex-basis: max-content;
  align-items: flex-end;
  justify-content: flex-start;


}

.header-part {
  display: flex;
  justify-content: space-between;
}

.header-link {
  display: flex;
  padding: 1rem;
  align-items: center;
  justify-content: center;
}



</style>