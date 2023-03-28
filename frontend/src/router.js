
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import 계량Manager from "./components/listers/계량Cards"
import 계량Detail from "./components/listers/계량Detail"

import 정산Manager from "./components/listers/정산Cards"
import 정산Detail from "./components/listers/정산Detail"

import 입찰Manager from "./components/listers/입찰Cards"
import 입찰Detail from "./components/listers/입찰Detail"

import 발전기정보Manager from "./components/listers/발전기정보Cards"
import 발전기정보Detail from "./components/listers/발전기정보Detail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/계량',
                name: '계량Manager',
                component: 계량Manager
            },
            {
                path: '/계량/:id',
                name: '계량Detail',
                component: 계량Detail
            },

            {
                path: '/정산',
                name: '정산Manager',
                component: 정산Manager
            },
            {
                path: '/정산/:id',
                name: '정산Detail',
                component: 정산Detail
            },

            {
                path: '/입찰',
                name: '입찰Manager',
                component: 입찰Manager
            },
            {
                path: '/입찰/:id',
                name: '입찰Detail',
                component: 입찰Detail
            },

            {
                path: '/발전기정보',
                name: '발전기정보Manager',
                component: 발전기정보Manager
            },
            {
                path: '/발전기정보/:id',
                name: '발전기정보Detail',
                component: 발전기정보Detail
            },



    ]
})
