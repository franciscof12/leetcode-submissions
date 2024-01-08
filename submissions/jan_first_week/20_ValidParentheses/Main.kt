// https://leetcode.com/problems/valid-parentheses/ -> 20. Valid Parentheses (Easy)

fun main() {
    test("()", expected = true)
    test("()[]{}", expected = true)
    test("(]", expected = false)
    test("([)]", expected = false)
    test("{[]}", expected = true)
}

fun test(input: String, expected: Boolean) {
    val result = isValid(input)
    if (result == expected) {
        println("test con '$input' ✅ (resultado esperado: $expected)")
    } else {
        println("test con '$input' ❌ (resultado esperado: $expected, obtenido: $result)")
    }
}

fun isValid(s: String): Boolean {
    val stack = mutableListOf<Char>()
    for (c in s) {
        when (c) {
            '(', '{', '[' -> stack.add(c)
            ')' -> if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '(') return false
            '}' -> if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '{') return false
            ']' -> if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '[') return false
        }
    }
    return stack.isEmpty()
}

