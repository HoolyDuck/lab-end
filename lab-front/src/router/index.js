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
import ScheduleTable from "../components/schedules/ScheduleTable.vue";
import ScheduleAdd from "../components/schedules/ScheduleAdd.vue";
import ScheduleEdit from "../components/schedules/ScheduleEdit.vue";
import ScheduleDelete from "../components/schedules/ScheduleDelete.vue";
import Schedule from "../components/schedules/Schedule.vue";
import Discipline from "../components/disciplines/Discipline.vue";
import DisciplineTable from "../components/disciplines/DisciplineTable.vue";
import DisciplineAdd from "../components/disciplines/DisciplineAdd.vue";
import DisciplineEdit from "../components/disciplines/DisciplineEdit.vue";
import DisciplineDelete from "../components/disciplines/DisciplineDelete.vue";
import NewTable from "../components/news/NewTable.vue";
import NewAdd from "../components/news/NewAdd.vue";
import NewEdit from "../components/news/NewEdit.vue";
import NewDelete from "../components/news/NewDelete.vue";
import New from "../components/news/New.vue";

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
    {
        path: '/schedule',
        component: Schedule,
        children: [
            {
                path: '',
                component: ScheduleTable
            },
            {
                path: 'add',
                component: ScheduleAdd
            },
            {
                path: 'edit/:id',
                component: ScheduleEdit
            },
            {
                path: 'delete/:id',
                component: ScheduleDelete
            }
        ]
    },
    {
        path: '/discipline',
        component: Discipline,
        children: [
            {
                path: '',
                component: DisciplineTable
            },
            {
                path: 'add',
                component: DisciplineAdd
            },
            {
                path: 'edit/:id',
                component: DisciplineEdit
            },
            {
                path: 'delete/:id',
                component: DisciplineDelete
            }
        ]
    },
    {
        path: '/new',
        component: New,
        children: [
            {
                path: '',
                component: NewTable
            },
            {
                path: 'add',
                component: NewAdd
            },
            {
                path: 'edit/:id',
                component: NewEdit
            },
            {
                path: 'delete/:id',
                component: NewDelete
            }
        ]
    },
    {path: '/:pathMatch(.*)', redirect: '/'}
]

export default () => createRouter({
    history: createWebHistory(),
    routes: routes
})