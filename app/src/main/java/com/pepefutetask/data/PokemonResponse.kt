package com.pepefutetask.data

data class PokemonResponse (
    val count:Int ,
    val next:String ,
    val previous:String?,
    val  results:ArrayList<Pokemon> )