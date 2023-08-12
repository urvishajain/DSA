class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        
        n=len(obstacleGrid)
        m=len(obstacleGrid[0])
        
        dp=obstacleGrid
        for i in range(n):
            
            for j in range(m):
                if dp[i][j]==1:
                    dp[i][j]=-1
                
    # dp[0][0]=1
        for i in range(n):
            for j in range(m):
                if dp[i][j]==-1:
                    continue
                elif i==0 and j==0:
                    dp[i][j]=1
                elif i==0 :

                    
                    dp[i][j]=dp[i][j-1]
                    
                elif j==0:
                    
                    dp[i][j]=dp[i-1][j]
                    
                else:
                    if dp[i-1][j]==-1:
                        dp[i][j]=dp[i][j-1]
                    elif dp[i][j-1]==-1:
                        dp[i][j]=dp[i-1][j]
                    else:
                        dp[i][j]=dp[i-1][j]+dp[i][j-1]
        return dp[n-1][m-1] if dp[n-1][m-1]!=-1 else 0
                    
        
        
        