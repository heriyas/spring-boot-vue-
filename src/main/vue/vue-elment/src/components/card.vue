<template>
<el-row>
    <el-col
      v-for="(room) in roomData"
      :key="room.id"
      :span="5"
      :offset="room.id > 0 ? 1 : 0"
    >
    <router-link :to="{ name: 'detailes', query: { id: room.id } }">
    <el-card :body-style="{ padding: '0px' }"  @click="getCard(room.id)">
        <img
          :src= "room.room_img"
          class="image"
        />
        <div style="padding: 14px; text-align: center;  ">
          <span style="font-size: 18px; line-height: 26px; color: #666;">{{ room.room_style }}</span>
          <div class="bottom">
            <!-- <time class="time">{{ currentDate }}</time> -->
            <el-button text class="button" style="color: #ff5722;">NO.{{ room.room_number }}</el-button>
            <span class="price">{{ room.room_price }}</span>
          </div>
        </div>
      </el-card>
    </router-link>

    </el-col>
  </el-row>
  </template>

<script>
// import { id } from 'element-plus/es/locale';
import axios from "axios";

import { useRouter } from 'vue-router';

import router from "@/router/index.js";
 
export default {
    name: 'card',
    data(){
        return {
          // cardData: []
        }
    },
    props: {
    roomData: {
      type: Array,
      required: true,
      default: () => []
    }
  },methods: {
    getCard(id){
      // this.$router.push({ path: '/detailes/' + id})

    }
  },
}
</script>
  
<style>
/* 卡片页 */
/* .time {
  font-size: 12px;
  color: #999;
} */

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