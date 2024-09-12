import kotlinx.coroutines.delay

suspend fun selectMenu(menu: Coffee) {
    println()
    println(menu.toString())
    println("Кофе готовится...")
    for (i in 1..10) {
        delay(500)
        print("\b\b\b\b${i}0%")
    }
    println("\nВаш кофе готов.")
}