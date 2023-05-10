<template>
    <el-card class="box-card">
      <template #header >
    <el-breadcrumb separator="/">
    <el-breadcrumb-item :to="{ path: '/' }">酒店首页</el-breadcrumb-item>
    <el-breadcrumb-item
      ><a href="/">类别</a></el-breadcrumb-item
    >
    <el-breadcrumb-item>房间详情</el-breadcrumb-item>
    </el-breadcrumb>

    <div class="common-layout">
      <el-container>
        <el-aside width="50%" background-color="red"><img :src="detailesData.room_img"  alt=""></el-aside>
        <el-main background-color="red">
            <div class="detial-header">{{ detailesData.room_style }}</div>
            <div class="detial-main">
                <div class="mn">房间号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{{ detailesData.room_number }}</div>
                <div class="mn">床型&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{{ detailesData.room_description }}</div>
                <div class="mn">宽带&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;免费wifi</div>
                <div class="mn">标准价&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{{ detailesData.room_price }}</div>
                <div class="mn">房间状态&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{{ detailesData.room_status }}</div>
                <el-button type="text"  style="margin-left: 20px; background-color: orange;"  @click="dialogForm= true">立即预定</el-button>
                
            <el-dialog title="弹出框" v-model="dialogForm" :visible.sync="dialogForm"  >
              <el-form v-model="form" >
                  <el-row>
                    <el-col :span= "12">
                      <el-form-item label="入住时间" :label-width="formLabelWidth">
                        <div class="block">
                          <el-date-picker
                          v-model="form.form_intime"
                          type="date"
                          placeholder="选择日期">
                          </el-date-picker>
                        </div>
                       </el-form-item>
                    </el-col>
                    <el-col :span= "12">
                      <el-form-item label="退房时间" :label-width="formLabelWidth">
                        <div class="block">
                          <el-date-picker
                          v-model="form.form_outtime"
                          type="date"
                          placeholder="选择日期">
                          </el-date-picker>
                        </div>
                      </el-form-item>
                    </el-col>
                    <el-col :span= "24">
                      <el-form-item label="我要留言" :label-width="formLabelWidth">
                        <el-input :rows="3" v-model="form.form_content" type="textarea" placeholder="请输入内容"></el-input> </el-form-item>
                    </el-col>
                  </el-row>
                  </el-form>

                  <span slot="footer" class="dialog-footer">
                   <el-button @click="dialogForm = false">取消</el-button>
                  <el-button style="color: #083a6d;" type="primary" @click="orderAdd" >确定</el-button>
      </span>

    </el-dialog>

            </div>
        </el-main>
      </el-container>
  </div>

  </template>
    </el-card>
    <comment :u="foreignId"></comment>
  
  </template>
  
<script >

import axios from "axios";
import comment from "@/components/comment.vue";
var token3 = JSON.parse(window.localStorage.getItem('access-User'));

export default {
    name: 'detailes',
    data(){

        return {
          detailesData: {},
          foreignId: Number,
          dialogForm: false,
          form: {
            form_intime:'',
            form_outtime:'',
            form_content: ''
        },
        formLabelWidth: '120px'
        }
    },
    mounted() {

      //console.log(this.$route.query)
      let id = parseInt(this.$route.query.id);
      axios.get("http://localhost:8028/getCard/"+id)
      .then(response => {
        // 处理返回的数据
        this.detailesData = response.data.data
         let min = JSON.parse(JSON.stringify(this.detailesData))
         this.foreignId = min.id
         
      })
      .catch(error => {
        console.log(error)
      });
  },
  
  methods:{

    orderAdd(){
      console.log("===========================")
      this.form.room_id = this.detailesData.room_number
      this.form.style = this.detailesData.room_style
      this.form.user_name = token3.user_name
      axios.post('http://localhost:8028/orderAdd',this.form).then((res) =>{
        if(res.data.code === 200){
          this.dialogForm = false;
          this.$notify('成功预定！')
        } else if(res.data.code === 400){
          this.$notify('预定失败，你可能余额不足！')
        } else{
            alert("出现了未知的错误！")
        }
      })
    }
    
  },
  components:{
    comment
    }

}

</script>

  <style >
  .card-header {
    padding: auto;
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  
  .text {
    font-size: 14px;
  }
  
  .item {
    margin-bottom: 18px;
  }
  
  .box-card {
    width: 1180px;
  }
  .detial-header{
    line-height: 35px;
    padding: 0 0 20px;
    font-size: 32px;
    color: #333;
  }
  .detial-main{
    width: 100%;
    height: 249px;
    background: #f5f5f5;
    padding-top: 5px;
    color: #888;
    line-height: 40px;
}
.mn{
    padding-left: 34px;
}
.my-header{
  display: flex;
  justify-content: flex-start;
  color: #083a6d;
}
.el-dialog{
  width: 60%;
}

  </style>

  