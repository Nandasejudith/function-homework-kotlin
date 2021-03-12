fun main(){
    mySchool()

     var identity=Statement("Judith",22)
    println(identity)
    var home=word("Uganda")
    println(home)
    personality("Blessed")

}

fun mySchool(){
    var mySchool="akirachix"
   var t= mySchool[0]
    var k= mySchool[3]
    var h= mySchool[4]
    println("$t$k$h")
}

fun Statement(name:String, age:Int):String{
return("Hi,my name is $name and i am $age  years old")
}
fun word(g:String):Int{
    var home=g.length
    return(home)
}
fun personality(Name:String) {
    var s = Name
    if (s == Name) {
        println("That's me")
    } else {
        println("I don't know who that is")
    }
}
