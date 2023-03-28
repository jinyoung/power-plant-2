<template>
    <v-card outlined>
        <v-card-title>
            정산 # {{item._links.self.href.split("/")[item._links.self.href.split("/").length - 1]}}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="YearCode" v-model="item.yearCode" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="MonthCode" v-model="item.monthCode" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="DayCode" v-model="item.dayCode" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="SubscriberId" v-model="item.subscriberId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="PlatId" v-model="item.platId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="GenerationAmount" v-model="item.generationAmount" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Mep" v-model="item.mep" :editMode="editMode" @change="change" />
            </div>
            <시간별계량치Manager offline label="시간별계량치" v-model="item.시간별계량치" :editMode="false" @change="change" />
        </v-card-text>

        <v-card-actions>
            <v-btn text color="deep-purple lighten-2" large @click="goList">List</v-btn>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="edit"
                    v-if="!editMode"
            >
                Edit
            </v-btn>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="save"
                    v-else
            >
                Save
            </v-btn>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="remove"
                    v-if="!editMode"
            >
                Delete
            </v-btn>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="editMode = false"
                    v-if="editMode"
            >
                Cancel
            </v-btn>
        </v-card-actions>
    </v-card>
</template>


<script>
    const axios = require('axios').default;

    export default {
        name: '정산Detail',
        components:{},
        props: {
        },
        data: () => ({
            item: null,
            editMode: false,
        }),
        async created() {
            var me = this;
            var params = this.$route.params;
            var temp = await axios.get(axios.fixUrl('/정산/' + params.id))
            if(temp.data) {
                me.item = temp.data
            }
        },
        methods: {
            goList() {
                var path = window.location.href.slice(window.location.href.indexOf("/#/"), window.location.href.lastIndexOf("/#"));
                path = path.replace("/#/", "/");
                this.$router.push(path);
            },
            edit() {
                this.editMode = true;
            },
            async remove(){
                try {
                    if (!this.offline) {
                        await axios.delete(axios.fixUrl(this.item._links.self.href))
                    }

                    this.editMode = false;

                    this.$emit('input', this.item);
                    this.$emit('delete', this.item);

                } catch(e) {
                    console.log(e)
                }
            },
        },
    };
</script>
