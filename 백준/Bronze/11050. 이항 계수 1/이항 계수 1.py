from math import factorial

n, r = map(int, input().split())

res = factorial(n) // (factorial(n - r) * factorial(r))

print(res)