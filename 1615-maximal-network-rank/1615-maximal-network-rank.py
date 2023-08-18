class Solution:
    def maximalNetworkRank(self, n: int, roads: List[List[int]]) -> int:
        connections = [0] * n
        graph = [[False] * n for _ in range(n)]
        
        for a, b in roads:
            connections[a] += 1
            connections[b] += 1
            graph[a][b] = graph[b][a] = True
        
        max_rank = 0
        for i in range(n):
            for j in range(i + 1, n):
                rank = connections[i] + connections[j]
                if graph[i][j]:
                    rank -= 1
                max_rank = max(max_rank, rank)
        
        return max_rank