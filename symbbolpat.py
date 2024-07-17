def pyramid(n):
    for i in range(n):
        print(' ' * (n - i - 1) + '*' * (2 * i + 1))

pyramid(5)
def inverted_pyramid(n):
    for i in range(n, 0, -1):
        print(' ' * (n - i) + '*' * (2 * i - 1))
      
inverted_pyramid(5)
