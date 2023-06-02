<template>
  <div>
    <router-view></router-view>
  </div>
</template>

<script>
import Preface from './components/Preface.vue'
import HomeInfo from './view/HomeInfo.vue';
import Login from './view/Login1.vue'
import A1 from './view/a.vue'
import MyInfo from './view/MyInfo.vue'
import HomeInfo1 from './view/HomeInfo1.vue';
import Search from './view/search.vue'
import LeaseInfo from './view/LeaseInfo.vue'
import BillingInfo from './view/BillingInfo.vue'
import EarningInfo from './view/EarningInfo.vue'
import Landlordview from './view/landlordview.vue'
import HomeUpload from './view/HomeUpload.vue';
import Zuce from './view/zuce.vue'
export default {
  name: 'App',
  components: {
    Preface,
    HomeInfo,
    Login,
    A1,
    MyInfo,
    HomeInfo1,
    Search,
    LeaseInfo,
    BillingInfo,
    EarningInfo,
    Landlordview,
    HomeUpload,
    Zuce
  },
  created(){
      console.log(sessionStorage.getItem("token"));
    }
}
</script>

<style>
#back{
  width:100%;
  height:120%;
  top: 0;
  left: 0;
  position: fixed;
  background-size: 100% 120%;
  z-index: -1;
}
</style>
