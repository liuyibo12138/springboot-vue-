<template>
  <div>
  <el-table
    :data="tableData"
    style="width: 100%">
    <el-table-column
      fixed
      prop="homeid"
      label="房屋编号"
      width="150">
    </el-table-column>
    <el-table-column
      prop="homeaddress"
      label="房屋地址"
      width="250">
    </el-table-column>
    <el-table-column
      prop="homesize"
      label="房屋面积"
      width="120">
    </el-table-column>
    <el-table-column
      prop="hometype"
      label="房屋类型"
      width="120">
    </el-table-column>
    <el-table-column
      prop="homeprice"
      label="房屋价格"
      width="200">
    </el-table-column>
    <el-table-column
      prop="landlordphone"
      label="房主电话"
      width="120">
    </el-table-column>
    <el-table-column
      fixed="right"
      label="操作"
      width="100">
      <template #default="{ row }">
        <el-button type="primary" @click="open(row)">点击租房</el-button>
      </template>
    </el-table-column>
  </el-table>
  </div>
</template>

<script>
import axios from 'axios';
  export default {
    methods: {
      handleClick(row) {
        console.log(row);
      },

      open(row) {
        const this_ = this
        this_.$confirm('确认租房?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this_.$message({
            type: 'success',
            message: '租房成功!'
          })
          console.log(row.homeid)
          this.loginForm[0].homeid = row.homeid
          console.log(this.loginForm)
          axios.post("http://localhost:8085/app2/zufang",this_.loginForm[0]).then(function(response){
            console.log(response)
            this_.loginForm[0].leaseid=this_.loginForm[0].leaseid+1
          })
        }).catch(() => {
        
        }).catch(() => {
          this_.$message({
            type: 'info',
            message: '已取消删除'
          });          
        });
      }
      
  },
  created:function(){

this.$http.get("/app2/findhome").then((response)=>{
  console.log(response.data)
  this.tableData=response.data
})    //axios请求后端
},
    data() {
      return {
        tableData: [],
        selectedDate: '',
        loginForm:[
          {
            leaseid:3,
            homeid:'',
            tenantid:2
          }
        ]
      }
    }
  }
</script>