<template>
    
  <div>
    <el-main class="content">
      
      <img src="../assets/logo01.png" alt="" style="width: 170px; height:150px;position:relative;top:50px; display: flex;">
      <div class="title_big"><span style="position: relative;top:-90px">开始寻找属于你的家</span></div>
      <el-row><el-col :span="16" :offset="4" style="position: relative;top: -100px;">
        <el-divider></el-divider>
      </el-col>
      </el-row>
      <el-button style="position:relative;top: -300px;"  class="denglu" type="primary" icon="el-icon-user" @click="goToPage('/login')">登录</el-button>
      <el-button style="position:relative;top: -300px;" class="zuce" @click="goToPage('/Zuce')" >注册</el-button>

      <el-row>
        <el-col :span="24"  style="position: relative;top: -100px; ">
          <el-carousel height="500px" >
            <el-carousel-item v-for="item in advertises" :key="item" class="content-carousel">
              <el-image style="height: 500px" :src="item"></el-image>
            </el-carousel-item>/
          </el-carousel>

        </el-col>
      </el-row>
      <el-row class="tech">
        <el-col :span="16"  :offset="4" >
          <!-- <p class="tech-content1"></p> -->
          <p class="tech-content2">我们致力于为客户提供最优质的服务，并保证房源质量及交易透明度。我们的专业团队随时为您解答问题，为您提供各方面帮助，确保您的入住无后顾之忧，让您有宾至如归的感觉</p>
        </el-col>
        <!-- <el-col :span="16">
          <el-container>
            <el-card v-for="(tech, index) in technologys" :key="index" :body-style="{padding: '0px'}" class="tech-card">
              <el-image :src="tech.url"></el-image>
              <div class="tech-content-link">
                <el-link :underline="false">{{tech.name}}</el-link>
              </div>
            </el-card>
          </el-container>
        </el-col> -->
        
      </el-row>
    </el-main>
    <el-main class="news" style="overflow:hidden">
      <!-- <el-row>
        <el-col :span="8" :offset="2"> -->
          <div class="iw" style="display: flex;" >
          <div class="iw1" >
            <ul>
              <li><i class="el-icon-location"> 地址：衡阳市越秀区北京街豪贤路193号</i></li>
              <li><i class="el-icon-phone-outline"> 业务咨询电话 83370672，技术咨询QQ群：816054540</i></li>
              <li><i class="el-icon-s-platform"> 网址：http://localhost:8082/#/</i></li>
              <li><i class="el-icon-coordinate"> 硬居租房支持IPv6网络</i></li>
            </ul>
          </div>
          <div class="iw2" style="margin-right: 300px; margin-left: auto;" >
            <ul>
            <li>主办单位：南华大学计算机人智2102班</li>
            <li>承办单位：硬件没你硬团队</li>
            <li>声 明：请按 <a href=""> 用户协议</a> 使用本平台 | <a href="">意见反馈</a> </li>
            </ul>
          </div>
          <div style="position: relative;top: 100px;right: 50px;">
            <div class="qrcode" ref="qrCodeUrl"></div>
          <vue-qr :logoSrc="imageUrl" text="https://www.baidu.com" :size="200"></vue-qr>
          <p style="position: relative;top:-150px">扫描了解更多</p>
          </div>
          </div>
          
            
          
          <!-- <p  style="position: relative;top: -50px;display: flex;left: 100px;" >了解详情</p>
          <p  style="position: relative;top: -150px;display: flex;left: 100px;" >耀舞东方</p> -->
        <!-- </el-col>
      </el-row>  -->
      <!-- <el-row>
        <el-col :span="20" :offset="2">
          <el-container>
            <el-card shadow="never" v-for="(news, index) in ferodeNews" :key="index" :body-style="{padding: '0px'}" class="news-card">
              <el-image :src="news.url"></el-image>
              <div style="padding: -25px">
                <el-link :underline="false" class="news-info">{{news.info}}</el-link>
              </div>
            </el-card>
          </el-container>
        </el-col>
      </el-row> -->
    </el-main>
  </div>

</template>

<script>
import { Icon } from 'element-ui';
import vueQr from 'vue-qr'

export default {
  name: "Home",
  data() {
      return {
          imageUrl:require("D:/前端/初学/datavue/src/assets/images1/news/news-02.png"),
          advertises: [
              require("../assets/images1/advertisement/home1.png"),
              require("../assets/images1/advertisement/home5.jpg"),
              require("../assets/images1/advertisement/home3.jpg"),
              require("../assets/images1/advertisement/home4.jpg")
          ],
      };
  },
  methods: {
      goToPage(path) {
          this.$router.push(path); // 使用 router.push() 方法跳转到指定路径
      }
  },
  components: { Icon,vueQr }
}
</script>

<style scoped>
.content .content-carousel {
  border-radius: 6px
}
/* .content .tech { */
  /* margin: 40px 100px 25px 100px; */
/* } */
.content .tech .tech-content1 {
  font-size: 20px;
  font-weight: bold;
  margin-top: 80px;
}
.content .tech .tech-content2{
  font-size: 20px;
  margin-top: 40px;
}
.content .tech .tech-card {
  width: 180px;
  margin: 0 10px;
  height: 380px;
}
.content .tech .tech-card > .el-image {
  width: 100%;
}
.content .tech .tech-card .tech-content-link{
  padding: 14px;
}
.news {
  background-color: azure
}
 .news .news-title{
  /* font-size: 30px; */
  margin: 0;
} 
.news .news-card {
  width: 280px;
  height: 380px;
  border: none;
  padding: 20px;
  background-color: azure;
}
.news .news-card > .el-image{
  width: 100%;
}
.news .news-card .news-info {
  font-size: 16px;
}
.title_big{
  font-size: 50px;
  padding-left: -20px;
}
.denglu,zuce{
  margin-left: 1250px;

}
.el-divider {
    background-color: #afc8e2;
    height: 2px;
  }
  .content{
    background:url("D:/前端/初学/datavue/src/assets/lll.jpg");
  }

  .news{
    background: url("D:/前端/初学/datavue/src/assets/images1/news/new test2.jpg");
    background-size: cover;
    
  }
 
 li {
  list-style: none;
  text-align: left;
  height: 90px;
}
</style>