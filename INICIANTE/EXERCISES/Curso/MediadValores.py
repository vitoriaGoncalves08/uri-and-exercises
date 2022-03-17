qtdValor = 0;
soma = 0;
media = 0;

valor = float(input("Digite um valor: "))

while (valor >= 0.0):
    soma = soma + valor;
    qtdValor = qtdValor + 1
    #Entrada de valores
    valor = float(input("Digite um valor: "))

#caso digite um valor negativo o laço encerra
media = soma / qtdValor
print("\n Total da  Soma: ", soma)
print("\n Qtd de valores digitados: ", soma)
print("\n Média: ", soma)
