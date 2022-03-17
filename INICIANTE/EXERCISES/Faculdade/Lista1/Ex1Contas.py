valor1 = int(input("Digite o valor 1: "))
valor2 = int(input("Digite o valor 2: "))

soma = valor1 + valor2
subtrai = valor1 - valor2
multiplica = valor1 * valor2
divide = valor1 / valor2
arredonda = valor1 // valor2
x,y =divmod(valor1, valor2)
elevado = pow(valor1, valor2)


print("Soma %i e %i = %i" % (valor1, valor2, soma))
print("Sobtrai %i de %i = %i" % (valor1, valor2, subtrai))
print("Multiplica %i por %i = %i" % (valor1, valor2, multiplica))
print("Divide %i por %i = %i" % (valor1, valor2, divide))
print("%i dividido por %i = %i e o Resto da divisão = %i" % (valor1, valor2, x,y))
print("%i elevado a %i = %i" % (valor1, valor2, elevado))