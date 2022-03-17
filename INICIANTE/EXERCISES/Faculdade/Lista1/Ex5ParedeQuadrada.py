import math

larguraP = float(input("Digite o valor da Largura da Parede em Metros: "))
largA = float(input("Digite o valor da Largura do Azulejo em Metros: "))

areaP = larguraP * larguraP
areaA = larguraA * larguraA
total = areaP / areaA

print("Total de azulejos: ", math.ceil(total))
