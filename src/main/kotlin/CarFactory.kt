class CarFactory {
    val cars = mutableMapOf<String, Car>()

    fun createCar(name: String):Car?{
        return cars[name]
    }

    init{
        cars["bmw"] = Car("BMW")
        cars["audi"] = Car("Audi")
    }
}
