<template>
    <el-row>
        <el-col
          v-for="(item) in newList"
          :key="item.id"
          :span="5"
          :offset="item.id > 0 ? 1 : 0"
        >
          <el-card :body-style="{ padding: '0px' }">
            <img
              :src="item.imgView"
              class="image"
            />
            <div style="padding: 14px; text-align: center;  ">
              <span style="font-size: 18px; line-height: 26px; color: #666;">{{ item.roomstyle }}</span>
              <div class="bottom">
                <!-- <time class="time">{{ currentDate }}</time> -->
                <el-button text class="button" style="color: #ff5722;">{{ item.price }}</el-button>
                <span class="price">{{ item.roomid }}</span>
              </div>
            </div>
          </el-card>
        </el-col>
      </el-row>
      </template>
    
    <script>
    // import { id } from 'element-plus/es/locale';
    
    export default {
        name: 'card1',
        data(){
            return {
                newList:[
                    {id: 1, imgView:require('../assets/a.jpg'), roomstyle: "经济舒适单人间",price: "￥ 119", roomid: "NO.401"},
                    {id: 2, imgView:require('../assets/b.jpg'), roomstyle: "普通标准间",price: "￥ 199", roomid: "NO.402"},
                    {id: 3, imgView:require('../assets/c.jpeg'), roomstyle: "商务双床房",price: "￥ 235", roomid: "NO.403"},
                    {id: 4, imgView:require('../assets/d.jpg'), roomstyle: "豪华总统房",price: "￥ 388", roomid: "NO.404"}
                ]
                
            }
        }
    }
    </script>
      
    <style>
    /* 卡片页 */

    
    .bottom {
      margin-top: 13px;
      line-height: 12px;
    
      display: flex;
      justify-content: space-between;
      align-items: center;
    }
    
    .button {
    
      padding: 0;
      min-height: auto;
    }
    .el-card .price {
      color: rgb(255, 255, 255);
        background: rgb(204, 152, 18);
        /* padding: 3px; */
        text-align: center;
        display: inline-block;
        line-height: 100%;
        width: 67px;
        height: 20px;
    }
    .image {
      width: 100%;
      display: block;
    }
    </style>