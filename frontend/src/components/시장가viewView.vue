<template>

    <v-data-table
        :headers="headers"
        :items="시장가view"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '시장가viewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            시장가view : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/시장가views'))

            temp.data._embedded.시장가views.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.시장가view = temp.data._embedded.시장가views;
        },
        methods: {
        }
    }
</script>

