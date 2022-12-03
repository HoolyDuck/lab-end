import {createRouter, createWebHistory} from 'vue-router/dist/vue-router.esm-bundler'
import Home from '../components/Home.vue'
import Test from '../components/Test.vue'
import Faculty from "../components/faculties/Faculty.vue";
import FacultyAdd from "../components/faculties/FacultyAdd.vue";
import FacultyEdit from "../components/faculties/FacultyEdit.vue";
import FacultyTable from "../components/faculties/FacultyTable.vue";
import FacultyDelete from "../components/faculties/FacultyDelete.vue";
import DepartmentTable from "../components/departments/DepartmentTable.vue";
import DepartmentAdd from "../components/departments/DepartmentAdd.vue";
import DepartmentEdit from "../components/departments/DepartmentEdit.vue";
import DepartmentDelete from "../components/departments/DepartmentDelete.vue";

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
            },
            {
                path: 'delete/:id',
                component: FacultyDelete
            }
        ]
    },
    {
        path: '/department',
        component: Faculty,
        children: [
            {
                path: '',
                component: DepartmentTable
            },

            {
                path: 'add',
                component: DepartmentAdd
            },
            {
                path: 'edit/:id',
                component: DepartmentEdit
            },
            {
                path: 'delete/:id',
                component: DepartmentDelete
            }
        ]
    }

]

export default () => createRouter({
    history: createWebHistory(),
    routes: routes
})