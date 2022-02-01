fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val salesByMatch = WarmUp_SalesByMatch()
    println(salesByMatch.solve(n,ar))
}

class WarmUp_SalesByMatch {
    // - learn using hashset here

    fun solve(n: Int, ar: Array<Int>) : Int {
        // Write your code here
        val colorsSet = hashSetOf<Int>()
        var pairs = 0

        for (item in ar) {
            if (!colorsSet.contains(item)) {
                colorsSet.add(item)
            } else {
                pairs++
                colorsSet.remove(item)
            }
        }

        return pairs
    }
}