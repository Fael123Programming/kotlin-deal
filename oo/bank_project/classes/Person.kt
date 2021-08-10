package classes
//Bank System Simulator Project
//Class to represent people

//Package this class belongs to

//The attributes, methods and constructors of a class are called the members of it;

class Person{ //Outter classe
    var name:String = "Rafael Fonseca"//Attribute is visible outside class
    private set //Attribute can't be modified outside class

    var cpf:String = "122312321"
    private set
    //See that get functions are available outside class but set ones are not.
    
    constructor() //Secondary constructor. It is called when you create an object not passing parameters to it

    private fun getFirstName() = this.name.split(" ")[0]

    private fun getLastName() = this.name.split(" ")[this.name.split(" ").size-1] //'size' to know a size of an array

    fun getInfo() = "Complete name: ${this.name}\nFirst name: ${this.getFirstName()}\nLast name: ${this.getLastName()}\nCPF: ${this.cpf}\n"
    
    inner class Address{ //A class to work internally generating objects to the outter class
        var street:String = "AVh. 854 St. Jhonson"
        private set
    }
}

/*fun main(args:Array<String>){
    val personEx = Person() //Intantiating an object
    println(personEx.getInfo())

    //obj.name = "Beggar" <-- That's not allowed anymore
    println(personEx.Address().street)
    //obj.Address(): calling the constructor of class Address. Then, we access through the object just created, the attribute street.
    //var address = obj.Address()
    //println(address.street)
}*/