fun main() {
    println("Hello World!")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

//    ------CONDITIONALS IF------------
//    println("Type your name: ")
//    val input = readLine()
//    println(input)
//    var num3 = -10
//    print("Please type a number: ")
//    var num = readLine()
//    if(num != null) {
//        num3 = num.toInt()
//    }
//    if (num3>0){
//        print("Positive Number")
//    } else {
//        print("Negative Number")
//    }

//    WHEN STATEMENT
//    val a = 12
//    val b = 5
//
//    println("Enter operator either +, -, * or /")
//    val result = when (readLine()) {
//        "+" -> a + b
//        "-" -> a - b
//        "*" -> a * b
//        "/" -> a / b
//        else -> "Is an invalid operator."
//    }
//
//    println("result = $result")
//
//    var sum = 0
//    var input: String
//
//    do {
//        print("Enter an integer: ")
//        input = readLine()!!
//        sum += input.toInt()
//
//        } while (input != "0")
//
//        println("sum = $sum")
//    }

//      FOR LOOP------------
//    val language = arrayOf("Ruby", "Kotlin", "Python", "Java")
//
//
//    for (item in language.indices) {
//        if (item%2 == 0)
//        println(language[item])
//}

// CONTINUE---------
//    var number: Int?
//    var sum = 0
//
//    for (i in 1..10) {
//        print("Enter an integer: ")
//        number = readLine()!!.toInt() // !! not-null assertion operator
//
//        if (number <= 0)
//            continue
//
//        sum += number
//    }
//    println("sum = $sum")
//

    // FUNCTIONS--------------
//    myFunction()

//    val number1 = 12.2
//    val number2 = 3.4
//    val result: Int = addNumbers(number1, number2)
//
//    println("result = $result")

//    CLASSES-----------------------------
    val lamp = Lamp()
    lamp.turnOn()
    lamp.displayLightStatus()
    lamp.turnOff()
    lamp.displayLightStatus()

}
