'''A = 5
B = 15
C = 20

print("A == B AND B > C : ", A == B and B > C)
print("A < B or B > C : ", A < B or B > C)
print("not A == B : ", not A == B)



idade = int(input("\nDigite sua idade:"))
if idade > 18:
    print("Tu é o bixão memo")
else:
    print("Neném ainda")'''

A = input("Informe valor da Variável A: ")
B = input("Informe valor da Variável B: ")

if(A>B):
    aux=A;
    A=B;
    B=aux;
    print("A = ", A)
    print("B = ", B)
else:
    print("else hihi")