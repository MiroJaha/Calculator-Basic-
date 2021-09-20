fun main(){

    println("Welcome to My Calculator")
    sum()
    while(true){
        print("Would you like to add more numbers? (y/n) >>")
        when (readLine()) {
            "y" -> sum()
            "n" -> break
            else -> println("Wrong Input")
        }
    }
    println("Thank You, Hope you had some fun")

}

fun callNumber():Int{
    while(true) {
        return try {
            readLine()!!.toInt()
        } catch (e: Exception) {
            0
        }
    }
}

fun sum(){
    print("Please Enter First Number: ")
    var num1=callNumber()
    print("Please Enter Second Number: ")
    var num2=callNumber()
    println("$num1 + $num2 = "+(num1+num2))
}