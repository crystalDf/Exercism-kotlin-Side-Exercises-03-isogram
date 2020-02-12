object Isogram {

    fun isIsogram(input: String): Boolean {

        return input.length == input.filter { it.isLetter() }.toLowerCase().toSet().size +
                input.filter { !it.isLetter() }.toList().size
    }
}
