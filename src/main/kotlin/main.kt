fun main() {

    val carFactory = CarFactory.getInstance()
    val car0 = carFactory.createCar("bmw")

    car0?.let {
        println(it.info())
    }
}
