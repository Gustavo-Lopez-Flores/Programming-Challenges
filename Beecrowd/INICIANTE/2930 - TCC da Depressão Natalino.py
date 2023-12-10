import sys
e, d = map(int,sys.stdin.readline().split())
if e >= d:
  print("Eu odeio a professora!")
elif (d-e) >= 3:
  print("Muito bem! Apresenta antes do Natal!")
else:
  print("Parece o trabalho do meu filho!")
  if (d+2) <= 24:
    print("TCC Apresentado!")
  else:
    print("Fail! Entao eh nataaaaal!")