<template>
  <div>
  <body id="login-page" >
    <el-form class="login-container" label-position="left" label-width="0px">
      <h3 class="login_title">系统登录</h3>
      <el-form-item>
        <el-input
          type="text"
          v-model="loginForm.username"
          auto-complete="off"
          placeholder="账号"
        ></el-input>
      </el-form-item>
      <el-form-item>
        <el-input placeholder="请输入密码" v-model="loginForm.password" show-password></el-input>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button
          type="primary"
          style="width: 100%;  border: none"
          @click = "login"
          >登录</el-button
        >
      </el-form-item>
    </el-form>
  </body>
</div>
</template>

<script>
import axios from 'axios';
import store from '@/store';

export default {
  name: "Login",
  data() {
    return {
      loginForm: {
        username: "",
        password: "",
      },
      responseResult: [],
    };
  },
  methods: {
      login(){
          console.log(this.loginForm.username,this.loginForm.password)
          const _this = this 
          axios.post("http://localhost:8085/login/findall",this.loginForm).then(function(response){
              console.log(response)
              console.log(response.data)
              if(response.data.data){
                alert("登录成功!  你好"+response.data.data.user.username)
                store.commit("SET_TOKENN", response.data.data.token);
                store.commit("SET_USER", response.data.data.user);
                console.log(store.state)
                if(response.data.data.user.type==1){
                _this.$router.push('/landlordview');
                console.log(response.data.data.token);
 

                }
                else{
                  _this.$router.push('/userview');
                }
              }
              else{
                alert("用户名或密码错误！")
              }

          })
      }
  },
};
</script>

<style scoped>
#login-page {
  background-position: center;
  height: 100%;
  width: 100%;
  background-size: cover;
  position: fixed;
}
body {
  margin: 0px;
}
.login-container {
  border-radius: 15px;
  background-clip: padding-box;
  margin: 90px auto;
  width: 350px;
  padding: 35px 35px 15px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
  background-color:rgba(255,255,255,0.7);
}

.login_title {
  margin: 0px auto 40px auto;
  text-align: center;
  color: #505458;
}
#login-page{
background: url("D:/前端/初学/datavue/src/assets/背景.jpg");
}
</style>
