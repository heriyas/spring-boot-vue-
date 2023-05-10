<template>
<div style="text-align: center; font-size: 30px;">请点击图片选择你要选择的酒店！</div>
<routerLink to="/gelin"><img class="h" src="../assets/000.jpg" ></routerLink>
<routerLink to="/qitian"><img class="q" src="../assets/111.jpg"></routerLink>
</template>

<script>

export default{
    name:"select",
    data(){
        return{

        }
    }
}
</script>
<style>
.h{
    width: 500px;
    height: 300px;
    padding-right: 140px;
    padding-top: 30px;
}
.q{
    width: 500px;
    height: 300px;
    padding-top: 30px;
}
</style>