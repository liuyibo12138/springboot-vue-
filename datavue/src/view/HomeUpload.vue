<template>
  <div>
  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
    <el-form-item label="房屋地址" prop="homeaddress">
      <el-input v-model="ruleForm.homeaddress"></el-input>
    </el-form-item>
    <el-form-item label="房屋面积" prop="homesize">
      <el-input v-model="ruleForm.homesize"></el-input>
    </el-form-item>
    <el-form-item label="房屋类型" prop="hometype">
      <el-input v-model="ruleForm.hometype"></el-input>
    </el-form-item>
    <el-form-item label="房屋价格" prop="homeprice">
      <el-input v-model="ruleForm.homeprice"></el-input>
    </el-form-item>


  <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">立即上传</el-button>
      <el-button @click="resetForm('ruleForm')">重置</el-button>
    </el-form-item>
  </el-form>
</div>
</template>
<script>
import axios from 'axios';
  export default {
    data() {
      return {
        ruleForm: {
          landlordid:2,
          homeid:3,
          homeaddress: '',
          homesize: '',
          hometype: '',
          homeprice: ''
        },
        rules: {
          homeaddress: [
            { required: true, message: '请输入房屋地址', trigger: 'blur' },
            { min: 3, max: 20, message: '长度在 3 到 5 个字符', trigger: 'blur' }
          ],
          homesize: [
            { required: true, message: '请输入房屋面积', trigger: 'blur' },
          ],
          hometype: [
            { required: true, message: '请输入房屋类型', trigger: 'blur' },
          ],
          homeprice: [
            { required: true, message: '请输入房屋价格' },
            { min: 3, message: '价格不可太低', trigger: 'blur' }
          ]
        }
      };
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            alert('上传成功!');
            console.log(this.ruleForm.landlordid,this.ruleForm.homeid,this.ruleForm.homeaddress,this.ruleForm.homesize,this.ruleForm.hometype,this.ruleForm.homeprice)
            const this_ = this
            axios.post("http://localhost:8085/app2/addhome",this.ruleForm).then(function(response){
              console.log(response)
              this_.ruleForm.homeid= this_.ruleForm.homeid+1
          })
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>