import Vue from 'vue'
import VueRouter from 'vue-router'

import HomeInfo from '../view/HomeInfo.vue'
import Login from '../view/Login1.vue'
import A1 from '../view/a.vue'
import MyInfo from '../view/MyInfo.vue'
import HomeInfo1 from '../view/HomeInfo1.vue';
import Search from '../view/search.vue'
import LeaseInfo from '../view/LeaseInfo.vue'
import BillingInfo from '../view/BillingInfo.vue'
import EarningInfo from '../view/EarningInfo.vue'
import Landlordview from '../view/landlordview.vue'
import HomeUploadVue from '@/view/HomeUpload.vue'
import Zuce from '../view/zuce.vue'
import vipMyInfo from '@/view/vipMyInfo.vue'
Vue.use(VueRouter);

const router=new VueRouter({
  routes: [
    {
      path:"",
      name:"welcome",
      component:HomeInfo
    },
    {
      path:"/login",
      name:"登录",
      component:Login
    },
    {
      path:"/zuce",
      name:"注册",
      component:Zuce
    },
    {
      path:"/userview",
      name:"租客界面",
      component:A1,
      meta: {
        requireAuth: true
      },
      children:[
        {
          path:"/myinfo",
          name:"我的信息",
          component:MyInfo,
          meta: {
            requireAuth: true
          },
        },
        {
          path:"/homeinfo",
          name:"房屋信息",
          component:HomeInfo1,
          meta: {
            requireAuth: true
          },
        },
        {
          path:"/search",
          name:"房屋查询",
          component:Search,
          meta: {
            requireAuth: true
          },
        } ,
         {
          path:"/billinginfo",
          name:"缴费信息",
          component:BillingInfo,
          meta: {
            requireAuth: true
          },
        },
        {
          path:"/leaseinfo",
          name:"我租的房",
          component:LeaseInfo,
          meta: {
            requireAuth: true
          },
        }
      ]
    },
    {
      path:"/landlordview",
      name:"房东界面",
      component:Landlordview,
      meta: {
        requireAuth: true
      },
      children:[
        {
          path:"/vipmyinfo",
          name:"我的信息",
          component:vipMyInfo,
          meta: {
            requireAuth: true
          },
        },
        {
          path:"/viphomeinfo",
          name:"房屋信息",
          component:HomeInfo1,
          meta: {
            requireAuth: true
          },
        },
        {
          path:"/vipsearch",
          name:"房屋查询",
          component:Search,
          meta: {
            requireAuth: true
          },
        } ,
        {
          path:"/uploadhome",
          name:"房屋上传",
          component:HomeUploadVue,
          meta: {
            requireAuth: true
          },
        } ,
        {
          path:"/vipearning",
          name:"房屋收益",
          component:EarningInfo,
          meta: {
            requireAuth: true
          },
        } 
      ]
    }
  ]
  })
  
  export default router