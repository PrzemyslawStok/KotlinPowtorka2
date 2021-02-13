fun main() {
    val carFactory = CarFactory()
    val car0 = carFactory.createCar("bmw")

    car0?.let {
        println(it.info())
    }
}
