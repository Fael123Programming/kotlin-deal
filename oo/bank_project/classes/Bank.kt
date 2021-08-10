package classes
/*  Data class
    -> Its objects can never have their data modified (that's why in primary construtor, the parameters are 'val');
    -> It is allowed to initialize properties;
    -> It can't be abstract or open;
*/
data class Bank(val name:String, val number:Int)