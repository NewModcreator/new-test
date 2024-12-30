import { createRouter, createWebHistory } from 'vue-router'
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {path:'/',redirect:'/manage'},
    {path: '/manage', name: 'manage', component: () => import('../views/manage.vue'),children:[
        {path: 'data', name: 'data',meta: {title:'数据展示页面1'},component: () => import('../views/Data.vue'),},

    {path: 'User', name: 'User',meta: {title:'用户信息页面'},component: () => import('../views/User.vue'),},
  ],},


  ],
})
// router.beforeEach((to,from,next)=>{
//   document.title = to.meta.title
//   next()
// })
export default router
