//v2
fun unpack(x:Int, y: Int): Int {
    var r = 0

    val ta = arrayOf(
        intArrayOf(2,3,0),
        intArrayOf(3,0,0),
        intArrayOf(2,4,5),
        intArrayOf(2,5,0),
        intArrayOf(0,0,0)
    )
    val tc = arrayOf(
        intArrayOf(5,2,0),
        intArrayOf(7,0,0),
        intArrayOf(4,6,1),
        intArrayOf(3,9,0),
        intArrayOf(0,0,0)
        )
        val row = ta[x-1]
        val cell = row.indexOf(y)
        if(cell!=-1) {
            r = tc[x-1][cell]
    }
    else println("not found")
    return r
}


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
    //pack()
   // println("enter x [0]")
   // val x = readLine()?.toInt()?:0
   // println("enter y [0]")
   // val y = readLine()?.toInt()?:1
   // println(unpack(x,y))
    println(selSort.sort(arrayOf(3,45,12,44,57,1,22).toIntArray()).toList().toString())
}