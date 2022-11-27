<template>
  <table>
    <tr>
      <th v-for="col in columns">
        {{ col }}
      </th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
    <tr v-for="row in rows">
      <td v-for="data in row"> {{ data }}}</td>
      <td><button>Edit</button></td>
      <td><button>Delete</button></td>
    </tr>
  </table>
</template>

<script>
export default {
  name: "Table",

  props: {
    columns: Array,
    rows: {
      default: [],
      type: Array
    }
  }
}
</script>

<style scoped>

</style>