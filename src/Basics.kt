import java.util.function.DoublePredicate

fun main(args: Array<String>) {

    var sample1: Byte =0x3A
    val sample2: Byte = 58
    val heartRate: Int = 85
    val deposits : Double = 135002796.0
    var acceleration : Float = 9.8F
    val mass : Float = 14.6F
    val distance : Double = 129.763001
    val lost : Boolean = true
    val expensive : Boolean = true
    val choice : Int = 2
    var integral : Char = '\u222B'
    var greeting : String = "Hello"
    val name : String = "Karen"

    val force: Float = mass * acceleration


    if (sample1 ==sample2){
        println("The samples are equal.")
    }
    else println("The samples are not equal.")


    if (40<= heartRate && heartRate <= 80){
        println("Heart rate is normal")
    }
    else println("Heart rate is not normal")


    if (deposits >= 100000000){
        println("You are exceedingly wealthy")
    }
    else println("Sorry you are so poor")



    println("force = $force")
    println("$distance is the distance")
    if (lost == true && expensive == true){
        println("I am really sorry! I will get the manager.")
    }
    if(lost == true && expensive == false){
        println("Here is coupon for 10% off.")
    }
    when(choice){
    1 -> println("You chose 1.")
    2 -> println("You chose 2.")
    3 -> println("You chose 3.")
    else -> println("You made an unknown choice.")
    }
    println(integral)

    for( i in 5..10 ){
       println("i=$i")
    }
    var age : Int = 0
    while (age < 6){
        println("age=$age")
        age++
    }

    println("$greeting $name")


}
