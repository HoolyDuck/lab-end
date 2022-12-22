<template>
  <div class="schedule-wrapper ">
    <div class="schedule-search">
      <div class="schedule-search-panel">
        <p class="cool-text bold">Search by teacher</p>
        <v-select :options="teachers" v-model="selectedTeacher"></v-select>
        <button @click="getSchedulesByTeacher" class="wide-button">Search</button>
      </div>
      <div class="schedule-search-panel">
        <p class="cool-text bold">Search by group</p>
        <v-select :options="groups" v-model="selectedGroup"></v-select>
        <button @click="getSchedulesByGroup" class="wide-button">Search</button>
      </div>


    </div>
    <div class="schedule-table">
      <div v-if="!isNotFound" class="schedule-entity cool-border" v-for="schedule in schedules">

        <p class="cool-text bolder">{{ schedule.discipline_name }}</p>
        <p class="cool-text bold">{{ schedule.name }}</p>
        <p class="cool-text bold">Start: {{ schedule.time }}</p>
        <p>Classroom: {{ schedule.classroom }}</p>
        <p>Group: {{ schedule.group_name }}</p>
        <div class="name-surname">
          <p class="cool-text bold">Teacher: </p>
          <p>{{ schedule.teacher_name }} {{ schedule.teacher_surname }}</p>
        </div>
      </div>
      <div v-if="isNotFound" >
        Nothing found :(
        Select one of options above or try again later!
      </div>
    </div>
  </div>
</template>

<script>
import ScheduleService from "./ScheduleService";
import TeacherService from "../teachers/TeacherService";
import GroupService from "../groups/GroupService";
import vSelect from 'vue-select'

export default {
  name: "SchedulesPage",
  data: () => ({
    schedules: [],
    teachers: [],
    groups: [],
    selectedTeacher: {label: "", id: 0},
    selectedGroup: {label: "", id: 0},
    isNotFound: true

  }),
  components: {
    vSelect
  },
  methods: {
    getSchedulesByTeacher() {
      ScheduleService.getSchedulesByTeacher(this.selectedTeacher.id)
          .then((response) => {
            this.isNotFound = false
            this.schedules = response.data
          })
          .catch(() => {
            this.isNotFound = true
          })
    },
    getSchedulesByGroup() {
      ScheduleService.getSchedulesByGroup(this.selectedGroup.id)
          .then((response) => {
            this.isNotFound = false
            this.schedules = response.data
          })
          .catch(() => {
            this.isNotFound = true
          })
    },

    getAllTeachers() {
      TeacherService.getAllTeacherSelectModels().then((response) => this.teachers = response.data)
    },
    getAllGroups() {
      GroupService.getAllGroupSelectModels().then((response) => this.groups = response.data)
    }
  },

  created() {
    this.getAllGroups()
    this.getAllTeachers()
  }

}
</script>

<style scoped>

>>> {
  --vs-dropdown-bg: #282c34;
  --vs-dropdown-color: #3ad59f;
  --vs-dropdown-option-color: #3ad59f;
  --vs-selected-color: #FFFFFF;
  --vs-border-color: var(--color-border);
}

.schedule-wrapper {
  display: flex;
  flex-direction: column;
  width: 100%;
}

.schedule-search {
  display: flex;
  justify-content: space-around;
  flex-wrap: wrap;
}

.schedule-search-panel {
min-width: 15rem;
  width: 50%;
  display: flex;
  flex-direction: column;
  gap: 1rem;
  padding: 1rem;
}

.name-surname {
  display: flex;
  gap: .6rem;
}

.schedule-table {
  background: var(--color-background-soft);
  padding: 1rem;
  box-shadow: 3px 7px 3px rgba(0,0,0,0.2);
  flex-wrap: wrap;
  display: flex;
  flex-direction: row;
  gap: 1rem;
  align-content: stretch;
  justify-content: center;
}

.schedule-entity {
  padding: 1rem;
  min-width: 15rem;
  display: flex;
  flex-direction: column;
  box-shadow: 3px 7px 3px rgba(0,0,0,0.2);

}

</style>