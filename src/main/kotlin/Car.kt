interface carPrototype{
    fun clone():carPrototype
    fun info():String
}

class Car(val name: String, var maxSpeed: Int) : carPrototype{
    override fun clone(): Car {
        return Car(name,maxSpeed)
    }

    override fun info(): String {
        return "Car: $name max speed: $maxSpeed"
    }
}
