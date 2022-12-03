import {createRouter, createWebHistory} from 'vue-router/dist/vue-router.esm-bundler'
import Home from '../components/Home.vue'
import Test from '../components/Test.vue'
import Faculty from "../components/faculties/Faculty.vue";
import FacultyAdd from "../components/faculties/FacultyAdd.vue";
import FacultyEdit from "../components/faculties/FacultyEdit.vue";
import FacultyTable from "../components/faculties/FacultyTable.vue";
import FacultyDelete from "../components/faculties/FacultyDelete.vue";

const routes = [
    {
        path: '/',
        component: Home
    },
    {
        path: '/test',
        component: Test
    },
    {
        path: '/faculty',
        component: Faculty,
        children: [
            {
                path: '',
                component: FacultyTable
            },
            { path: '/:pathMatch(.*)*', name: 'not-found', redirect: '/' },

            {
                path: 'add',
                component: FacultyAdd
            },
            {
                path: 'edit/:id',
                component: FacultyEdit
            },
            {
                path: 'delete/:id',
                component: FacultyDelete
            }
        ]
    },
]

export default () => createRouter({
    history: createWebHistory(),
    routes: routes
})