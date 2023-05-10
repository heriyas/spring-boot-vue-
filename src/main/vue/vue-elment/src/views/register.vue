<template>
    <body id="paper">
    <el-form :model="registerForm" :rules="rules" class="login-container" label-position="left"
             label-width="0px" v-loading="loading">
      <h3 class="login_title">用户注册</h3>
      <el-form-item prop="username">
        <el-input type="text" v-model="registerForm.user_id"
                  auto-complete="off" placeholder="账号"></el-input>
      </el-form-item>
      <el-form-item prop="username">
        <el-input type="text" v-model="registerForm.user_name"
                  auto-complete="off" placeholder="用户名"></el-input>
      </el-form-item>
      <el-form-item prop="password">
        <el-input type="password" v-model="registerForm.user_password"
                  auto-complete="off" placeholder="密码"></el-input>
      </el-form-item>
  
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 100%;background: #505458;border: none;" v-on:click="register">立即注册</el-button>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 100%;background: #505458;border: none;" v-on:click="tologin">返回</el-button>
      </el-form-item>
    </el-form>
    </body>
  </template>
  
  <script>
  import axios from 'axios'
  export default{
    name: 'Register',
    data () {
      return {
        rules: {
          user_id: [{required: true, message: '用户名不能为空', trigger: 'blur'}],
          user_password: [{required: true, message: '密码不能为空', trigger: 'blur'}],
          user_name: [{required: true, message: '用户名', trigger: 'blur'}]
        },
        checked: true,
        registerForm: {
            user_id: '',
            user_password: '',
            user_name: '',
            user_role: 'User'
        },
        loading: false
      }
    },
    methods: {
      register () {
        var _this = this
        axios.post("http://localhost:8028/userAdd_a",{
            user_id:this.registerForm.user_id,
            user_password:this.registerForm.user_password,
            user_name:this.registerForm.user_name,
            user_role: 'User'
            })
          .then(function (response) {
              if(response.data.code === 200){
                alert("恭喜你，注册成功")
              //   _this.$message({
              //   message: '恭喜你，注册成功',
              //   type: 'success'
              // })
              _this.$router.replace('/login')
              }
              else {
                _this.$message({
                message: '该用户名已存在，请更换一个',
                type: 'error'
              })
              }
            })
          .catch(function (error) {
              console.log(error)
            })
      },
      tologin () {
        this.$router.replace('/login')
      }
    }
  }
  </script>
  
  <style>
    #paper {
      /*background:url("../assets/img/bg/eva1.jpg") no-repeat;*/
      background-position: center;
      height: 100%;
      width: 100%;
      background-size: cover;
      position: fixed;
    }
    body{
      margin: -5px 0px;
    }
    .login-container {
      border-radius: 15px;
      background-clip: padding-box;
      margin: 160px auto;
      width: 350px;
      padding: 35px 35px 15px 35px;
      background: #fff;
      border: 1px solid #eaeaea;
      box-shadow: 0 0 25px #cac6c6;
    }
    .login_title {
      margin: 0px auto 40px auto;
      text-align: center;
      color: #505458;
    }
    .login_remember {
      margin: 0px 0px 35px 0px;
      text-align: left;
    }
  </style>
  