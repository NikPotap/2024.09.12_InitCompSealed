fun selectedMenu(): Coffee {
    val typeCaffee = selectCoffee()
    val coffee: Coffee
    when (typeCaffee) {
        1 -> {
            coffee = Coffee.Americano()
            if (addMilk() == 1) coffee.milk = true
            sugar(coffee)
            return coffee
        }

        2 -> {
            coffee = Coffee.Cappuccino()
            if (increaseVolume("200", coffee.volume) == 1) coffee.volume = "200"
            sugar(coffee)
            return coffee
        }

        3 -> {
            coffee = Coffee.Latte()
            if (increaseVolume("360", coffee.volume) == 1) coffee.volume = "360"
            sugar(coffee)
            return coffee
        }
    }
    return Coffee.Americano()

}

fun sugar(coffee: Coffee) {
    val newSugar = selectSugar()
    if (newSugar != "6") coffee.sugar = newSugar
}
