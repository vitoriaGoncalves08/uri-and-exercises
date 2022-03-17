notaA = float(input("nota 1: "))
notaB = float(input("nota 2: "))

#calcular media
media = (notaA + notaB)/2

#verificacao
if media >= 7.0:
    print("A média: %.1f - Aprovado"% media, ";)")
elif media == 0:
    print("A média %.1f - Requer assinatura do responsável"% media)
else:
    print("A média: %.1f - Reprovado"% media)
