//Write a program that prints the Fibonacci Sequence up to a given number
import java.util.Scanner
fun main() {

    var fTerm: Int
    var sTerm: Int
    var sum: Int

    fTerm = 0
    sTerm = 1
    sum = 0


    var firstMessage = print("User should enter the nthTerm ")
    var nTerm = readln().toInt()

    when(nTerm) {
        1 -> println(fTerm)
        else -> {
            println(fTerm)
            println(sTerm)
            for(i in 3..nTerm){
                 sum = fTerm + sTerm
                fTerm = sTerm
                sTerm = sum
                println(sum)

            }
        }

    }

    println("The fibonacci sequence upto $nTerm is $sum")

}