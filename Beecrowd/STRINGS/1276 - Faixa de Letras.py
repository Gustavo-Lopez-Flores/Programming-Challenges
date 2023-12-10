def calcular_faixas(palavras):
    alfabeto = [0] * 26

    texto = ''.join(palavras)

    for letra in texto:
        indice = ord(letra) - ord('a')
        if 0 <= indice < 26:
            alfabeto[indice] += 1

    faixas = []
    inicio = -1
    for i in range(26):
        if alfabeto[i] > 0:
            if inicio == -1:
                inicio = i
        elif inicio != -1:
            faixas.append("{}:{}, ".format(chr(inicio + ord('a')), chr(i - 1 + ord('a'))))
            inicio = -1

    if inicio != -1:
        faixas.append("{}:{}, ".format(chr(inicio + ord('a')), 'z'))

    if faixas:
        print(''.join(faixas)[:-2])


if __name__ == "__main__":
    try:
        while True:
            linha = input()
            if not linha:
                print()
            else:
                palavras = linha.split()
                calcular_faixas(palavras)
    except EOFError:
        pass
