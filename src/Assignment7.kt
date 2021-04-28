fun main(){
    numbers()

    var name = firstNames(arrayOf("Caroline", "Timothy", "Joe", "Boaz"))
    println(name)

    ageDifference(3)
    ageDifference(11)
    ageDifference(30)

    fb()
}
fun numbers(){
    for (numbers in 1..100){
        if (numbers%2!=0){
            println(numbers)
        }
    }
}

fun firstNames(names:Array<String>):Int{
    var counter =0
    for (name in names){
        if (name.length>5){
            counter+=1
        }
    }
    return counter
}

fun ageDifference(age:Int){
    when(age){
        in (1..5) -> println("Milk")
        in(6..15) -> println("Fanta Orange.")
        else -> println("Coca Cola")
    }

}

fun fb(){
    for (num in 1..100){
        if(num % 3==0){
            println("Fizz")
        }
        else if (num % 5==0){
            println("Buzz")
        }
        else if (num % 3==0 && num % 5==0){
            println("FizzBuzz")
        }
        else{
            println(num)
        }
    }
}


