<template>

    <v-data-table
        :headers="headers"
        :items="계량view"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '계량viewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            계량view : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/계량views'))

            temp.data._embedded.계량views.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.계량view = temp.data._embedded.계량views;
        },
        methods: {
        }
    }
</script>

