class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minNums = new ArrayList<>();
        List<Integer> maxNums = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = 99999999;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }

            minNums.add(min);
        }

        for (int k = 0; k < matrix[0].length; k++) {
            int max = -1;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][k] > max) {
                    max = matrix[i][k];
                }
            }

            maxNums.add(max);
        }
        for (int i = 0; i < minNums.size(); i++) {

            if (maxNums.contains(minNums.get(i))) {
                result.add(minNums.get(i));
            }
        }
        return result;
    }
}