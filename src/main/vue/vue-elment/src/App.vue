<template>
  <div class="common-layout">
    
    <router-view></router-view>
  </div>

  <el-divider />

<div  style="text-align: center;">
<span >&copy;</span> 
<span>酒店服务系统</span>
<span >all right by 邹伟豪  2023</span>
 </div>
</template>

<script>



export default {
  name: 'App',
  data(){
    return{
    }

  },
  mounted() {
  this.$router.push('/login');
  }
}



</script>


<style >
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

