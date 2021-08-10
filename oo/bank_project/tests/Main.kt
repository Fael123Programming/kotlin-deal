package tests

import classes.Bank
import classes.Person

fun main(args: Array<String>){
    /*val personEx = Person() //Intantiating an object
    println(personEx.getInfo())

    //obj.name = "Beggar" <-- That's not allowed anymore
    println(personEx.Address().street)
    //obj.Address(): calling the constructor of class Address. Then, we access through the object just created, the attribute street.
    //var address = obj.Address()
    //println(address.street)*/
    val newBank = Bank("NewBank",number = 1234)
    println("Bank is " + newBank.name)
    println("NUmber is " + newBank.number)
}