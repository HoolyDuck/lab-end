<template>
  <div class="sort-menu">
    <p>Sort by:</p>
    <select>
      <option @click="sortByDate">Date</option>
      <option @click="sortByTitle">Title</option>
    </select>
  </div>
  <div class="news-wrapper">
    <div class="news-box" v-for="New in news">
      <p class="cool-text bolder">{{ New.title }}</p>
      <p class="news-date cool-text">{{ New.date.replace(/T.*/, "") }}</p>
      <p class="news-text">{{ New.text }}</p>
    </div>
  </div>
</template>

<script>
import NewService from "./NewService";

export default {
  name: "NewsPage",
  data: () => ({
    news: [],
  }),

  methods: {
    getAllNews() {
      NewService.getAllNews().then((response) => {
        this.news = response.data.sort((a, b) => {
          return new Date(b.date.replace(/T.*/, ""))
              - new Date(a.date.replace(/T.*/, ""));
        })
      })
    },

    sortByTitle() {
      this.news.sort((a, b) => {
        return a.title.localeCompare(b.title)
      })
    },

    sortByDate() {
      this.news.sort((a, b) => {
        return new Date(b.date.replace(/T.*/, ""))
            - new Date(a.date.replace(/T.*/, ""));
      })
    }

  },
  created() {
    this.getAllNews()
  }
}
</script>

<style scoped>
.news-wrapper {
  flex-wrap: wrap;
  display: flex;
  flex-direction: row;
  gap: 1rem;
  align-content: stretch;
  justify-content: stretch;
}

.news-box {

  box-shadow: 3px 7px 3px rgba(0, 0, 0, 0.2);
  padding: 1rem;
  border: 4px solid;
  border-image-source: linear-gradient(to top left, rgba(81, 117, 107, 0.58), #504f4f, rgba(58, 213, 159, 0.47));
  border-image-slice: 1;
}

.news-text {
  text-align: justify;
  max-height: 20rem;
  max-width: 40rem;
  min-width: 15rem;

  overflow-y: scroll;
  word-break: break-word;
}

.news-date {
  font-size: .6rem;
  font-weight: bold;
}

.sort-menu {
  padding: .7rem;
  display: flex;
  gap: 1rem;
}

.sort-menu select {
  background: transparent;
  font-weight: bold;
  color: white;
  border: 1.5px solid mediumspringgreen;
  border-radius: 5px;
}

.sort-menu option {
  color: black;
}

</style>