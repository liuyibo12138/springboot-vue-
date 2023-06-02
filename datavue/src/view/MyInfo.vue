<template>
  <div class="demo-type">
    <el-table
    :data="tableData"
    style="width: 100%">
    <el-table-column
      fixed
      prop="landlordid"
      label="房东编号"
      width="200">
    </el-table-column>
    <el-table-column
      prop="landlordname"
      label="房东姓名"
      width="200">
    </el-table-column>
    <el-table-column
      prop="landlordgender"
      label="性别"
      width="150">
    </el-table-column>
    <el-table-column
      prop="landlordphone"
      label="电话号码"
      width="300">
    </el-table-column>
  
    
    
  </el-table>
  </div>
</template>

<script>
  export default {
    created:function(){
this.$http.get("/app2/findlord").then((response)=>{
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

