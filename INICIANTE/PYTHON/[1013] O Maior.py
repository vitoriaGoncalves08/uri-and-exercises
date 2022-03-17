[A,B,C] = map(int, input().split(" "))

'''MaiorAB = (a + b + abs(a - b))/2
Maior = (MaiorAB + c + abs(MaiorAB - c))/2'''

maior = max(A,B,C)
print(maior, "eh o maior")