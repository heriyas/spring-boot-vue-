import { createRouter, createWebHistory } from 'vue-router'
import gelin from '../views/gelin.vue'


const routes = [
  // {
  //   path: '/about',
  //   name: 'about',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  // }
  {
    path:'/allroom/:id',
    component: () => import('../views/allroom.vue'),
    props: true
  },
  {
    path:'/index',
    component: () => import('../views/index.vue')
  },
  {
    path:'/detailes',
    name: 'detailes',
    component: () => import('../views/detailes.vue'),
    props: true
  },
  {
    path:'/login',
    component: () => import('../views/login.vue'),
  },
  {
    path: '/register',
    name: 'Register',
    component: () => import('../views/register.vue')
  },
  {
    path: '/select',
    name: 'select',
    component: () => import('../views/select.vue')
  },
  {
    path: '/gelin',
    name: 'gelin',
    component: () => import('../views/gelin.vue')
  },{
    path:'/qitian',
    name: 'qitian',
    component: () => import('../views/qitian.vue')
  },
  {
    path: '/myorder',
    name: 'myorder',
    component: () => import('../views/myorder.vue')
  }

]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
