<template>
  <div>
  <el-input v-model="username" placeholder="请输入账号"></el-input>
  <el-input placeholder="请输入密码" v-model="password" show-password></el-input>
</div>
</template>
  

 
<script>
  export default {
    data() {
      return {
        username: '',
        password: ''
      }
    }
  }
</script>
