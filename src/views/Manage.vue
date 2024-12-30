<template>
  <!--项目头部部分开始-->
  <div>
    <div style="height: 80px; background-color: #3c7fff;"></div>
  </div>
  <!--项目头部部分结束-->
  <!--页面布局左侧开始-->
  <div style="display: flex">
    <div style="width: 200px;border-right:1px solid #ddd;min-height: calc(100vh - 80px)">
      <el-menu router :default-active="router.currentRoute.value.path" style="border: 0">
        <el-menu-item><el-icon><House/></el-icon>系统首页</el-menu-item>
        <el-menu-item>河段管理</el-menu-item>
        <el-menu-item>水位监测</el-menu-item>

        <el-sub-menu index="1">
          <template #title>
            <el-icon></el-icon>
            <span>水质监测</span>
          </template>
          <el-menu-item index="/manage/data">浑浊度监测</el-menu-item>
          <el-menu-item>PH值监测</el-menu-item>
          <el-menu-item>溶解度值监测</el-menu-item>
        </el-sub-menu>
        <el-menu-item>用户论坛</el-menu-item>

        <el-menu-item index="/manage/User" ><el-icon><User/></el-icon>用户信息</el-menu-item>
      </el-menu>
      <!--页面布局左侧结束-->
      <!--页面布局右侧开始-->
    </div>
    <div style="flex: 1;width: 0;background-color: #e9eaff ;padding: 10px">
      <RouterView/>
    </div>
    <!--页面布局右侧结束-->
  </div>




</template>
<script setup>
import request from "@/utils/request.js";
import {reactive} from "vue";
import router from "@/router/index.js";
import {House} from "@element-plus/icons-vue";
const data=reactive({
  usersList:[]
})
request.get('/users/selectAll').then(res=>{
  console.log(res)
  data.usersList=res.data
})
</script>
