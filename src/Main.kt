suspend fun main() {
    println("Вас привествует автомат по продаже кофе!")
    var makeCoffee: Coffee
    while (true) {
        makeCoffee = selectedMenu()
        selectMenu(makeCoffee)
        if (moreCoffee()) continue
        return
    }
}

sealed class Coffee(val name: String, var volume: String, var sugar: String, var milk: Boolean) {

    class Americano : Coffee("американо", "300", "2", false) {
        override fun toString(): String {
            return "Выбран $name, объём $volume мл, ${
                if (milk) {
                    "с молоком"
                } else "без молока"
            }, ${
                if (sugar == "0") {
                    "без сахара"
                } else "сахар: $sugar"
            }."
        }
    }

    class Cappuccino : Coffee("капучино", "150", "2", true) {
        override fun toString(): String {
            return "Выбран $name, объём $volume мл, ${
                if (sugar == "0") {
                    "без сахара"
                } else "сахар: $sugar"
            }."
        }
    }

    class Latte : Coffee("латте", "240", "2", true) {
        override fun toString(): String {
            return "Выбран $name, объём $volume мл, ${
                if (sugar == "0") {
                    "без сахара"
                } else "сахар: $sugar"
            }."
        }
    }
}