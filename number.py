def pascals_triangle(n):
    for i in range(n):
        for j in range(n - i - 1):
            print(' ', end='')

        x = 1
        for j in range(i + 1):
            print(x, end=' ')
            x = x * (i - j) // (j + 1)
        
        print()

pascals_triangle(5)
def number_triangle(n):
    for i in range(1, n + 1):
        for j in range(1, i + 1):
            print(j, end=' ')
        print()

number_triangle(5)
