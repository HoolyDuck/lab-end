import { createApp } from 'vue'
import App from './App.vue'

import './assets/main.css'

import './assets/fontawesome-free-6.2.1-web/css/fontawesome.css'

import './assets/fontawesome-free-6.2.1-web/css/brands.css'

import './assets/fontawesome-free-6.2.1-web/css/solid.css'

import router from './router';

const app = createApp(App)

app.use(router())

app.mount('#app')
