<template>
    <el-container>
        <el-aside width="200px" >
            <navaside></navaside>
        </el-aside>
        <el-main style="--el-main-padding: 0px;" >
            <zmd></zmd>
        </el-main>
    </el-container>

    <el-row class="fooler">
   <el-col :span="8"><div class="grid-conten " /></el-col>
   <el-col :span="8"><div class="grid-conten" />酒店一楼</el-col>
   <el-col :span="8"><div class="grid-conten " /></el-col>
  </el-row>
  <routerLink to="/detailes"><card1></card1></routerLink>
  <el-row class="fooler">
   <el-col :span="8"><div class="grid-conten " /></el-col>
   <el-col :span="8"><div class="grid-conten" />酒店二楼</el-col>
   <el-col :span="8"><div class="grid-conten " /></el-col>
  </el-row>
  <routerLink to="/detailes"><card2></card2></routerLink>
  <el-row class="fooler">
   <el-col :span="8"><div class="grid-conten " /></el-col>
   <el-col :span="8"><div class="grid-conten" />酒店三楼</el-col>
   <el-col :span="8"><div class="grid-conten " /></el-col>
  </el-row>
  <routerLink to="/detailes"><card3></card3></routerLink>
  <el-row class="fooler">
   <el-col :span="8"><div class="grid-conten " /></el-col>
   <el-col :span="8"><div class="grid-conten" />酒店四楼</el-col>
   <el-col :span="8"><div class="grid-conten " /></el-col>
  </el-row>
  <routerLink to="/detailes"><card4></card4></routerLink>

  <!-- <el-divider />
  <detailes></detailes> -->
</template>

<script>
import zmd from '../components/zmd.vue'
import card2 from '../components/card2.vue'
import card1 from "../components/card1.vue"
import card3 from "../components/card3.vue"
import card4 from "../components/card4.vue"
import navaside from "../components/navaside.vue"


export default{
    name: 'App',
   components:{
    zmd,
    card2,
    card1,
    card3,
    card4,
    navaside,
}
}
</script>
