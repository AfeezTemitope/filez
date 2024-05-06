total = 0
product = 1
smallest = float('inf')
largest = float('-inf')

for i in range(4):
    num = int(input(f"Enter integer {i+1}: "))
    total += num
    product *= num
    smallest = min(smallest, num)
    largest = max(largest, num)

average = total / 4

# Print the results
print(f"Sum: {total}")
print(f"Average: {average:.2f}")
print(f"Product: {product}")
print(f"Smallest: {smallest}")
print(f"Largest: {largest}")
