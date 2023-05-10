const path = require('path')
const webpack = require('webpack');
const HtmlWebpackPlugin = require('html-webpack-plugin')
const htmlPlugin = new HtmlWebpackPlugin({ // 插件创建的对象
    template: './src/index.html', // 指定要用到的模板文件
    filename: 'index.html' // 指定生成的文件名称，该文件存放在内存中，在目录中不显示
})
const VueLoaderPlugin = require('vue-loader/lib/plugin')

module.exports = {
    // 编译模式
    mode: 'development',
    entry: path.join(__dirname, './src/index.js'), // 打包入口文件的路劲
    output: {
        path: path.join(__dirname, './dist'), // 输出文件的存放路径
        filename: 'bundle.js' // 输出文件的名称
    },
    plugins: [htmlPlugin, new VueLoaderPlugin(),new webpack.ProvidePlugin({
        $: 'jquery',
        jQuery: 'jquery'
      })], //plugin数组是webpack打包期间会用到的一些插件列表
    module: {
        rules: [
            { test: /\.css$/, use: ['style-loader', 'css-loader', 'postcss-loader']},
            { test: /\.less$/, use: ['style-loader', 'css-loader','less-loader']},
            { test: /\.jpg|jpeg|png|gif|bmp|ttf|eot|svg|woff|woff2$/, use: 'url-loader?limit=16940',exclude: /assets/},
            { test: /\.js$/, use: 'babel-loader', exclude: /node_modules/},
            { test: /\.vue$/, use: 'vue-loader'}
        ]
    }
}