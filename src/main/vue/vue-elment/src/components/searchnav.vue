<template>
          <el-row style="padding: 40px 0 20px">
        <el-col :span="9" :offset="6">
          <el-input
            size="large"
            class="input-index"
            v-model="input"
            placeholder="请输入房间类型"
            style="width: 100%"
          />
        </el-col>
        <el-col :span="1">
          <el-button type="primary" :icon="Search" size="large"></el-button>
        </el-col>
      </el-row>
</template>


<script >

export default {
    name:'searchnav',
    data(){

        return{
        }
    } 
}
</script>

<script setup>
import { Search } from '@element-plus/icons-vue'
</script>