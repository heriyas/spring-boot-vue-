<template>
    <div class="common-layout">
      <el-container>
        <el-header>
          <navindex></navindex>
        </el-header>
        <searchnav></searchnav>
      </el-container>
      <!-- <router-view></router-view> -->
      
    </div>
    <index></index>
  </template>
  
  <script>
  
  import navindex from "../components/navindex.vue"
  import searchnav from "../components/searchnav.vue"
  import index from "./index.vue";

  
  export default {
    name: 'gelin',
     components:{
      navindex,
      searchnav,
      index
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
    background-color: #083a6d;
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
  
  