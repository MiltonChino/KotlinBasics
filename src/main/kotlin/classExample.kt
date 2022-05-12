class Computer {

    // property (data member)
    private var isOn: Boolean = false

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }

    fun displayStatus() {
        // Here, if statement is simplified to evaluate a true value
        if (isOn) {
            println("Computer is on.")
        }
        else {
            println("Computer is off.")
        }
    }
}

//fun main() {
////    Here we create a new object from Computer class
//    val computer1 = Computer()
//    computer1.turnOn()
//    computer1.displayStatus()
//}