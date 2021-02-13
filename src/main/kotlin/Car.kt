interface carPrototype{
    fun clone():carPrototype
    fun info():String
}

class Car(val name: String) : carPrototype{
    override fun clone(): Car {
        return Car(name)
    }

    override fun info(): String {
        return "Car: $name"
    }
}
