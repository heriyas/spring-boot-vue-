<template>
    <el-menu
  :default-active="activeIndexb"
  class="el-menu-demo"
  @select="handleSelectb"
  text-color="#fff"
  active-text-color="#ffd04b"
  background-color=" #159b1e"
>
  <el-menu-item index="0" background-color="#083a6d"><routerLink to="/allroom/0">房间分类</routerLink></el-menu-item>
  <el-menu-item index="1"><routerLink to="/allroom/1">单人间</routerLink></el-menu-item>
  <el-menu-item index="2"><routerLink to="/allroom/2">标准间</routerLink></el-menu-item>
  <el-menu-item index="3"><routerLink to="/allroom/3">商务间</routerLink></el-menu-item>
  <el-menu-item index="4"><routerLink to="/allroom/4">豪华间</routerLink></el-menu-item>
</el-menu>
<div style="height: 180px;width: 199px; background-color: #159b1e"></div>
</template>

<script>
import { ref } from "vue";

export default {
name:'navaside',
data(){
const activeIndexb = ref("0");
const handleSelectb = (key, keyPath) => {
};
return{
}
},

}
</script>

<style>

a {
text-decoration: none;
color: #fff;
}

.router-link-active {
text-decoration: none;
color: #fff;
}
</style>