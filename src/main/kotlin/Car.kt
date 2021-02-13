interface carPrototype{
    fun clone():carPrototype
    fun info():String
}

class Car(val name: String) : carPrototype{
    override fun clone(): Car {
        TODO("Not yet implemented")
    }

    override fun info(): String {
        return "Car: $name"
    }
}
