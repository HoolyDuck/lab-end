import {createRouter, createWebHistory} from 'vue-router/dist/vue-router.esm-bundler'
import Home from '../components/Home.vue'
import Test from '../components/Test.vue'
import Faculty from "../components/faculty/Faculty.vue";
import FacultyAdd from "../components/faculty/FacultyAdd.vue";
import FacultyEdit from "../components/faculty/FacultyEdit.vue";
import FacultyTable from "../components/faculty/FacultyTable.vue";

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

            {
                path: 'add',
                component: FacultyAdd
            },
            {
                path: 'edit/:id',
                component: FacultyEdit
            }
        ]
    }
]

export default () => createRouter({
    history: createWebHistory(),
    routes: routes
})