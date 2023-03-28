<template>

    <v-card outlined>
        <v-card-title>
            시간별계량치
        </v-card-title>

        <v-card-text>
            <Number label="HourCode" v-model="value.hourCode" :editMode="editMode"/>
            <Number label="Power" v-model="value.power" :editMode="editMode"/>
            <Number label="MarketPrice" v-model="value.marketPrice" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions v-if="inList">
            <slot name="actions"></slot>
        </v-card-actions>
    </v-card>
</template>

<script>

    export default {
        name: '시간별계량치',
        components:{},
        props: {
            value: [Object, String, Number, Boolean, Array],
            editMode: Boolean,
            isNew: Boolean,
            offline: Boolean,
            inList: Boolean,
            label: String,
        },
        data: () => ({
        }),
        async created() {
            if(!Object.values(this.value)[0]) {
                this.$emit('input', {});
                this.newValue = {
                    'hourCode': '',
                    'power': '',
                    'marketPrice': '',
                }
            }
            if(typeof this.value === 'object') {
                if(!('hourCode' in this.value)) {
                    this.value.hourCode = 0;
                }
                if(!('power' in this.value)) {
                    this.value.power = 0;
                }
                if(!('marketPrice' in this.value)) {
                    this.value.marketPrice = 0;
                }
            }
        },
        watch: {
            value(val) {
                this.$emit('input', val);
            },
            newValue(val) {
                this.$emit('input', val);
            },
        },

        methods: {
            edit() {
                this.editMode = true;
            },
            async add() {
                this.editMode = false;
                this.$emit('input', this.value);

                if(this.isNew){
                    this.$emit('add', this.value);
                } else {
                    this.$emit('edit', this.value);
                }
            },
            async remove(){
                this.editMode = false;
                this.isDeleted = true;

                this.$emit('input', this.value);
                this.$emit('delete', this.value);
            },
            change(){
                this.$emit('change', this.value);
            },
        }
    }
</script>

