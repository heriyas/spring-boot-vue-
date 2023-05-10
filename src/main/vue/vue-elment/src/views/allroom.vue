
<template>
    <el-card class="box-card">
      <template #header >
    <el-breadcrumb separator="/">
    <el-breadcrumb-item :to="{ path: '/' }">酒店首页</el-breadcrumb-item>
    <el-breadcrumb-item
      ><a href="/">类别</a></el-breadcrumb-item
    >
    <el-breadcrumb-item>全部</el-breadcrumb-item>
  </el-breadcrumb>
      </template>
        <div class="card-body" >
            <el-icon><ArrowRight /></el-icon>
          <span >&nbsp;&nbsp;类别:</span>
          <el-button class="button" text>&nbsp;全部</el-button>
          <el-button class="button" text>&nbsp;单人间</el-button>
          <el-button class="button" text>&nbsp;标准间</el-button>
          <el-button class="button" text>&nbsp;商务间</el-button>
          <el-button class="button" text>&nbsp;豪华间</el-button>
        </div>
        <div class="card-body">
            <el-icon><Memo /></el-icon>
          <span>&nbsp;&nbsp;层楼:</span>
          <el-button class="button" text>&nbsp;全部</el-button>
          <el-button class="button" text>&nbsp;一楼</el-button>
          <el-button class="button" text>&nbsp;二楼</el-button>
          <el-button class="button" text>&nbsp;三楼</el-button>
          <el-button class="button" text>&nbsp;四楼</el-button>
        </div>
        <div>筛选出:{{ roomData.length }}个</div>
    </el-card>
    <card :roomData="roomData"></card>
  </template>



<script >
import card from '../components/card.vue'
import axios from "axios";

export default {
    name: 'allroom',
    props: ['id'],
    data(){
        return {
          roomData: []
        }
    },
    components: {
        card
    },
    mounted(){
      if (this.id === '0') {
      this.method0();
    } else if (this.id === '1') {
      this.method1();
    } else if (this.id === '2') {
      this.method2();
    } else if (this.id === '3') {
      this.method3();
    } else if (this.id === '4') {
      this.method4();
    } 
  },
  methods:{
    method0(){
      axios.get("http://localhost:8028/asideGetAll")
      .then(response => {
        // 处理返回的数据
        this.roomData = response.data.data
        console.log(this.roomData )
        
      })
      .catch(error => {
        console.log(error)
      });
    },
    method1(){
      axios.get("http://localhost:8028/asideDanRen")
      .then(response => {
        // 处理返回的数据
        this.roomData = response.data.data
        console.log(this.roomData )
        
      })
      .catch(error => {
        console.log(error)
      });
    },
    method2(){
      axios.get("http://localhost:8028/asideBiaoZhun")
      .then(response => {
        // 处理返回的数据
        this.roomData = response.data.data
        console.log(this.roomData )
        
      })
      .catch(error => {
        console.log(error)
      });
    },
    method3(){
      axios.get("http://localhost:8028/asideShangWu")
      .then(response => {
        // 处理返回的数据
        this.roomData = response.data.data
        console.log(this.roomData )
        
      })
      .catch(error => {
        console.log(error)
      });
    },
    method4(){
      axios.get("http://localhost:8028/asideHaoHua")
      .then(response => {
        // 处理返回的数据
        this.roomData = response.data.data
        console.log(this.roomData )
        
      })
      .catch(error => {
        console.log(error)
      });
    }
  }

}
</script>

  <style>
  .card-header {
    padding: auto;
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  
  .text {
    font-size: 14px;
  }
  
  .item {
    margin-bottom: 18px;
  }
  
  .box-card {
    width: 1180px;
  }
  </style>
  