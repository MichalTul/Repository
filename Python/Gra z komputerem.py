#import math
#print(math.sin(math.pi/6))

#import math as matematyka
#print(matematyka.pi)

#from math import pi, e
#print(pi,e)

#import random
#print(random.randint(1,10))

#import random
#random.seed(123)
#i=0
#while i < 10:
#    print(random.randint(1, 10))
#    i += 1

#import random
#random.seed(123)
#i=0
#while i < 10:
#    print(random.uniform(1, 10))
#    i += 1

#Zgadujemy jaką komputer wymyślił liczbę:
#import random

#n= random.randint(1, 100)

#while True:
#    k = int(input('Jaka liczbe mam na mysli?'))
#    if n > k:
#        print("za mala")
#    elif n < k:
#        print("za duza")
#    else:
#        print("gratki")
#        break

#Komputer zgaduje liczbę, którą wymyślimy:
a = 1
b = 100

while True:
    target = (a+b)//2
    k = input(f'Czy ta liczba to {target}?')
    if k == 'w':
        a = target + 1
    elif k == 'm':
        b == target - 1
    elif k =='t':
        print('git')
        break
    else:
        print('blad')