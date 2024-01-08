/* fun main() {
    println(isValid("()"))
    println(isValid("()[]{}"))
    println(isValid("(]"))
    println(isValid("([)]"))
    println(isValid("{[]}"))
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
*/

// https://leetcode.com/problems/valid-parentheses/ -> 20. Valid Parentheses (Easy)