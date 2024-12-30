<template>
  <div class="card"style="margin-bottom: 10px">
    <el-input style="width: 240px;margin-right: 8px" v-model="data.input" placeholder="请输入查询内容"prefix-icon="Search"></el-input>
    <el-button type="primary">查询</el-button><el-button type="primary" style="background-color: #e86e6e;">重置</el-button>
  </div>
  <div class="card">
    <el-button type="primary">新增</el-button><el-button type="primary" style="background-color: #e86e6e;">批量删除</el-button>
  </div>
  <div class="card">
    <el-table>
      <el-table-column label="" prop=""></el-table-column>
      <el-table-column label="" prop=""></el-table-column>
      <el-table-column label="" prop=""></el-table-column>
    </el-table>
  </div>
</template>
<script setup>
import {reactive} from "vue";
import  {Search} from "@element-plus/icons-vue";
const data=reactive({
input:null,

})


</script>
<style scoped>
.card{
  background-color: white;
  padding: 10px;
  border-radius: 5px;
  box-shadow:0 0 8px rgb(192, 192, 192);
}
</style>