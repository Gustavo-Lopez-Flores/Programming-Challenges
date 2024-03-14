def hamming(x, y):
    return bin(x ^ y).count('1')


while True:
    x, y = map(int, input().split())

    if x == 0 and y == 0:
        break

    print(hamming(x, y))
