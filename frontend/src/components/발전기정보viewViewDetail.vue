<template>

    <v-card outlined>
        <v-card-title>
            발전기정보view # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: '발전기정보viewViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/발전기정보views/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

