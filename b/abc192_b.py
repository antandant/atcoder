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

s = S()
is_ok = True
for i, c in enumerate(s, start=1):
    if (i % 2 != 0 and c.islower()) or (i % 2 == 0 and c.isupper()):
        continue
    else:
        is_ok = False
        break
ans = 'Yes' if is_ok else 'No'
print(ans)
