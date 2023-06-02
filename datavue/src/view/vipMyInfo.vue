<template>
  <div class="demo-type">
    <el-table
    :data="tableData"
    style="width: 100%">
    <el-table-column
      fixed
      prop="tenantid"
      label="我的编号"
      width="200">
    </el-table-column>
    <el-table-column
      prop="tenantname"
      label="我的姓名"
      width="200">
    </el-table-column>
    <el-table-column
      prop="tenantgender"
      label="性别"
      width="150">
    </el-table-column>
    <el-table-column
      prop="tenantphone"
      label="电话号码"
      width="300">
    </el-table-column>
  
    
    
  </el-table>
  </div>
</template>

<script>
  export default {
    created:function(){
this.$http.get("/app2/findtenant").then((response)=>{
  console.log(response.data)
  this.tableData=response.data
})    //axios请求后端
},
    data() {
      return {
        tableData: [],

      }
    }
  }

</script>

