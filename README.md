# Kotlin ConcurrentModificationException in mutableSetOf().removeIf()

This repository demonstrates a subtle difference in behavior between `mutableListOf()` and `mutableSetOf()` when using the `removeIf()` function in Kotlin.  While `removeIf()` works as expected with lists, it throws a `ConcurrentModificationException` when used with sets.

The `bug.kt` file shows the issue, and `bugSolution.kt` provides a workaround.