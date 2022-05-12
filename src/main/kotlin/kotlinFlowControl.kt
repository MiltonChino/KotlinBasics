fun main() {
    println("Hello World!")
    println()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

//    ------CONDITIONALS IF------------
    var num1 = 0
    println("----FLOW CONTROL----")
    println("--Conditional If..else----")
    println()
    print("Please type a number: ")
    val num2 = readLine()
    if(num2 != null) {
        num1 = num2.toInt()
    }

    if (num1>0){
        print("$num1 is a Positive Number")
    } else if (num1==0){
        print("Right in the middle")
    }
    else {
        print("$num1 is a Negative Number")
    }
    println()
    println("// Here we used an immutable variable (val) to save the input value")
    println("// We also used an mutable variable (var) to check a null value " +
            "and then replace the initial value with the input value")
    println()

//    WHEN STATEMENT
    val a = 12
    val b = 5
    println("--Conditional When-----")
    print("Enter operator either +, -, * or /: ")
    val result = when (readLine()) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "Is an invalid operator."
    }
    val operation = when (result) {
        17 -> "$a + $b"
        7 -> "$a - $b"
        60 -> "$a * $b"
        2.4 -> "$a / $b"
        else -> "Something went wrong"
    }
    println("$operation = $result")
    println()

//      FOR LOOP------------
    println("--FOR Loop")
    println()
    println("// Here we evaluate an array with the names of some heroes and" +
            " display the ones with an even index value")
    val heroes = arrayOf("Spider-man", "Captain America", "Iron-man", "Thor","Hulk")

    for( hero in heroes.indices){
        if (hero % 2 == 0) {println(heroes[hero])}
    }
    println()
    println("// Let's print the complete team")
    for( hero in heroes.indices){
        println(heroes[hero])
    }
    println()
//    DO WHILE LOOP
    println("--Do While Loop----")
    println()
    var sum1 = 0
    var input2: String
    println("// Add numbers until user enters number zero (0)")
    do {
        print("Enter an integer: ")
        input2 = readLine()!!
        sum1 += input2.toInt()

        } while (input2 != "0")

        println("sum = $sum1")
        println()


// CONTINUE---------
    var number: Int
    var sum2 = 0
    println("--Continue and Break for Loops----")
    println()
    println("// Here is a FOR loop that adds up an input value up to 10 times\n" +
            "The loop continues, or skips the process if user enters a negative value\n")
    println()
    for (i in 1..10) {
        print("Enter an integer: ")
        number = readLine()!!.toInt() // !! not-null assertion operator
        if (number <= 0) continue
        sum2 += number
    }
    println("sum = $sum2")
    println()
    println("Try exchanging continue with break keyword to see what happens")
}