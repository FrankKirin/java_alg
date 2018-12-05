package dynamic_programming.zero_one_package_problem;
/*
 * 
    01背包问题具有最优子结构性质，因此采用动态规划的方法解决
    状态转移方程:
        i 表示已经考虑的物品件数
        j 表示目前背包剩余容量
        m[i][j] = 
        {
            如果i=0 或者 j=0, m[i][j]=0
            如果wj>j, m[i-1][j]
            如果wj<j, max{m[i-1][j], m[i-1][j]+vi}
        }

    Example:
        value = {8,10,6,3,7,2}
        weight = {4,6,2,2,5,1}
        package_capatity = 12
*/

class ZeroOnePackageProblem{
    
    public static void main(String[] args){
        int[] weight = {2, 2, 6, 5, 4};
        int[] value = {6, 3, 5, 4, 6};
        int package_capatity = 10;

        int[][] m = new int[value.length+1][package_capatity+1];

        for(int i=1; i<=weight.length; i++) {
        	for(int j=1; j<=package_capatity; j++) {
                if(weight[i-1] > j) {
                    m[i][j]=m[i-1][j];
                }
                else{
                    m[i][j] = Math.max(m[i-1][j], m[i-1][j-weight[i-1]] + value[i-1]);
                }
            }
        }

        for(int i=0; i<=weight.length; i++) {
            for(int j=0; j<=package_capatity; j++) {
                System.out.printf("%5d", m[i][j]);
            }
            System.out.println();
        }
    } 
}