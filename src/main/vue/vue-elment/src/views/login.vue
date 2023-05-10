<template>
    <div>
      <body id="poster">
      <el-form class="login-container" label-position="left"
               label-width="0px">
        <h3 class="login_title">系统登录</h3>
        <el-form-item>
          <el-input type="text" v-model="loginForm.user_id"
                    auto-complete="off" placeholder="账号"></el-input>
        </el-form-item>
        <el-form-item>
          <el-input type="password" v-model="loginForm.user_password"
                    auto-complete="off" placeholder="密码"></el-input>
        </el-form-item>
        <el-form-item style="width: 100%">
          <el-button type="primary" style="width: 100%;background: #505458;border: none" v-on:click="login">登录</el-button>
        </el-form-item>
        <el-form-item style="width: 100%">
          <el-button type="primary" style="width: 100%;background: #505458;border: none" v-on:click="toregister">没有账号？去注册</el-button>
        </el-form-item>
         <el-form-item style="width: 100%">
          <el-button type="primary" style="width: 100%;background: #505458;border: none" v-on:click="tohome">游客模式</el-button>
        </el-form-item>
      </el-form>
      </body>
      <div></div>
    </div>
  </template>
  <script>
import axios from 'axios'


      export default {
        name: "Login",
        data() {
          return {
            loginForm:{
              user_id:'1111',
              user_password:'1111'
            }
          }
        },
        methods: {
          login(){
            var _this = this
            axios.post("http://localhost:8028/loginAjax_zouweihao",{
                user_id:this.loginForm.user_id,
                user_password:this.loginForm.user_password,
            })
            .then(function (response) {
              console.log(response.data)
              if(response.data.code === 200){
                console.log(response.data.data)
                localStorage.setItem('access-User',JSON.stringify(response.data.data))
                _this.$message({
                  message: '登录成功',
                  type: 'success'
                })
                _this.$store.commit('/select',response.data.object)
                _this.$router.replace('/select')
              }
              else {
                // alert("账号或密码错误")
                _this.$message({
                message: '账号或密码错误',
                type: 'error'
              })
              }
            })
            .catch(function (error) {
              console.log(error)
            })
          },
          toregister(){
            this.$router.replace('/register')
          },
          tohome(){
            this.$router.replace('/select')
          }
        }
      }
  </script>
  
  
  <style>
    #poster {
      background-image: url("");
      height: 60%;
      width: 100%;
      background-size: cover;
      position: fixed;
    }
  
    body {
      margin: 0px;
    }
  
    .login-container {
      border-radius: 15px;
      background-clip: padding-box;
      margin: 90px auto;
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
  
  </style>
  