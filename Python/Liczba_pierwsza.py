while True:
    n = int(input('Podaj liczbę n (>2)'))
    if n < 2:
        break
    #sprawdzanie czy n jest liczba pierwsza
    if (n == 2):
        print(f"{n} - liczba pierwsza")
    elif (n % 2 == 0):
        print(f"{n} - liczba złożona")
    else:
        d = 3
        flag = True
        while d * d <= n:
            if n % d == 0:
                print(f"{n} - liczba złożona")
                flag = False
                break
            d += 2
        if flag:
            print(f"{n} - liczba pierwsza")