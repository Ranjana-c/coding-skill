def max_profit(prices, k):
    n = len(prices)
    if n == 0:
        return 0
      
    if k >= n // 2:
        return sum(max(prices[i] - prices[i - 1], 0) for i in range(1, n))
    
    
    dp = [[0] * n for _ in range(k + 1)]
    
    for i in range(1, k + 1):
        max_diff = -prices[0]
        for j in range(1, n):
            dp[i][j] = max(dp[i][j - 1], prices[j] + max_diff)
            max_diff = max(max_diff, dp[i - 1][j] - prices[j])
    
    return dp[k][n - 1]

def main():
    n = int(input("Enter number of days: "))
    prices = []
    for _ in range(n):
        prices.append(int(input("Enter price: ")))
    k = int(input("Enter number of transactions: "))
    
    print("Maximum Profit:", max_profit(prices, k))

if __name__ == "__main__":
    main()
