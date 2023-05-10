<template>
    <div class="common-layout" >
      <el-container  >
        <el-header>
          <navindex2 style="background-color: #159b1e;"></navindex2>
        </el-header>
        <searchnav></searchnav>
      </el-container>
      <!-- <router-view></router-view> -->
      
    </div>
    <index2></index2>
  </template>
  
  <script>
  
  import navindex from "../components/navindex.vue"
  import searchnav from "../components/searchnav.vue"
  import index2 from "./index2.vue";
  import navindex2 from "../components/navindex2.vue"

  
  export default {
    name: 'gelin',
     components:{
    //   navindex,
      searchnav,
      index2,
      navindex2
  },
    methods:{
  
    }
  }
  </script>
  
  <script setup>
  import { ref } from "vue";
  const input = ref("");
  
  
  </script>
  
  
  <style scoped>
  /* layout布局 */
  .el-row {
    margin-bottom: 20px;
  }
  .el-row:last-child {
    margin-bottom: 0;
  }
  .el-col {
    border-radius: 4px;
  }
  .grid-content {
    border-radius: 4px;
    min-height: 36px;
  }
  
  /* el容器 */
  .el-header {
    height: 59px;
    /* border-bottom: 1px solid #404553; */
    background-color: #159b1e;
    z-index: 1000;
    position: relative;
  }
  
  .flex-grow {
    flex-grow: 1;
  }
  
  .fooler{
    padding: 50px 0 50px;
    text-align: center;
    font-size: 38px;
  }
  
  </style>
  
  