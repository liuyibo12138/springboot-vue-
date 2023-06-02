<template>
  <div>
  <el-table
    :data="tableData"
    style="width: 100%">
    <el-table-column
      fixed
      prop="earningid"
      label="租赁编号"
      width="150">
    </el-table-column>
    <el-table-column
      prop="homeid"
      label="房屋编号"
      width="120">
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
      prop="earningmoney"
      label="收益"
      width="120">
    </el-table-column>
  </el-table>
  </div>
</template>

<script>
  export default {
    created:function(){
    this.$http.get("/app2/findearning").then((response)=>{
    console.log(response.data)
    this.tableData=response.data
   })    //axios请求后端
},
    data() {
      return {
        tableData: []
      }
    }
  }
</script>