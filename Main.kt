class Point{
    var x : Int = 0
    var y : Int = 0

    constructor(){
        x = 0
        y = 0
    }

    constructor(x:Int,y:Int){
        this.x = x
        this.y = y
    }

    fun display(){
        print("$x --- $y")
    }
}

fun main(){
    var p1 = Point(20,23)
    var p2 = Point(20,31)

    var p3 = p2

    //referential equality ===      !==
    //structural equality  ==        !=
}

fun main4(){
    var numbers = arrayOf(10,20,30,40,50)
    for ((index,num) in numbers.withIndex()){
        println("$num -- $index")
    }

    var number = 23
    when(number){
        1 -> {
            println("One")
            println("1")
        }
        2 -> println("Two")

        3 -> {
            println("Three")
            println("3")
        }

        in 20..25 -> println("The number lies between 20 to 25")

        else->println("The number is not valid")
    }
}


fun main3(){
    var numberOne : Int = 23
    var numberTwo : Int = 40
    var result : Int

    result = if (numberOne > numberTwo){
        println("$numberOne is greater")
        numberOne+1
    } else {
        println("$numberTwo is greater")
        numberTwo+4
    }
    println("result is : $result")
}


fun main2(){
    var numbers = 10..20
    for(eachNumber in numbers){
        println("$eachNumber")
    }

    var numbers1 = 20.downTo(10)
    for (num in numbers1){
        println("$num")
    }
    println("------------------------")

    var numbers2 = 10..50
    var numbersInStepOf5 = numbers2.step(5)

    for (eachNumber in numbersInStepOf5){
        println("$eachNumber")
    }

    var reverseOrder = (-5..5).reversed().step(2)
    for (number in reverseOrder){
        println(number)
    }
}

fun main1(){
    var marks = Array<Int>(10){index->index+5}
    for (mark in marks){
        print("$mark  ")
        println()
    }
    print("-----------------")
    for(i in 0..marks.size-1){
        println("${marks[i]} -- ${marks.get(i)}")
    }

    var numbers = IntArray(10){index->index}
    for (number in numbers){
        println("number is ${number}")
    }
}