<template>
  <div>
    <Header/>

    <main>
      <router-view />
    </main>

    <Footer/>
  </div>
</template>

<script>
import {defineComponent} from 'vue'
import Header from './components/layouts/Header.vue'
import Footer from './components/layouts/Footer.vue'

export default defineComponent({
  components:{
    Header,
    Footer,
  }
})
</script>