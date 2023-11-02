package it.mario.ereditarietanimali
/*
La definizione delle proprietà va fatta nel costruttore primario
razza: String
verso: String
zampe: Byte
mammifero (boolean=>  true non è mammifero )
siMuove (cammina, nuota, vola, striscia)
 */
open class Animale (
    var razza: String?=null,
    var verso: String?=null,
    var zampe: Byte?=null,
    var mammifero:Boolean, // false di default
    var siMuove: Movimento
        ){

    // StampaReport
    open fun stampaReport(){
    println("""
     Report animale:
        razza: $razza
        verso: $verso
        zampe: $zampe
        mammifero : $mammifero
        si muovo: $siMuove
        
    """.trimIndent())

    }

}