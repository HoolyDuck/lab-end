<template>
  <div>
    <h1>Home</h1>
    <router-link to="/">Home</router-link>
    <router-link to="/test">Test</router-link>
    <router-link to="/faculty">Faculty</router-link>
    <router-link to="/teacher">Teachers</router-link>
    <router-link to="/new">NewsTable</router-link>
    <router-link to="/new/page">News</router-link>
    <router-link to="/schedule/page">Schedules</router-link>
    <router-link to="/schedule">SchedulesTable</router-link>
    <router-link to="/discipline">Disciplines</router-link>
  </div>
</template>

<script>
export default {
  name: "Home"
}
</script>