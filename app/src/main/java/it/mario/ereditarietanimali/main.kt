package it.mario.ereditarietanimali

fun main() {

    // creo un oggetto cane
    val fido = Cane("Labrador","Abbaia",
    4,true,Movimento.CAMMINA,"Fido",10)

    // metto il cane nell'array
    val arrayCani = arrayOf(fido)
    // stampo il report per ogni cane
    for (cane in arrayCani){
        cane.stampaReport()
    }
}
