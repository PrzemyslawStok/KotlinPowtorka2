import kotlin.random.Random

fun main() {

    val carFactory = CarFactory.getInstance()
    val car0 = carFactory.createCar("bmw")
    car0?.maxSpeed = 265

    val cars = mutableListOf<Car?>()

    println(car0?.info())

    for (i in 1..10) {
        val car = carFactory.createCar("bmw")
        car?.maxSpeed = Random.nextInt(250,260)
        cars.add(car)
    }

    cars.forEach { println(it?.info()) }
}
