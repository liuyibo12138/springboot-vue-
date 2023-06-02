<template>
  <div>
<div style="margin-top: 15px;">
  <el-input placeholder="请输入内容"  v-model="findbyid" class="input-with-select">
    <el-select v-model="select" slot="prepend" placeholder="请选择">
  <el-option label="根据房子编号" :value="homeidOption"></el-option>
  <el-option label="根据面积" :value="homesizeOption"></el-option>
  <el-option label="价格下限" :value="homeminpriceOption"></el-option>
  <el-option label="价格上限" :value="homemaxpriceOption"></el-option>
    
    </el-select>
    <el-button @click="search" slot="append" icon="el-icon-search">查询</el-button>
  </el-input>

</div>
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
      width="300">
    </el-table-column>

    <el-table-column
      prop="landlordphone"
      label="房主电话"
      width="120">
    </el-table-column>
  </el-table>
</div>
</template>
<style>
  
  .el-select .el-input {
    width: 130px;
  }
  .input-with-select .el-input-group__prepend {
    background-color: #fff;
  }
</style>
<script>
import axios from 'axios'
export default {
  data() {
    return {
      findbyid:'',
      tableData: [],
      select: '',
      homeidOption: 'homeid',
      homeaddressOption: 'homeaddress',
      homesizeOption: 'homesize',
      homeminpriceOption: 'homeminprice',
      homemaxpriceOption: 'homemaxprice',

    }
  },
  methods:{
    search(){
      const this_ = this
      console.log(this.select)
      console.log(this.findbyid)
      if(this_.select=='homeid'){
      axios.post("http://localhost:8085/app2/homeid",this_.findbyid,{ headers: {'Content-Type': 'application/json'} }).then(function(response){
        console.log(response)
        this_.tableData = response.data

    })
    }
    if(this.select=='homeaddress'){
      axios.post("http://localhost:8085/app2/homeaddress",this.findbyid,{ headers: {'Content-Type': 'application/json'} }).then(function(response){
        console.log(response)
        this_.tableData = response.data
    })
    }
    if(this.select=='homesize'){
      axios.post("http://localhost:8085/app2/homesize",this.findbyid,{ headers: {'Content-Type': 'application/json'} }).then(function(response){
        console.log(response)
        this_.tableData = response.data
    })
    }
    if(this.select=='homeminprice'){
      axios.post("http://localhost:8085/app2/homeminprice",this.findbyid,{ headers: {'Content-Type': 'application/json'} }).then(function(response){
        console.log(response)
        this_.tableData = response.data
    })
    }
    if(this.select=='homemaxprice'){
      axios.post("http://localhost:8085/app2/homemaxprice",this.findbyid,{ headers: {'Content-Type': 'application/json'} }).then(function(response){
        console.log(response)
        this_.tableData = response.data
    })
    }
  }
}
}
</script>