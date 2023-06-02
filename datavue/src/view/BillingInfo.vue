<template>
  <div>
  <el-table
    :data="tableData"
    style="width: 100%">
    <el-table-column
      fixed
      prop="billingid"
      label="收费编号"
      width="150">
    </el-table-column>
    <el-table-column
      prop="leaseid"
      label="租赁编号"
      width="120">
    </el-table-column>
    <el-table-column
      prop="billingmoney"
      label="缴费金额"
      width="120">
    </el-table-column>
    <el-table-column
      fixed="right"
      label="操作"
      width="100">
      <template #default="{ row }">
        <el-button type="pubilc" @click="open(row)">缴费</el-button>
      </template>
    </el-table-column>
  </el-table>
  </div>
</template>

<script>
  export default {
    methods: {
      handleClick(row) {
        console.log(row);
      },
      open(row) {
        const this_ = this
        this_.$confirm('确认缴费?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this_.$message({
            type: 'success',
            message: '缴费成功!'
          })
          console.log(row.billingid)
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
        tableData: [{
          billingid:1,
          leaseid: '1',
          billingmoney:200000,

        },
        {
          billingid:2,
          leaseid: '2',
          billingmoney:10000,
        },
        
      ]
      }
    }
  }
</script>