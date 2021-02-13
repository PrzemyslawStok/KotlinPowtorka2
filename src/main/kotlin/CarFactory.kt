class CarFactory private constructor() {
    val cars = mutableMapOf<String, Car>()

    fun createCar(name: String):Car?{
        return cars[name]?.clone()
    }

    init{
        cars["bmw"] = Car("BMW",250)
        cars["audi"] = Car("Audi",250)
    }

    companion object{
        private val INSTANCE: CarFactory? = null
        fun getInstance():CarFactory{
            return CarFactory()
        }
    }
}
