//v2

fun pack() {
  /*  val matrix = arrayOf(
        intArrayOf(0,5,2,0,0),
        intArrayOf(0,0,7,0,0),
        intArrayOf(0,4,0,6,1),
        intArrayOf(0,3,0,0,9),
        intArrayOf(0,0,0,0,0)
    ) */
    val matrix = arrayOf(
        intArrayOf(0,4,0,0,0,0),
        intArrayOf(0,0,4,0,0,0),
        intArrayOf(0,0,0,0,2,5),
        intArrayOf(2,0,0,1,6,0),
        intArrayOf(0,0,0,0,0,0),
        intArrayOf(0,7,5,8,0,0)
    )
    val al= mutableListOf<Int>()
    val j = mutableListOf<Int>()
    
    matrix.forEachIndexed { index, rows ->
        al+=0
        j+=index+1
        rows.forEachIndexed { eli, m ->
            if(m!=0) {
                al+=m
                j+=eli+1
            }
        }
    }
    al+=0
    j+=0

    println(al.toString())
    println(j.toString())
}

fun main() {
    pack()
    //unpack()
}