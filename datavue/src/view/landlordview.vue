<template>
  <div>
  
    <el-container style="height: 700px; border: 1px solid #706464">
      <el-aside width="240px" style="background-color: rgb(218, 225, 237)">
        <el-menu router>
          <el-submenu>
            <template slot="title"><i class="el-icon-user"></i>租户信息</template>
            <el-menu-item  index="/vipmyinfo"><i class="el-icon-phone"></i>联系租户</el-menu-item>
          </el-submenu>
          <el-submenu>
            <template slot="title"><i class="el-icon-s-order"></i>出租情况</template>
            <el-menu-item index="/viphomeinfo"><i class="el-icon-s-home"></i>房屋信息</el-menu-item>
            <el-menu-item index="/vipsearch"><i class="el-icon-s-opportunity"></i>房屋查询</el-menu-item>
            <el-menu-item index="/uploadhome"><i class="el-icon-upload2"></i>上传房屋</el-menu-item>
          </el-submenu>
          <el-submenu>
            <template slot="title"><i class="el-icon-setting"></i>收益管理</template>
            <el-menu-item index="vipearning"><i class="el-icon-s-fold"></i>收益信息</el-menu-item>
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
