<template>
{{ u }}
<div style="margin: auto;">
      <el-input type="textarea" placeholder="请输入评论" v-model="comment.content"></el-input>
      <div style="text-align: left;">
        <el-button type="primary" @click="submint">提交</el-button>
      </div>
    </div>

    <div style="margin: 20px 0;">
    <div style="margin: 10px 0; font-size: 24px; padding: 10px 0; border-bottom: 1px solid #ccc; text-align: left;">评论列表</div>
    <div style="margin: 20px 0; text-align: left; " >
    <div style="padding: 10px 0; " v-for="item in comments " :key="item.id">

        <el-container>
            <el-aside style="width: 40px; "><el-avatar :size="30" :src="'https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png'" />
           </el-aside> 
           <el-container style="height: 50px;">
        <el-header style="background-color: #ffff; height: 15px;">{{ item.user_name }}</el-header>
        <el-main style=" color: #666; height: 20px;">{{ item.content }}</el-main>
        </el-container>
        </el-container>
    </div>
    </div>
    </div>
</template>


<script>
import axios from 'axios'
var token2 = JSON.parse(window.localStorage.getItem('access-User'));
export default{
    name:'comment',
    props: ['u'],
    data(){
        return{
          comments:[],
          comment: {
            content: ''
          }

        }
    },

    updated(){
        this.load()
    },
    
    methods: {
        load(){
            let foreign_id = this.u
            axios.get('http://localhost:8028/comment/'+ foreign_id, {
            }).then(response => {
                if (response.status === 200){
                    this.comments = response.data.data
                }
            })
        },
        submint(){
        this.comment.user_id = token2.user_id
        this.comment.user_name = token2.user_name
        this.comment.foreign_id = this.u
        if(this.comment.content != "")
            fetch('http://localhost:8028/comment', {
                method:'post',
                headers:{
                    'Content-Type': 'application/json;charset=utf-8'
                },
                body: JSON.stringify(this.comment)
            }).then(res => {
                if (res.status === 200){
                    this.$notify('成功')
                    this.comment = {}
                    this.load()
                }
            })
        }

    }
}
</script>