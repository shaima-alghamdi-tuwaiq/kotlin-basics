fun main(){
    
    // single-line Comment 
    /*
     * val : can be reassigned 
     * var : assigned a value only once. (cannot be reassigned)
     * Reference -> xhttps://kotlinlang.org/docs/basic-syntax.html#comments
     */ 
    var name : String = "Shaima" 
    val age : Int = 25
    
    // variable reassigned
    name = "Ahmad"

    // Function call
    printName(name)
    println(calculateAge(2022, 1970))
}

// Function decleration 
// Function to print name 
fun printName(name : String){
    println(name)
}

// Function to calculate name 
fun calculateAge(currentYear : Int, birthYear : Int) : Int{
    return currentYear - birthYear
}
