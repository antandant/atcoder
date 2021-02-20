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

n, m, a, b = LI()
c = IR(m)
is_ok = True
for i, ci in enumerate(c):
    if n <= a:
        n += b
    if n < ci:
        print(i+1)
        exit()
    else:
        n -= ci
print('complete')
