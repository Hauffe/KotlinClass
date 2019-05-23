import Constants.Companion.RED
import kotlin.math.*

fun main(args: Array<String>){

}














/*----------------------------------------------------------*/
fun handelingNullPointerException(){
    var nullValue:String? = null
    println(nullValue)

    val l:Int? = nullValue?.length

    val message:String = if(l != null) {
        "Length: $l"
    } else {
        "l is null"
    }
    println(message)

    val l2:Int = l ?: -1
    println("$l2")

    try {
        val l3:Int = l!!
        println("$l3")
    }catch (e: KotlinNullPointerException){
        println("l3 is null")
    }
}
















/*----------------------------------------------------------*/

fun switchCaseClass(){
    val state:String? = readLine() //? accepts null
    if (state.equals("CA")){
        println("The capital is Sacramento")
    }

    val capital:String? = when (state){ //switch case
        "CA"->  "Sacremetno"
        "OR"->  "Salem"
        else->  "Unknown"
    }

    println("Capital is $capital")

    when (state) {
        "CA", "OR", "WA" -> println("West Coast")
        "NH", "VT", "MA" -> println("New Eng")
        else->  println("Unknown")
    }

    val theAnsware = 50

    when (theAnsware){
        in 1..39 -> print("Not yet")
        in 40..45  -> print("close enough")
        else -> {
            print("Not ")
            print("yet")
        }
    }
}












/*----------------------------------------------------------*/
/*Functions and parameters */
fun functionClass(){
    val num1 = 15.0
    val num2 = 10.0

    val result:Double = addValues(num1, num2)
    val result2:Double = addValues(param2 = num2, param1 = num1)
    val sum:Int = addValues(1, 2, 5, 7)
    println("Sum = $sum")

    println("$result  $result2")
    println(calcValues(param2 = num2, param1 = num1, op = "-"))
    println(calcValues(param2 = num2, param1 = num1))
    println(changeSomething(num2))
}


fun addValues(param1: Double, param2: Double): Double{
    return param1+param2
}

fun calcValues(param1: Double, param2: Double, op:String = "+"): Double{
    if (op.equals("+")){
        return param1+param2
    }else if(op.equals("-")){
        return param1-param2
    }else{
        return -1.0
    }
}

fun changeSomething(param:Double){
    //param++
    var copy:Double = param
    copy++
    println("Copy is $copy")
}

fun addValues(vararg numbers: Int):Int{
    var result = 0
    for (i:Int in numbers){
        result+=i
    }
    return result
}



















/*----------------------------------------------------------*/
/*Variables*/
fun firstClasses(){
    println("the color is $RED")

    var num1 = 15
    val num2 = 10
    val myInt = 42
    val myLong:Long = myInt.toLong()
    val math:Boolean = (num1==num2)
    val math2:Boolean = (num1.equals(num2))
    val num3 = num1.inc()
    // println("My long is ${myLong::class.simpleName}")
    // println("comparison result - ${num1.compareTo(num2)}")

    num1++
    //println("num1 = $num1")
    //println("num1 = ${++num1}")




    val sum:Int = num1+num2

    val plus:Int= num1.plus(num2)

    val minus:Int = num1.minus(num2)

    val times:Int = num1.times(num2)

    val div:Double = num1.toDouble().div(num2)

    val diff:Int = num1 - num2

    val remainder:Int = num2.rem(num1)

    val neg = -152.5
    val absolute:Double = abs(neg)
    //println("absolute = $absolute")
    //println("rounded = ${round(absolute)}")
    //println("PI = $PI")


    var aString = "Hello"
    //println(aString)

    val empty = String()

    val charArray:CharArray = aString.toCharArray()
    //println(aString.toList())

    val byteArray:ByteArray = aString.toByteArray()
    //println(byteArray.toList())

    aString += " and Welcome"
    //println(aString)

    val len:Int = aString.length

    for (i:Int in 0 until len){
        val c:Char = aString.get(i)
        //println(c)
    }

    val p = aString.indexOf("W")
    val sub = aString.substring(p)
    //print(sub)

    val string2:String = aString.toUpperCase()
    val match:Boolean = aString.equals(string2, true)
    //println(match)


    val builder = StringBuilder("to be or not to be\n")
            .append("that is the question\n")

    val result:String = builder.toString()
    println(result)
}