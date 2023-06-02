<template>
  <div>
  <el-table
    :data="tableData"
    style="width: 100%">
    <el-table-column
      fixed
      prop="leaseid"
      label="租赁编号"
      width="150">
    </el-table-column>
    <el-table-column
      prop="homeid"
      label="房屋编号"
      width="120">
    </el-table-column>
    <el-table-column
      prop="tenantid"
      label="租客编号"
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
      width="300">
    </el-table-column>

    <el-table-column
      prop="homeaddress"
      label="房屋地址"
      width="120">
    </el-table-column>
    
    <el-table-column
      fixed="right"
      label="操作"
      width="100">
      <template #default="{ row }">
        <el-button type="primary" @click="open(row)">点击退房</el-button>
      </template>
    </el-table-column>
  </el-table>
  </div>
</template>

<script>
import axios from 'axios'
  export default {
created:function(){
this.$http.get("/app2/allleaseinfo").then((response)=>{
  console.log(response.data)
  this.tableData=response.data
})    //axios请求后端
},
    methods: {
      handleClick(row) {
        console.log(row);
      },
      
      open(row) {
        const this_ = this
        this_.$confirm('确认退房?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this_.$message({
            type: 'success',
            message: '退房成功!'
          })
          this_.ruleform[0].homeid = row.homeid
          console.log(this_.ruleform[0])
            axios.post("http://localhost:8085/app2/deletelease",this_.ruleform[0])
            .then(function(response){
              console.log(response)
          })  
        }).catch(() => {    
                console.log("error")
        }).catch(() => {
          this_.$message({
            type: 'info',
            message: '已取消'
          });          
        });
      }
      
  },

    data() {
      return {
        tableData: [],
        selectedDate: '',
        ruleform:[{
          homeid:''
        }
        ]
      }
    }
  }
</script>