<template>
            <el-menu
          :default-active="activeIndex"
          class="el-menu-demo"
          mode="horizontal"
          @select="handleSelect"
          text-color="#fff"
          active-text-color="#ffd04b"
          background-color="#083a6d"
        >
          <el-row>
            <el-col :span="2" class="first"
              ><img class="log-img" src="../assets/hotel.png" />
              <div class="grid-content ep-bg-purple-dark"
            /></el-col>
            <el-col :span="2" :offset="6"
              ><div class="grid-content ep-bg-purple"
            /></el-col>
          </el-row>
          <div class="flex-grow" />
          <el-menu-item index="0" id="indexEvent" ><routerLink to="/gelin">首页</routerLink></el-menu-item>
          <el-menu-item index="1"><routerLink to="/allroom/0">全部房间</routerLink></el-menu-item>
          <el-menu-item index="2" ><routerLink to="/login">马上登录</routerLink></el-menu-item>
          <el-menu-item index="3" ><routerLink to="/register">立即注册</routerLink></el-menu-item>
          <el-menu-item index="4"><routerLink to="/myorder">我的订单</routerLink></el-menu-item>
        </el-menu>
</template>

<script>

import { ref } from "vue";





export default {
    name:'navindex',
    data(){
      const activeIndex = ref("0");
      const handleSelect = (key, keyPath) => {
  // console.log(key, keyPath)
     };
      return{

        }
    },
//     mounted() {
//   this.$router.push('/index');
// },
  methods:{

  }
}
</script>

<style scoped>
.el-header {
  height: 59px;
  /* border-bottom: 1px solid #404553; */
  background-color: #083a6d;
  z-index: 1000;
  position: relative;
}
.log-img {
  width: 82px;
  height: 31px;
  border: none;
  margin: 14px;
  position: absolute;
}
.flex-grow {
  flex-grow: 1;
}

/* 消除路由的下划线 */
a {
  text-decoration: none;
}
 
.router-link-active {
  text-decoration: none;
}
</style>