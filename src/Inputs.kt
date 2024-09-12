fun selectCoffee(): Int {
    while (true) {
        var input: String
        print("\nВыберите напиток\n1 - американо\n2 - капучино\n3 - латте\n")
        input = readln()
        if (input == "1") return 1
        if (input == "2") return 2
        if (input == "3") return 3
        println("Неверный ввод")
    }
}

fun selectSugar(): String {
    while (true) {
        var input: String
        print("Выберите количество сахара: 0-5\n\"Enter\" - оставить 2\n")
        input = readln()
        if (input == "") return "6"
        if (input.toIntOrNull() == null) {
            println("Неверный ввод")
            continue
        }
        if (input.toInt() in 0..5) return input
        println("Неверный ввод")
    }
}

fun addMilk(): Int {
    while (true) {
        var input: String
        print("\nДобавить молока?\n1 - да\n\"Enter\" - нет\n")
        input = readln()
        if (input == "1") return 1
        if (input == "") return 2
        println("Неверный ввод")
    }
}

fun increaseVolume(newVolume: String, oldVolume: String): Int {
    while (true) {
        var input: String
        print(
            "\nИзменить объём на $newVolume мл?\n" +
                    "1 - да\n" +
                    "\"Enter\" - оставить $oldVolume мл\n"
        )
        input = readln()
        if (input == "1") return 1
        if (input == "") return 2
        println("Неверный ввод")
    }
}
fun moreCoffee(): Boolean {
    while (true) {
        var input: String
        print("\nЕщё кофе?\n1 - да\n\"Enter\" - нет\n")
        input = readln()
        if (input == "1") return true
        if (input == "") return false
        println("Неверный ввод")
    }
}