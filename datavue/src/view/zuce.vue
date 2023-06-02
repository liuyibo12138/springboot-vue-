<template>
  <div>
  <body id="login-page">
    <el-form class="login-container" label-position="left" label-width="0px">
      <h3 class="login_title">注册租客</h3>
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
      <el-form-item style="width: 50%">
        <el-input
        placeholder="姓名" v-model="loginForm.tenantname"></el-input
        >
        <template>
  <el-select v-model="loginForm.tenantgender" placeholder="性别">
    <el-option
      v-for="item in options"
      :key="item.value"
      :label="item.label"
      :value="item.value">
    </el-option>
  </el-select>
</template>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-input
        placeholder="电话号码" v-model="loginForm.tenantphone"></el-input
        >
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button
          type="primary"
          style="width: 100%;  border: none"
          @click = "login"
          >注册</el-button
        >
      </el-form-item>
    </el-form>
  </body>
</div>
</template>

<script>
import axios from 'axios';

export default {
  name: "Login",
  data() {
    return {
      loginForm: {
        tenantid:3,
        username: "",
        password: "",
        type:0,
        tenantgender: '',
        tenantname:'',
        tenantphone:''
      },
      responseResult: [],
      options: [{
          value: '男',
          label: '男'
        }, {
          value: '女',
          label: '女'
        }, ],
 
    };
  },
  methods: {
      login(){
        
          console.log(this.loginForm.tenantid,this.loginForm.username,this.loginForm.password,this.loginForm.tenantgender,this.loginForm.tenantname,this.loginForm.tenantphone)
          const _this = this 

          axios.post("http://localhost:8085/login/adduser",this.loginForm).then(function(response){
              console.log(response)
              alert(response.data)
              _this.loginForm.tenantid=_this.loginForm.tenantid+1

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
