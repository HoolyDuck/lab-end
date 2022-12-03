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

      <td v-for="data in row" >
        {{ data }}
      </td>

      <td>
        <button>
          <router-link :to="'/' + entity + '/edit/' + row.id">Edit</router-link>
        </button>
      </td>
      <td>
        <button>
          <router-link :to="'/' + entity + '/delete/' + row.id">Delete</router-link>
        </button>
      </td>
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
    },
    entity: String
  }

}


</script>

<style scoped>

</style>