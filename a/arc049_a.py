import sys
sys.setrecursionlimit(10**7)


def input(): return sys.stdin.readline().strip()
def I(): return int(input())
def LI(): return list(map(int, input().split()))
def IR(n): return [I() for i in range(n)]
def LIR(n): return [LI() for i in range(n)]
def SR(n): return [S() for i in range(n)]
def S(): return input()
def LS(): return input().split()


INF = float('inf')
MOD = 10**9 + 7

s = input()
nums = LI()
ans = ''
n = 0
if nums[0] == 0:
    ans += '\"'
    nums = nums[1:]
for i, c in enumerate(s, start=1):
    ans += c
    if n < len(nums) and i == nums[n]:
        ans += '\"'
        n += 1
print(ans)
