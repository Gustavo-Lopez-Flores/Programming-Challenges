import sys
t = input()
t = int(t)
while True:
  n, m = map(int,sys.stdin.readline().split())
  g = (n % m) + int(n / m)
  print(g)
  t = t - 1
  if t == 0:
    break