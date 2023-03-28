<template>

    <v-data-table
        :headers="headers"
        :items="발전기정보view"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '발전기정보viewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            발전기정보view : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/발전기정보views'))

            temp.data._embedded.발전기정보views.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.발전기정보view = temp.data._embedded.발전기정보views;
        },
        methods: {
        }
    }
</script>

