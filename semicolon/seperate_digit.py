def separate_digits(number):
    # Initialize an empty list to store the digits
    digits = []

    # Iterate through each digit using // and % operators
    while number > 0:
        digit = number % 10
        digits.append(digit)
        number //= 10

    # Reverse the list to display digits from left to right
    digits.reverse()

    # Print the separated digits
    print("Separated digits:")
    for digit in digits:
        print(digit)

# Example usage: separate the digits of a five-digit integer
user_input = input("Enter a five-digit integer: ")
try:
    number = int(user_input)
    if 10000 <= number <= 99999:
        separate_digits(number)
    else:
        print("Please enter a valid five-digit integer.")
except ValueError:
    print("Invalid input. Please enter a valid integer.")
