<template>
  <div class="mod-home">
    <h3>Mall</h3>
    <ul>
      <li>kk-Mall在线文档<a href="https://easydoc.xyz/doc/75716633/ZUqEdvA4/FTx6LRbR" target="_blank">Mall.doc</a></li>
      <li>前后端分离，通过token进行数据交互，可独立部署</li>
      <li>主题定制，通过scss变量统一一站式定制</li>
      <li>动态菜单，通过菜单管理统一管理访问路由</li>
      <li>数据切换，通过mock配置对接口数据／mock模拟数据进行切换</li>
      <li>发布时，可动态配置CDN静态资源／切换新旧版本</li>
      <li>演示地址：<a href="https://github.com/kirklin/kkmall" target="_blank">暂时下线</a> (账号密码：admin/admin)</li>
    </ul>
    <h3 target="_blank">读已提交：SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;</h3>
    <ul>
      <li>项目Git地址：<a href="https://github.com/kirklin/kkmall" target="_blank">https://github.com/kirklin/kkmall</a></li>
      <li>代码生成器：<a href="http://127.0.0.1:81/" target="_blank">KK-MAll_CODE</a></li>
    </ul>
    <h3>ES安装</h3>
    <h5><a href="https://raw.githubusercontent.com/elastic/elasticsearch/master/docs/src/test/resources/accounts.json">ElasticSearch测试文档[开启科学上网]</a></h5>
    <ul>
      <li>mkdir -p /mydocker/mall/elasticsearch/config</li>
      <li>mkdir -p /mydocker/mall/elasticsearch/data</li>
      <li>mkdir -p /mydocker/mall/elasticsearch/plugins</li>
      <li>echo "http.host: 0.0.0.0" >> /mydocker/mall/elasticsearch/config/elasticsearch.yml</li>
      <li>chmod -R 777 /mydocker/mall/elasticsearch/</li>
    </ul>
  </div>
</template>

<script>
  export default {
  }
</script>

<style>
  .mod-home {
    line-height: 1.5;
  }
</style>

