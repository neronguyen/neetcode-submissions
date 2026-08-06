class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
        var balance5 = 0
        var balance10 = 0

        for (i in bills) {
            when (i ) {
                5 -> balance5++
                10 ->
                    if (balance5 <= 0) return false
                    else {
                        balance10++
                        balance5--
                    }
                
                else -> 
                    if (balance10 >= 1 && balance5 >= 1) {
                        balance10--
                        balance5--
                    } else if (balance5 >= 3) {
                        balance5 -= 3
                    } else return false
            }
        }
        
        return true
    }
}
