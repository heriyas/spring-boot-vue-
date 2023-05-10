<template>
  <div class="hello">
    <p>{{ message }}</p>
<ul>
  <li v-for="(item,index) in names.list" :key="index">{{ item }} </li>
</ul>
  </div>
  <button @click="clickHand">点击</button>
  <p>{{ msg }}</p>
</template>

<script>

import { ref, reactive } from 'vue';

export default {
  name: 'HelloWorld',
  props:{
    msg:String
  },
  // 组合式api
  // setup里没有this，只有ctx
    setup(props, ctx){
      console.log(ctx);
        // ref
        const message  = ref("你怎么还没死啊")
        // reactive 一般声明对象或数组
        const names = reactive({
          list:["草泥马", "操他妈"]
        })

        function clickHand(){
          console.log("点你吗");
          message.value = "点击改变消息"
        }

        const msg = props.msg;

        return{
          message,
          names,
          clickHand,
          msg
        }
    }
}
</script>

