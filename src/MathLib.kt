import java.lang.Exception

class MathLib {

    var runningTotal = 0.0

    fun addValue(value: Double){
        runningTotal += value
    }

    companion object{
        fun operations(param1: Double, param2: Double, op: String = "+"):Double{
            when(op){
                "+" -> return (param1+param2)
                "-" -> return (param1-param2)
                "*" -> return (param1*param2)
                "/" -> return (param1/param2)
                else -> throw Exception("Unknown operation")
            }
        }

        fun getInput(title: String): Double {
            print("$title")
            val number: String? = readLine()
            return number!!.toDouble()
        }
    }
}