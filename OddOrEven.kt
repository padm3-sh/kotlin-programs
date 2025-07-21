fun main() {
    val numberToEvaluate: Int

    print("Enter a number: ")
    numberToEvaluate = (readLine()?.toIntOrNull() ?: return print("Invalid number"))

    if (numberToEvaluate % 2 == 0) {
        println("Inputted number is even.")
    } else {
        println("Inputted number is odd.")
    }
}