class CarFactory private constructor() {
    val cars = mutableMapOf<String, Car>()

    fun createCar(name: String):Car?{
        return cars[name]?.clone()
    }

    init{
        cars["bmw"] = Car("BMW")
        cars["audi"] = Car("Audi")
    }

    companion object{
        private val INSTANCE: CarFactory? = null
        fun getInstance():CarFactory{
            return CarFactory()
        }
    }
}
