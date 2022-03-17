import math

larguraP = float(input("Digite a Largura da Parede em Metros: "))
alturaP = float(input("Digite a Altura da Parede em Metros: "))
larguraA = float(input("Digite a Largura do Azulejo em Metros: "))
alturaA = float(input("Digite a Altura do Azulejo em Metros: "))

areaP = larguraP * alturaP
areaA = larguraA * alturaA
total = areaP / areaA

print("Total de azulejos: ", math.ceil(total))

