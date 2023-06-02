import Vue from 'vue'
import App from './App.vue'
import router from './router';
import store from './store'
//引入element
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
Vue.use(ElementUI);//全局注册
//引入axios
import axios from 'axios';
axios.defaults.baseURL="http://localhost:8085"
Vue.prototype.$http=axios   //相当于给axios取了个新名字，在vue文件中axios都能用$http替代
Vue.use(store)
Vue.config.productionTip = false
//钩子函数，访问路由前调用
router.beforeEach((to, from, next) => {
  //路由需要认证
  if (to.meta.requireAuth) {
    //判断store里是否有token
    if (store.state.token) {
      next()
    } else {
      alert("休想进入")
      next({
        path: 'login',
        query: { redirect: to.fullPath }
      })
    }
  } else {
    next()
  }
}
)

new Vue({
  render: h => h(App),
  router:router
}).$mount('#app')
