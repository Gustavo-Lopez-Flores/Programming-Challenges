n = int(input())
for j in range(n):
  linha = str(input()) 
  led = 0
  for i in range(0, len(linha)):
    if linha[i] == '2' or linha[i] == '3' or linha[i] == '5':
      led+=5
    elif linha[i] == '4':
      led+=4
    elif linha[i] == '6' or linha[i] == '9' or linha[i] == '0':
      led+=6
    elif linha[i] == '1':
      led+=2
    elif linha[i] == '8':
      led+=7
    elif linha[i] == '7':
      led+=3
  print(f'{led} leds')