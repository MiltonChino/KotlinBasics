class Student {

    // property (data member)
    private var isRegistered: Boolean = false
    var firstName: String = "Unknown"
    var lastName: String = ""
    var age: Int = 0
    private var status = ""

    // member function
    fun enroll() {
        isRegistered = true
    }
    // member function
    fun unregister() {
        isRegistered = false
    }
    fun displayStatus(): String{
        status =  if(isRegistered){ "Registered."}
        else{"Unregistered."}

        return status
    }
    fun displayStudent(){

        println("First Name: $firstName")
        println("Last Name: $lastName")
        println("Age: $age")
        displayStatus()
    }
}

fun main() {
//    Here we have a simple class registration program
    println("----STUDENT REGISTRATION PROGRAM----")
    println()
    val student1 = Student()
    print("Enter First Name: ")
    student1.firstName = readLine()!!
    print("Enter Last Name: ")
    student1.lastName = readLine()!!
    print("Enter Age: ")
    student1.age = readLine()!!.toInt()
    println()
    println("Student profile created")
    student1.enroll()
    student1.displayStatus()
    println()
    println("Student information")
    println("-------------------")
    student1.displayStudent()
    println()
    println("-------------------------")
    println("Creating another student")
    val student2 = Student()
    student2.firstName = "John"
    student2.lastName = "Doe"
    student2.age = 18
    println()
    println("Student profile created")
    student2.enroll()
    student2.displayStatus()
    println()
    println("Student Information")
    println("-------------------")
    student2.displayStudent()
    println()
    println("------------------------")
    println("Creating another student")
    val student3 = Student()
    student3.firstName = "Juan"
    student3.lastName = "Perez"
    student3.age = 21
    println()
    println("Student profile created")
    student3.enroll()
    student3.displayStatus()
    println()
    println("Student Information")
    println("-------------------")
    student3.displayStudent()
    println()

//    Collections----------------
//    Here I create a mutable set of students.
    val classList = mutableSetOf<Student>()
    classList.add(student1)
    classList.add(student2)
    classList.add(student3)

    println("Display the Class List")
    println("----------------------")
    printClass(classList)
    println()

    print("Do you want to unregister students(y/n)? ")
    var option = readLine()
    var name: String
    var found = false
    println()
    if ( option == "y"){
        print("Enter student name: ")
        name = readLine()!!
        for(student in classList) {
            if (student.firstName == name){
                student.unregister()
                println("${student.firstName} ${student.displayStatus()}")
                found = true
                break
            }
        }
        if (found == false){
            println("Student not found")
        }
    } else {
        println("Good")
    }
    println()

    print("Do you want to drop a student(y/n)? ")
    option = readLine()
    var n = 0
    found = false
    println()
    if ( option == "y"){
        print("Enter student name: ")
        name = readLine()!!
        for(student in classList) {
            if (student.firstName == name){
                classList.remove(student)
                println("Student $name dropped.")
                found = true
                break
            }
            n++
        }
        if (found == false){
            println("Student not found")
        }
    } else {
        println("It's OK")
    }
    println()

    println("Display the Class List")
    println("----------------------")
    printClass(classList)
    println()
    println("That's all, Thank you")

}
fun printClass(students: Collection<Student>) {
    for(student in students) {
        println("Student: ${student.firstName} ${student.lastName}")
        println(student.displayStatus())
        println()
    }
}
