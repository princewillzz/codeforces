import java.util.Arrays;

class knapsack {
    public static void main(String[] args) {
        int weights[] = {5, 4, 6, 3}, capacity = 10, values[] = {10, 40, 30, 50};
        int memory[][] = new int[values.length][capacity+1];
        for(int arr[] : memory) Arrays.fill(arr, Integer.MIN_VALUE);
        System.out.println(solve(capacity, weights, values, values.length-1, memory));
    }

    static int solve(int maxW, int[] weights, int values[], int n, int memory[][]) {
        
        int result = 0;
        if(n < 0 || maxW == 0) return 0;
        else if(memory[n][maxW] != Integer.MIN_VALUE) return memory[n][maxW];
        else if(weights[n] > maxW) result = solve(maxW, weights, values, n-1, memory);
        else {
            int temp1 = solve(maxW, weights, values, n-1, memory);
            int temp2 = values[n] + solve(maxW - weights[n], weights, values, n-1, memory);
            result = Math.max(temp1, temp2);
        }
        memory[n][maxW] = result;
        return result;
    }
}
