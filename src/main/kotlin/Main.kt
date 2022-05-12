import kotlin.contracts.contract

fun main() {
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

    // FUNCTIONS--------------
    println("--Functions-----\n")
    println("// Here we call a function to print a new greeting")
    myFunction()


    println("// Here we call a function to add two numbers")
    val number1 = 12.2
    val number2 = 3.4
    val result: Int = operateNumbers(number1, number2)

    println("result = $result")
    println()


//    CLASSES-----------------------------
    println("----CLASSES and OBJECTS----")
    println("// Here we create an object from class Computer. " +
            "Computer class is created in a separate Kotlin class file called classExample.kt\n")

    val computer1 = Computer() // Here is the creation of the object, a computer
    println("......Virtual Computer Created.")

    println("// Let's turn on our computer")
    computer1.turnOn()
    computer1.displayStatus()
    println()
    println("// Now, Let's turn off our computer")
    computer1.turnOff()
    computer1.displayStatus()

    println("// Here we create a second object from class Computer")

    val computer2 = Computer()
    println("......Second Virtual Computer Created.")

    println("// Let's turn on our second computer")
    computer2.turnOn()
    computer2.displayStatus()
    println()
    println("// Now, Let's turn off our second computer")
    computer1.turnOff()
    computer1.displayStatus()

}

// USER DEFINED FUNCTIONS

// Here is the function we call inside the main function
fun myFunction() {
    println("Hello, this is my function!")
}

// Here is the function we call inside the main function
fun operateNumbers(n1: Double, n2: Double): Int {
    val result = n1 + n2
    println("Here is the result of adding $n1 and $n2")
    return result.toInt()  // Here we change the type of the variable
}