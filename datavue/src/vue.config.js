
const { defineConfig } = require('@vue/cli-service')

module.exports = {
  configureWebpack: {},
  devServer: { // 环境配置
    host: '0.0.0.0',
    public: '192.168.109.1',
    port: '8080',
    https: false,
    disableHostCheck: true,
    open: false // 配置自动启动浏览器
  },
  
  transpileDependencies: true
}
