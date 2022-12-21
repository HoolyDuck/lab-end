<template>
  <div>
    <div class = "news" v-for="New in news">
      <h1 class="news_title">{{New.title}}</h1>
      <h3 class="news_date">{{New.date}}</h3>
      <p class="news_text">{{New.text}}</p>
    </div>
  </div>
</template>

<script>
import NewService from "./NewService";

export default {
  name: "NewsPage",
  data: () => ({
    news: []
  }),

  methods: {
    getAllNews() {
      NewService.getAllNews().then((response) => this.news = response.data)
    },
  },
  created() {
    this.getAllNews()
  }
}
</script>

<style scoped>

</style>