<template>
  <div class="crud-table-wrapper">
    <table class="crud-table">
      <tr>
        <th v-for="col in columns">
          {{ col }}
        </th>
        <th>Edit</th>
        <th>Delete</th>
      </tr>
      <tr v-for="row in rows">

        <td v-for="data in row">
          <div class="table-data">
          {{ data }}
          </div>
        </td>
        <td>
            <router-link :to="'/' + entity + '/edit/' + row.id"><i class="fa-solid fa-edit "></i></router-link>
        </td>
        <td>
            <router-link :to="'/' + entity + '/delete/' + row.id"><i class="fa-solid fa-trash link-color-red"></i></router-link>
        </td>
      </tr>
    </table>
  </div>
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

.link-color-red {
  color: red;
}

.crud-table-wrapper {
  overflow-x: auto;
  border: .1rem solid rgb(75, 75, 75);
}


.crud-table {
  width: 100%;
  min-width: 90vw;
  box-shadow: 3px 3px 7px rgba(0, 0, 0, 0.3);

  border-collapse: collapse;
}

.crud-table tr:nth-child(even) {
  background: rgba(255, 255, 255, .07);
}

.crud-table td, th {
  min-width: 40px;
  max-width: 200px;
  word-wrap: break-word;
  text-align: center;
  padding: .7rem 1rem .7rem 1rem;
  border-right: .1rem solid rgb(75, 75, 75);
}

.table-data {
  margin: 0 auto;
  max-height: 16rem;
  overflow-y: scroll;
}

 .crud-table th {
  font-weight: bold;
}
</style>