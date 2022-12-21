<template>
  <div class="content">
    <div class="news" v-for="New in news">
      <h1 class="news_title">{{ New.title }}</h1>
      <h3 class="news_date">{{ New.date }}</h3>
      <p class="news_text">{{ New.text }}</p>
      <img class="news_img" src="https://assets1.cbsnewsstatic.com/hub/i/r/2022/01/19/e6521679-1e8a-4522-af30-b416193d8414/thumbnail/640x360/7ee43f3be0b62ed37355827de806bd13/cbsnews-1920x1080.jpg">
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
.content {
  place-items: center;
  position: relative;
  display: grid;
  grid: repeat(auto-fill,auto) / 20%;
  width: 100%;
  height: auto;
  min-height:100%;
  top: 4rem;
}

.news {
  top: 0.1rem;
  position: relative;
  justify-content: center;
  justify-items: center;
  text-align: center;
  border: solid #B7950B 1px;
  border-radius: 8px;
  transition: 1s;
}

.news_img {
  width: 20%;
  height: auto;
}
.news:hover{
  transform: scale(1.2);
  border: 0;
}
.news_text{
  hyphens: auto;
  word-break: break-word;
  overflow-wrap: break-word;

}
@media(min-width: 240px){
  .news{
    left: 0;
  }
}
</style>