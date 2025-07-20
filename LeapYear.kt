fun main() {
    val input: Int

    print("Enter year: ")
    input = readLine()?.toInt() ?: 0

    if ((input % 4 == 0) and (input % 100 != 0)) {
        println("This is a leap year.")
    } else if ((input % 400 == 0) and (input % 100 == 0)) {
        println("This is a leap year.")
    } else {
        println("This is not a leap year.")
    }

}