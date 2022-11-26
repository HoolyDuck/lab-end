<template>
  <table>
    <tr>
      <th v-for="col in columns">
        {{ col }}
      </th>
    </tr>
  </table>
</template>

<script>
export default {
  name: "Table",

  props: {
    columns: Array
  }
}
</script>

<style scoped>

</style>