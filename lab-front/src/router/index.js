import { createRouter, createWebHistory } from 'vue-router/dist/vue-router.esm-bundler'
import Home from '../components/Home.vue'
import Test from '../components/Test.vue'

const routes = [
    {
        path: '/',
        component: Home
    },
    {
        path: '/test',
        component: Test
    }
]

export default () => createRouter({
    history: createWebHistory(),
    routes: routes
})