<template>

    <v-data-table
        :headers="headers"
        :items="meteringView"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MeteringViewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            meteringView : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/meteringViews'))

            temp.data._embedded.meteringViews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.meteringView = temp.data._embedded.meteringViews;
        },
        methods: {
        }
    }
</script>

