import sys
while True:
  try:
    s=int(input())
    while True:
      if s == 0:
        break
      else:
        n, m = map(int,sys.stdin.readline().split())
        print(len(str(n ** m)))
        s = s-1
  except:
    break