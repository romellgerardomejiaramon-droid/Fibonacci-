def fibonacci(n):
    if n <= 0:
        print("Por favor ingresa un número mayor a 0")
        return

    a = 0
    b = 1

    print(a)
    if n == 1:
        print("Fin de la serie Fibonacci")
        return

    print(b)

    for i in range(3, n + 1):
        c = a + b
        print(f"{a} + {b} = {c}")
        a = b
        b = c

    print("Fin de la serie Fibonacci")

if __name__ == "__main__":
    fibonacci(500)
