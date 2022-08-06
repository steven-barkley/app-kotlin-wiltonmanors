fun main() {
    
   
    val myFirstDice = Dice()
    println(myFirstDice.sides)
    
    val diceRange = 1..6
    val randomRoll = diceRange.random()
    println("Random number: ${randomRoll}")
    //randomNumber()
}

fun randomNumber() {
 	// Get Array of Numbers 1 to 6
    val num = arrayOf<Int>(1, 2, 3, 4, 5, 6) //explicit type declaration
    // Get math.random
    val numResult = println((num).random())
    // Get 1 to 6 values set skip to random value
    // Output single number in array
}

 class Dice {
    var sides = 6
}
