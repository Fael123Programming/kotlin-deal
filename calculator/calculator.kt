import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`) //To grab values from terminal
    var opt:Int //Chosen option from menu
    var num1:Float //First operand
    var num2:Float //Second operand
    while(true){
        menu() //Displaying my menu
        opt = input.nextInt()
        when (opt){
            1 -> {
                println("----- Sum -----")
                print("First operand: ")
                num1 = input.nextFloat()
                print("Second operand: ")
                num2 = input.nextFloat()
                println("Result: ${num1.sum(num2)}")
            }
            2 -> {
                println("----- Subt -----")
                print("First operand: ")
                num1 = input.nextFloat()
                print("Second operand: ")
                num2 = input.nextFloat()
                println("Result: ${num1.subt(num2)}")
            }
            3 -> {
                println("----- Mult -----")
                print("First operand: ")
                num1 = input.nextFloat()
                print("Second operand: ")
                num2 = input.nextFloat()
                println("Result: ${num1.mult(num2)}") 
            }
            4 -> {
                println("----- Div -----")
                print("First operand: ")
                num1 = input.nextFloat()
                print("Second operand: ")
                num2 = input.nextFloat()
                if(num2 == 0.0f) println("### Impossible to divide ###")
                else println("Result: ${num1.div(num2)}")
            }
            0 -> return
            else ->  println("### Pick a valid operation ###")
        }    
    }
}

fun Float.sum(numToAdd:Float) = this.plus(numToAdd)

fun Float.subt(numToSubt:Float) = this.minus(numToSubt)

fun Float.mult(numToMult:Float) = this.times(numToMult)

fun Float.div(numToDiv:Float) = if(numToDiv == 0.0f) -1.0f else this / numToDiv

fun menu(){
    print("----- Calculator -----\n1 - Sum\n2 - Subtract\n3 - Multiply\n4 - Divide\n0 - Exit\n-----------------------\nYour choice: ")
}