# Funkcje
def hamming(data_bits):
    m = len(data_bits)
    r = 1

    # Obliczanie liczby bitów parzystości
    while (2 ** r) < (m + r + 1):
        r += 1

    parity_bits = [0] * r
    hamming_code = [None] * (m + r)

    j = 0
    # Rozmieszczenie bitów danych i miejsc na bity parzystości
    for i in range(1, len(hamming_code) + 1):
        if (i & (i - 1)) == 0:  # Sprawdzanie, czy jest to pozycja bitu parzystości
            hamming_code[i - 1] = 0
        else:
            hamming_code[i - 1] = int(data_bits[j])
            j += 1

    # Obliczanie wartości bitów parzystości
    for i in range(r):
        parity_pos = 2 ** i
        count = 0
        for j in range(parity_pos - 1, len(hamming_code), 2 * parity_pos):
            count += sum(hamming_code[j:j + parity_pos])
        parity_bits[i] = count % 2
        hamming_code[parity_pos - 1] = parity_bits[i]

    return ''.join(map(str, hamming_code))

def na16bit(binary_text):
    # Dzieli binarny ciąg znaków na fragmenty po 16 bitów
    if len(binary_text) % 16 != 0:
        binary_text += '0' * (16 - len(binary_text) % 16)  # Uzupełnienie zerami
    return [binary_text[i:i+16] for i in range(0, len(binary_text), 16)]

def binar(text):
    # Zamiana znaków na binarne wartości ASCII
    binary_values = [bin(ord(char))[2:].zfill(8) for char in text]
    return ''.join(binary_values)  # Złączenie binarnych wartości w jeden ciąg

def decode_hamming(hamming_code):
    n = len(hamming_code)
    r = 1

    # Obliczanie liczby bitów parzystości
    while (2 ** r) < n + 1:
        r += 1

    # Przekształcenie na listę liczb całkowitych
    hamming_code = [int(bit) for bit in hamming_code]

    # Wykrywanie i korygowanie błędów
    error_pos = 0
    for i in range(r):
        parity_pos = 2 ** i
        count = 0
        for j in range(parity_pos - 1, n, 2 * parity_pos):
            count += sum(hamming_code[j:j + parity_pos])
        if count % 2 != 0:
            error_pos += parity_pos

    # Korygowanie błędu, jeśli występuje
    if error_pos > 0:
        print(f"Znaleziono błąd na pozycji {error_pos}, koryguję.")
        hamming_code[error_pos - 1] ^= 1  # Odwrócenie bitu

    # Usuwanie bitów parzystości i ekstrakcja danych
    decoded_data = []
    for i in range(1, n + 1):
        if (i & (i - 1)) != 0:  # Pomiń pozycje będące potęgami 2 (bity parzystości)
            decoded_data.append(hamming_code[i - 1])

    return ''.join(map(str, decoded_data))

# Zamiana z powrotem na tekst ASCII
def binary_to_text(binary_str):
    decoded_text = ''
    for i in range(0, len(binary_str), 8):
        byte = binary_str[i:i+8]
        if byte:  # Upewnij się, że fragment ma 8 bitów
            decoded_text += chr(int(byte, 2))
    return decoded_text


# Kod
tryb = input("Chcesz zakodować czy zdekodować wiadomość (K - kodowanie, D - zdekodowanie): ").strip().lower()  # Wybranie opcji kodowanie/dekodowanie
szyfrowanie = (tryb == 'k') # Sprawdzenie, czy wybrano tryb kodowania

if szyfrowanie:
    wiad = input("Podaj wiadomość do zakodowania: ")  # Pobranie wiadomości do zakodowania
    kod_wiad = binar(wiad)  # Zamiana wiadomości na postać binarną
    wiad16bit = na16bit(kod_wiad)  # Podział na 16-bitowe fragmenty
    zakod_wiad = [hamming(fragment) for fragment in wiad16bit]  # Kodowanie Hamminga każdego fragmentu
    print("Kod Hamminga:", zakod_wiad)
else:
    wiad = input("Podaj zakodowaną wiadomość (oddziel fragmenty spacjami): ").strip()  # Pobranie wiadomości do zdekodowania
    zakodowane_fragmenty = wiad.split()  # Rozdzielenie zakodowanych fragmentów na listę, zakładamy, że fragmenty są rozdzielone spacjami
    odkodowane_fragmenty = [decode_hamming(fragment) for fragment in zakodowane_fragmenty]   # Dekodowanie każdego fragmentu zakodowanego Hamminga
    odkodowane_binarne = ''.join(odkodowane_fragmenty)  # Złączenie zdekodowanych fragmentów w jeden ciąg binarny
    tekst_odkodowany = binary_to_text(odkodowane_binarne)    # Konwersja z binarnego ciągu na tekst ASCII
    print("Ostatecznie odkodowany tekst:", tekst_odkodowany)