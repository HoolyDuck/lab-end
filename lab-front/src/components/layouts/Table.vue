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
          {{ data }}
        </td>

        <td>
            <router-link :to="'/' + entity + '/edit/' + row.id"><img class="abutton" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUAOUPrS1o8KXzYJ-G3oGbNpNJzzJtV2qeVoRHkKh5GpGmTxr2d6CUdOU4XRLHzgh3CKE&usqp=CAU"></router-link>
        </td>
        <td>
            <router-link :to="'/' + entity + '/delete/' + row.id"><img class="abutton" src="https://www.pngall.com/wp-content/uploads/5/Delete-Bin-Trash-PNG-Clipart.png"></router-link>
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
  },
  methods: () => ({})

}


</script>

<style scoped>

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

 .crud-table th {
  font-weight: bold;
}

.abutton{
   background: rgba(0, 0, 0, 0);
   width: 24px;
   height: auto;
 }


</style>