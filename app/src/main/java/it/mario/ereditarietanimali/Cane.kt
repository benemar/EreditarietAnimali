package it.mario.ereditarietanimali
/*
    var razza: String?=null,
    var verso: String?=null,
    var zampe: Byte?=null,
    var mammifero:Boolean, // false di default
    var siMuove: Movimento
 */
class Cane (razza:String,
            verso:String,
            zampe:Byte,
            mammifero:Boolean,
            simuove:Movimento,
            var nome: String,
            var eta:Byte)
    : Animale (razza,verso,zampe,mammifero,simuove) {

    override fun stampaReport() {
        println(
            """
     Report animale:
        razza: $razza
        verso: $verso
        zampe: $zampe
        mammifero : $mammifero
        si muovo: $siMuove
        nome: $nome
        eta : $eta
    """.trimIndent()
        )
    }
}