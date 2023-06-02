<template>
  <div id="back" > 
  <el-container >
  <el-header>房屋租赁中介管理系统</el-header>
  
  <el-container>
    <el-aside width="200px">
      房东信息
    </el-aside>

    <el-main>
    <Main>
      
      <Lordinfo></Lordinfo>
    </Main>
    </el-main>

  </el-container>
</el-container>
  </div>
</template>


<script>
import Lordinfo from './Lordinfo.vue'

export default {
  name: 'Preface',
  components: {
    Lordinfo
  }
}
</script>

<style>
  .el-header {
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    line-height: 60px;
  }
  .el-aside {
    background-color: #D3DCE6;
    color: #333;
    text-align: center;
    line-height: 200px;
  }
  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    line-height: 160px;
  }
  body > .el-container {
    margin-bottom: 40px;
    
  }
  #back{
  width:100%;
  height:100%;
  top: 0;
  left: 0;
  position: fixed;
  background-size: 100% 100%;
  z-index: -1;
}

</style>