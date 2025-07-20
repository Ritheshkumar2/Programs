package base;

public class ProfitRelated {

	public static void main(String[] args) {
		int[] present = {5, 4, 6, 2, 3};
        int[] future = {8, 5, 4, 3, 5};
        int budget = 10;

        int n = present.length;
        int maxProfit = 0;

        // Try all combinations of 3 stocks only (for simplicity)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int totalCost = present[i] + present[j] + present[k];
                    if (totalCost <= budget) {
                        int profit = (future[i] - present[i]) + (future[j] - present[j]) + (future[k] - present[k]);
                        if (profit > maxProfit) {
                            maxProfit = profit;
                        }
                    }
                }
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);

	}

}
