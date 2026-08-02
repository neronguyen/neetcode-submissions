import kotlin.collections.get

class NumMatrix(private val matrix: Array<IntArray>) {

    private val rows get() = matrix.size
    private val cols get() = matrix[0].size

    private val prefixSums = Array(rows) { row ->
        matrix[row].scan(0) { cur, next -> cur + next }
    }

    private val prefixSums2d = Array(rows + 1) { row ->
        if (row == 0) IntArray(cols + 1)
        else if (row == 1) prefixSums[0].toIntArray()
        else IntArray(cols + 1)
    }

    init {
        for (row in 2..rows) {
            for (col in 1..cols) {
                prefixSums2d[row][col] = prefixSums[row - 1][col] + prefixSums2d[row - 1][col]
            }
        }
    }

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        var sum = 0
        sum += prefixSums2d[row2 + 1][col2 + 1]
        sum -= prefixSums2d[row2 + 1][col1]
        sum -= prefixSums2d[row1][col2 + 1]
        sum += prefixSums2d[row1][col1]
        return sum
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * var obj = NumMatrix(matrix)
 * var param_1 = obj.sumRegion(row1,col1,row2,col2)
 */
