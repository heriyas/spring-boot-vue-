<template>

<el-table size="small" current-row-key="id" :data="orders" stripe highlight-current-row>

<el-table-column type="index" text-align="center" label="序号"></el-table-column>

<el-table-column prop="form_intime" label="订单开始时时间" text-align="center" ></el-table-column>

<el-table-column prop="form_outtime" label="订单结束时间" text-align="center"></el-table-column>

<el-table-column prop="form_content" label="订单内容" text-align="center"></el-table-column>

<el-table-column prop="room_id" label="房间号" text-align="center"></el-table-column>

<el-table-column prop="style" label="房间类型" text-align="center"></el-table-column>

<el-table-column prop="user_name" label="用户名" text-align="center"></el-table-column>

</el-table>


</template>


<script>
import axios from 'axios'

var token4 = JSON.parse(window.localStorage.getItem('access-User'));
export default{
    name: "myorder",
    data(){
        return{
            orders:[{}]
        }
    },
    created() {
        this.getorders()
    },
    methods:{
        getorders(){
            axios.get('http://localhost:8028/getMyOrder/'+ token4.user_name, {
            }).then(response => {
                if (response.status === 200){
                    this.orders = response.data.data
                    console.log("==================");
                    console.log(this.orders);
                }
            })
        }
    }
}

</script>