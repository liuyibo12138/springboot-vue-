<template>
    <el-table
    :data="tableData"
    style="width: 100%">

    <el-table-column
      prop="landlordid"
      label="id"
      width="300">
    </el-table-column>

    <el-table-column
      prop="landlordname"
      label="名字"
      width="300">
    </el-table-column>

    <el-table-column
      prop="landlordgender"
      label="性别"
      width="300">
    </el-table-column>

    <el-table-column
      prop="landlordphone"
      label="电话">
    </el-table-column>
  </el-table>
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
        tableData: []
      }
    }
  }

</script>