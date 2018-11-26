package dynamic_programming.longest_common_subsequence;

/*
    最长公共子序列，采用动态规划算法。
    1.当当前正在比对的数组1中元素个数为0个，数组2中元素个数为0个的时候，长度为0
    2.当当前正在比对的数组1和数组2的最后一个元素相同时，长度为c[i-1][j-1]+1
    3.当当前正在比对的数组1和数组2的最后一个元素不相同时，长度为 max{c[i-1][j], c[i][j-1]}
*/

public class LCS {

	public static void main(String[] args) {
        char[] sequence_one = {'A', 'B', 'C', 'B', 'D', 'A'};
        char[] sequence_two = {'B', 'D', 'C', 'A', 'B', 'A'};

//        int[][] common_subsequence_length_array = new int[sequence_one.length][sequence_two.length];
//        int[][] c = new int[sequence_one.length][sequence_two.length];

        for (int i=0; i<sequence_one.length; i++) {

            for (int j=0; j<sequence_two.length; j++) {
                if(sequence_one[i]==sequence_two[j]) {
//                    c[i][j] = c[i-1][j-1] + 1;
                	System.out.printf("Hello world!");
                }
                else {
//                    c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
                }
            }
        }

	}
}
