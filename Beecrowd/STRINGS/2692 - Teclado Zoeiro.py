casos, frases = map(int, input().split())
letras = {}

for i in range(casos):
    um, dois = input().split()
    letras[um] = dois
    letras[dois] = um

for i in range(frases):
    linha = input()
    novaLinha = []
    
    for j in linha:
        if j in letras:
            novaLinha.append(letras[j])
        else:
            novaLinha.append(j)
    
    print(''.join(novaLinha))
