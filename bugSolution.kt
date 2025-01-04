fun main() {
    val set = mutableSetOf(1, 2, 3, 4, 5)
    val toRemove = set.filter { it > 2 }
    set.removeAll(toRemove)
    println(set) // Output: [1, 2]

    //Alternative solution using iterator
    val set2 = mutableSetOf(1,2,3,4,5)
    val iterator = set2.iterator()
    while (iterator.hasNext()){
        if (iterator.next() > 2){
            iterator.remove()
        }
    }
    println(set2) // Output: [1,2]
}