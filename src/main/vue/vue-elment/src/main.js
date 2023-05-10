import { createApp } from 'vue'
import App from './App.vue'
import './registerServiceWorker'
import router from './router'
import store from './store'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
// npm install element-plus --save 安装方式
import elementIcon from "./plugins/icons"
import axios from 'axios'
// npm install @element-plus/icons-vue  字体图标下载方式
// 将Axios挂载到全局


const app = createApp(App)
app.config.globalProperties.$axios = axios
app.use(ElementPlus).use(elementIcon).use(store).use(router).mount('#app')


