<template>
  <div class="card" style="margin-bottom: 10px">
    <el-input
        style="width: 240px; margin-right: 8px"
        v-model="data.input"
        placeholder="请输入查询内容"
        prefix-icon="Search"
    ></el-input>
    <el-button type="primary" @click="load">查询</el-button>
    <el-button type="primary" style="background-color: #e86e6e;" @click="reset">重置</el-button>
  </div>
  <div class="card">
    <el-button type="primary">新增</el-button>
    <el-button type="primary" style="background-color: #e86e6e;">批量删除</el-button>
  </div>
  <div class="card">
    <el-table :data="data.tableData" style="width: 100%">
      <el-table-column label="ID号" prop="userId"></el-table-column>
      <el-table-column label="名称" prop="username"></el-table-column>
      <el-table-column label="密码" prop="password"></el-table-column>
      <el-table-column label="邮箱" prop="email"></el-table-column>
      <el-table-column label="手机号" prop="phone"></el-table-column>
    </el-table>
  </div>
</template>

<script setup>
import { reactive } from 'vue';
import { Search } from '@element-plus/icons-vue';
import axios from 'axios';

const data = reactive({
  input: null,
  tableData: [],
  pageNum: 1,
  pageSize: 5,
  total: 0,
});

const load = async () => {
  try {
    const response = await axios.get('http://localhost:8080/users', {
      params: {
        pageNum: data.pageNum,
        pageSize: data.pageSize,
      },
    });
    console.log(response.data);
    data.tableData = response.data;
  } catch (error) {
    console.error("获取用户信息时出错！", error);
  }
};

const reset = () => {
  data.input = null;
  data.pageNum = 1;
  data.pageSize = 5;
  load();
};

// 初始化加载数据
load();
</script>

<style scoped>
.card {
  background-color: white;
  padding: 10px;
  border-radius: 5px;
  box-shadow: 0 0 8px rgb(192, 192, 192);
}
</style>



