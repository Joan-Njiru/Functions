fun main(){
    var myName= printName("Joan")
    println(myName)
    var remainder = modulus(num1 = 45, num2 = 13)
    println(remainder)
    var add = sum(12,14,16,18)
    println(add)
    var statement = printFact("I am the last born in our family.")
    println(statement)



}
fun printName(name: String): String{
    var myName = ("Hello " + name)
    return myName


}
fun modulus(num1: Int, num2: Int): Int{
    var remainder = num1 % num2
    return remainder
}
fun sum(a: Int, b: Int, c: Int, d: Int): Int {
    var add = a + b + c + d
    return add

}
fun printFact(facts:String): String{
    var statement = "I am the last born in our family."
    return statement
}