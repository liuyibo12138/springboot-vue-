<template>
  <div>
  
    <el-container style="height: 700px; border: 1px solid #eee">
      <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
        <el-menu router :default-active="$route.path">
          <el-submenu>
            <template slot="title"><i class="el-icon-s-custom"></i>房东信息</template>
            <el-menu-item  index="/myinfo"><i class="el-icon-phone"></i>联系房东</el-menu-item>
          </el-submenu>
          <el-submenu>
            <template slot="title"><i class="el-icon-pie-chart"></i>租房管理</template>
            <el-menu-item index="/homeinfo"><i class="el-icon-view"></i>房屋信息</el-menu-item>
            <el-menu-item index="/search"><i class="el-icon-s-opportunity"></i>房屋查询</el-menu-item>
          </el-submenu>
          <el-submenu>
            <template slot="title"><i class="el-icon-s-goods"></i>缴费管理</template>
            <el-menu-item index="/leaseinfo"><i class="el-icon-s-flag"></i>我租的房</el-menu-item>
          </el-submenu>
        </el-menu>
      </el-aside>
      <el-container>

        <el-header style="text-align: right; font-size: 18px">
        <span>欢迎登陆租房管理系统！</span>
      </el-header>
 
      <el-main>
      <template>
      <router-view></router-view>
    </template>
  </el-main>
    <el-pagination
      background
      layout="prev, pager, next"
      :page-size="6"
      :total="total"
      @current-change="page"
      >
    </el-pagination>
    </el-container>
  </el-container>

  </div>
  </template>
</template>
<style>
  .el-header {
    background-color: #B3C0D1;
    color: #333;
    line-height: 60px;
  }
  
  .el-aside {
    color: #333;
  }
  鼠标移入：
.el-menu-item:hover {
color: #a0cfff;
background-color: #eaeeff !important;
}

选中：
.el-menu-item.is-active {
color: #6681fa;
background-color: #eaeeff !important;
}

</style>

<script>
import axios from 'axios';
  export default {
    data() {
      return {
        total:null,
        item : []
      }
    },
    methods:{

    },
    created(){

    }
  };
</script>
