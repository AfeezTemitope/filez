positive_count = 0
negative_count = 0

    
while True:
 try:
   num = int(input("Enter a number: "))
   if num > 0:
    positive_count += 1
   elif num < 0:
    negative_count += 1
 except ValueError:
        print("Invalid input. Please enter a valid integer.")

choice = input("Do you want to enter another number? (y/n): ")
if choice.lower() != 'y':
    break

print(f"Count of positive numbers: {positive_count}")
print(f"Count of negative numbers: {negative_count}")