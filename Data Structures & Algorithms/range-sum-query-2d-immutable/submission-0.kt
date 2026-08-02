class NumMatrix(val matrix: Array<IntArray>) {

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        val rows = matrix.size
        val prefixSums = Array(rows) { row -> 
            matrix[row].scan(0) { cur, next -> cur + next }
        }

        var sum = 0
        for (i in row1..row2) {
            val width = prefixSums[i][col2 + 1] - prefixSums[i][col1]
            sum += width
        }

        return sum
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * var obj = NumMatrix(matrix)
 * var param_1 = obj.sumRegion(row1,col1,row2,col2)
 */
