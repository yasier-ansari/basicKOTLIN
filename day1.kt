//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}


fun main(){

/* this is multi line comment
  got it  ?   */

//TODO-1: code for basic syntax and all

/*

    val name = "ginko" // val is a variable that cannot be changed once it is instantiated

    var nameno = "noru"  // var is a variable that can be changed afterwards

    var city: String = " mumbai "  // this way we can also specify the type of data type ( not advisable / redundant  )

    var address: String
    address = " urawa " // this way we can do 2step var assigning ( not advisable / redundant  )

    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double precision upto 15 digit ( float have precision upto 6 digit)
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    // for the given data types, we have to explicitly define the data types

    val myNum1: Byte = 100 //byte
    val myNum2: Short = 5000 // short int from -32768 to 32767
    val myNum3 = 34.77f // float
    val myNum4: Long = 15000000000L // long int for bigger number


    println(" hi mom ") ; // semi-colon ( ; ) (not advisable / redundant )



*/

//TODO-2: code for String , boolean

    // strings

    val string = "Hi Mom, i wont be there for dinner"
    val string2 = "Cuz im gonna go for a party with my buddy "
    val string3 = "Hi Mom, i wont be there for dinner"

    println(string[3]) // prints the character present at the 3rd index( remember --> starts with 0 )
    println(string.length) // prints the length of the string
    println(string.toUpperCase())
    println(string.toLowerCase())

    println(string.compareTo(string2))
    println(string.compareTo(string3))
    print(string.plus(string2))
    println(string.indexOf("there"))
    val yes = "yes you are"
    val no = " no my son "
    println(" you are a terrorist $yes ")
    println("you are a terrorist? $no ")


    // boolean
    val x = 10
    println( 100 >= x)
    println()

}