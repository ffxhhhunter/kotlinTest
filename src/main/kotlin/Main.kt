fun main() {
    val equipment = Equipment("Bag", 100)
    val equipment1 = Equipment("Bag", 100)
    println(equipment)
    println(equipment.equals(equipment1))
    println(equipment.hashCode())
    println(equipment1.hashCode())
    println(equipment === equipment1)

    val copiedEquipment = equipment.copy()
    println(equipment)
    println(copiedEquipment)

    val redactedEquipment = equipment.copy(name = "Edited")
    println(redactedEquipment)
    println(equipment)
}

data class Equipment (
    val name: String,
    val weight: Int
) {
    override fun toString(): String {
        return "Equipment{name=$name, weight=$weight} (1)"
    }
}