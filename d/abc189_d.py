import sys
from collections import Counter


def input(): return sys.stdin.readline().strip()
def I(): return int(input())
def LI(): return list(map(int, input().split()))
def IR(n): return [I() for i in range(n)]
def LIR(n): return [LI() for i in range(n)]
def SR(n): return [S() for i in range(n)]
def S(): return input()
def LS(): return input().split()


INF = float('inf')
n = I()
ans = 1
s = SR(n)[::-1]
for i, si in enumerate(s):
    if si == 'OR':
        ans += 2**(n-i)
print(ans)
