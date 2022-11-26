<template>
<Table :columns="columns"></Table>
</template>

<script>
import Table from "./layouts/Table.vue";
export default {
  name: "Faculty",
  components: {Table},
  data: () => ({
     columns: ["ID", "Name", "University"]
  })
}
</script>

<style scoped>

</style>