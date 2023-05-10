<template>

<el-form :model="fromType" label-width="80px"> 
                  <el-row>
                    <el-col :span= "12">
                      <el-form-item label="房间号">
                        <el-input v:model="form.form_id" disabled="disabled" placeholder="" ></el-input> </el-form-item>
                    </el-col>
                    <el-col :span= "12">
                      <el-form-item label="房间类型">
                        <el-input v:model="form.form_style" disabled="disabled" placeholder=""></el-input> </el-form-item>
                    </el-col>
                    <el-col :span= "12">
                      <el-form-item label="入住时间">
                        <el-input v:model="form.form_intime" placeholder="请选择入住时间"></el-input> </el-form-item>
                    </el-col>
                    <el-col :span= "12">
                      <el-form-item label="退房时间">
                        <el-input v:model="form.form_outtime" placeholder="请选择退房时间"></el-input> </el-form-item>
                    </el-col>
                    <el-col :span= "24">
                      <el-form-item label="我要留言">
                        <el-input :rows="3" v:model="form.form_content" type="textaarea" placeholder="请输入内容"></el-input> </el-form-item>
                    </el-col>
                  </el-row>
              </el-form>

              <div class="dialog-button-wrap">
                <!-- <el-button @click="close">取消</el-button>
                <el-button @click="addorder" type="success" :loading="subLoding" color="#083a6d">保存</el-button> -->
            
              </div>
</template>


<script setup lang="ts">
import {ref, reactive} from 'vue'

const subLoding = ref(false)
const fromType = reactive({
    form_id:'',
    form_name:'',
    form_intime:'',
    form_outtime:'',
    form_content:''

})
</script>

<style scoped>
.dialog-button-wrap {
text-align: center;
margin-top: 20px;
}
</style>