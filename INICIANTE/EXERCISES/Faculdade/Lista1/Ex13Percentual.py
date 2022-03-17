totalEstoque = int(input("Digite o Total de um objeto em Estoque: "))
totalVendido = int(input("Digite o Total Vendido desse objeto: "))

percent = totalVendido * 100 / totalEstoque

print("Foram vendidos cerca de: %.2f" % percent,"%")
