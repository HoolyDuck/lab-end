

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
import Department from "../components/departments/Department.vue";
import DepartmentTable from "../components/departments/DepartmentTable.vue";
import DepartmentAdd from "../components/departments/DepartmentAdd.vue";
import DepartmentEdit from "../components/departments/DepartmentEdit.vue";
import DepartmentDelete from "../components/departments/DepartmentDelete.vue";
import Group from "../components/groups/Group.vue";
import GroupTable from "../components/groups/GroupTable.vue";
import GroupAdd from "../components/groups/GroupAdd.vue";
import GroupEdit from "../components/groups/GroupEdit.vue";
import GroupDelete from "../components/groups/GroupDelete.vue";
import StudentAdd from "../components/students/StudentAdd.vue";
import StudentTable from "../components/students/StudentTable.vue";
import StudentEdit from "../components/students/StudentEdit.vue";
import StudentDelete from "../components/students/StudentDelete.vue";
import SchedulesPage from "../components/schedules/SchedulesPage.vue";
import NewsPage from "../components/news/NewsPage.vue";

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
        path: '/group',
        component: Group,
        children: [
            {
                path: '',
                component: GroupTable
            },

            {
                path: 'add',
                component: GroupAdd
            },
            {
                path: 'edit/:id',
                component: GroupEdit
            },
            {
                path: 'delete/:id',
                component: GroupDelete
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
                path: 'page',
                component: SchedulesPage
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
                path: 'page',
                component: NewsPage
            },
            {
                path: 'delete/:id',
                component: NewDelete
            }
        ]
    },
    {
        path: '/student',
        component: New,
        children: [
            {
                path: '',
                component: StudentTable
            },
            {
                path: 'add',
                component: StudentAdd
            },
            {
                path: 'edit/:id',
                component: StudentEdit
            },
            {
                path: 'delete/:id',
                component: StudentDelete
            }
        ]
    },




    {path: '/:pathMatch(.*)', redirect: '/'}
]

export default () => createRouter({
    history: createWebHistory(),
    routes: routes
})