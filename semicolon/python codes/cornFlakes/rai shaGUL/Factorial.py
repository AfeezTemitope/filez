number = int(input('enter an integer: '))
long_factorial = 1
for i in range (1, number + 1):
  long_factorial *= i

print(f'factorial of {number} is {long_factorial}')