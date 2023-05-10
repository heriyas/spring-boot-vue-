<template>
    <el-carousel :interval="4000" rrow="always" height="460px">
        <el-carousel-item v-for="item in imagebox" :key="item.id">
          <img :src="item.idView" class="image">
        </el-carousel-item>
      </el-carousel>
  </template>
  
  <script>
    export default{
      name:'zmd',
      data(){
        return {
          imagebox:[{id:0,idView:require('../assets/imagebox/1.jpg')},
          {id:1,idView:require('../assets/imagebox/2.jpg')},
          {id:2,idView:require('../assets/imagebox/4.jpg')},
          {id:3,idView:require('../assets/imagebox/5.jpg')}
          //imagebox是assets下一个放图片的文件夹
          ]
        }
      }
    }
  </script>
  
  <style>
     .el-carousel__item h3 {
        color: #475669;
        font-size: 14px;
        opacity: 0.75;
        line-height: 200px;
        margin: 0;
      }
  
      .el-carousel__item:nth-child(2n) {
        background-color: #99a9bf;
      }
  
      .el-carousel__item:nth-child(2n+1) {
        background-color: #d3dce6;
      }
      img{
     /*设置图片宽度和浏览器宽度一致*/
      width:100%;
      height:inherit;
    }
  </style>
  
  