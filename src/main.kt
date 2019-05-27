import Constants.Companion.RED
import java.lang.Exception
import java.lang.NumberFormatException
import kotlin.math.*

fun main(args: Array<String>){


}




/******Calculator*****************/

fun calculator(){
    try {
        val number1:Double = MathLib.getInput("Value1: ")
        val number2:Double =  MathLib.getInput("Value2: ")
        print("Operation + - * /   :")
        val op:String? = readLine()

        val result:Double? = MathLib.operations(number1, number2, op.toString())

        if (result != -1.0){
            println("Result: ${result}")
        }else{
            println("Operation not permitted ")
        }

    } catch (e:KotlinNullPointerException){
        println("Value was null")
    } catch (e: NumberFormatException){
        println("${e.message} is not a number")
    }
}



fun operations(param1: Double, param2: Double, op: String = "+"):Double{
    when(op){
        "+" -> return (param1+param2)
        "-" -> return (param1-param2)
        "*" -> return (param1*param2)
        "/" -> return (param1/param2)
        else -> throw Exception("Unknown operation")
    }
}



/**********************************/

fun exception (){
    try {
        print("val 1:")
        val value1:String? = readLine()
        val d1:Double = value1!!.toDouble() //null assertion

        print("val 2:")
        val value2:String? = readLine()
        val d2:Double = value2!!.toDouble() //null assertion

        val sum:Double = d1+d2
        println("Answare: $sum")
    } catch (e:KotlinNullPointerException){
        println("Value was null")
    } catch (e: NumberFormatException){
        println("${e.message} is not a number")
    }
}

fun loop(){
    val states: Array<String> = arrayOf("CA", "OR", "WA")
    var counter = 0

    printHeader("While loop")
    while (counter < states.size){
        println("Counter = $counter")
        println("State - ${states[counter]} or ${states.get(counter)}")
        counter ++
    }

    printHeader("Do / Wile loop")
    counter = 0
    do {
        println("Counter = $counter")
        println("State - ${states[counter]} or ${states.get(counter)}")
        counter ++
    }while (counter < states.size)
}



fun colections(){
    val colors: Array<String> = arrayOf("Red", "Green", "Blue")
    val values: IntArray = intArrayOf(1, 3, 5, 7, 9)

    printHeader("For each loop")
    for (color:String in colors){
        println(color)
    }
    for (value:Int in values){
        println(value)
    }

    printHeader("Forloop with indices")
    for(i in values.indices step 2){
        println(values[i])
    }
    printHeader("Forloop with size")
    for(i in 0 until colors.size){
        println(colors[i])
    }

}

fun printHeader(label: String){
    println("*****************")
    println(label)
    println("*****************")
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
        val l3:Int = l!!  // null assertion
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