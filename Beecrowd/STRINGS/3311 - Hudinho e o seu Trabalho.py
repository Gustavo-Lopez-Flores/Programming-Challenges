N = int(input())

nomes = []

for _ in range(N):
    nome = input().strip()
    nomes.append(nome)

nomes_ordenados = sorted(nomes, key=lambda x: x[0])

for nome in nomes_ordenados:
    print(nome)