fun main() {
    println("Hello World!")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

//    ------CONDITIONALS IF------------
    var num1 = -10
    print("Please type a number: ")
    val num2 = readLine()
    if(num2 != null) {
        num1 = num2.toInt()
    }
    if (num1>0){
        print("Positive Number")
    } else {
        print("Negative Number")
    }

//    WHEN STATEMENT
    val a = 12
    val b = 5
    println()
    println("Enter operator either +, -, * or /")
    val result = when (readLine()) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "Is an invalid operator."
    }

//    DO WHILE LOOP
    println("result = $result")

    var sum1 = 0
    var input2: String

    do {
        print("Enter an integer: ")
        input2 = readLine()!!
        sum1 += input2.toInt()

        } while (input2 != "0")

        println("sum = $sum1")

//      FOR LOOP------------
    val language = arrayOf("Ruby", "Kotlin", "Python", "Java")

    for(item in language.indices){
    if (item % 2 == 0) {println(language[item])}
}


// CONTINUE---------
    var number: Int?
    var sum2 = 0

    for (i in 1..10) {
        print("Enter an integer: ")
        number = readLine()!!.toInt() // !! not-null assertion operator

        if (number <= 0)
            continue

        sum2 += number
    }
    println("sum = $sum2")
}