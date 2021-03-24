fun main(){
   var Daisi=Human("caren",25,70)
    Daisi.eat(2)
    Daisi.speak("food")
    Daisi.birthday()
    Daisi.age

    var asanti=User("Asanti","Odawa","asantiodawa@gmail.com","0713372345","lewis")
    println(asanti.firstname)
    println(asanti.email)

}

class Human(var name: String,var age: Int,var weight: Int){
    fun eat(Foodweight: Int): Int{
        println("I am eating $Foodweight kgs of food")
        weight=weight+ Foodweight
        return weight
    }
    fun speak(speech: String){
        println("$speech")
    }
    fun birthday(){
        age=age+1
        println(age)

    }




}
data class User(var firstname:String,var lastname:String,var email:String,var phoneNo:String,var password:String)