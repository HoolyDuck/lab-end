import {createRouter, createWebHistory} from 'vue-router/dist/vue-router.esm-bundler'
import Home from '../components/Home.vue'
import Test from '../components/Test.vue'
import Faculty from "../components/faculties/Faculty.vue";
import FacultyAdd from "../components/faculties/FacultyAdd.vue";
import FacultyEdit from "../components/faculties/FacultyEdit.vue";
import FacultyTable from "../components/faculties/FacultyTable.vue";
import FacultyDelete from "../components/faculties/FacultyDelete.vue";
import Teacher from "../components/teachers/Teacher.vue";
import TeacherTable from "../components/teachers/TeacherTable.vue";
import TeacherAdd from "../components/teachers/TeacherAdd.vue";
import TeacherEdit from "../components/teachers/TeacherEdit.vue";
import TeacherDelete from "../components/teachers/TeacherDelete.vue";
import Department from "../components/departments/Department.vue";
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
            {path: '/:pathMatch(.*)*', name: 'not-found', redirect: '/'},

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
        component: Department,
        children: [
            {
                path: '',
                component: DepartmentTable
            },
            {path: '/:pathMatch(.*)*', name: 'not-found', redirect: '/'},

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
    },

    {
        path: '/teacher',
        component: Teacher,
        children: [
            {
                path: '',
                component: TeacherTable
            },
            {
                path: 'add',
                component: TeacherAdd
            },
            {
                path: 'edit/:id',
                component: TeacherEdit
            },
            {
                path: 'delete/:id',
                component: TeacherDelete
            }
        ]
    },
    {path: '/:pathMatch(.*)', redirect: '/'}
]

export default () => createRouter({
    history: createWebHistory(),
    routes: routes
})