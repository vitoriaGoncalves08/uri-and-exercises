[x, y, z] = (input().split(" "))

if(x >= y and x >= z):
    a = x
    b = y
    c = z
if(y >= x and y >= z):
    a = y
    b = x
    c = z
if(z >= x and z >= y):
    a = z
    b = x
    c = y

if(a < b + c):
    if(a**2 == b**2 + c**2):
        print("TRIANGULO RETANGULO")
    else:
        print("teste")

else:
    print("NAO FORMA TRIANGULO")