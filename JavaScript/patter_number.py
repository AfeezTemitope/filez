
#5 4 3 2 1
#4 3 2 1
#3 2 1
#2 1
#1
user_input = int(input("Enter a value : "))
for i in range(user_input, 0, -1):
        for j in range(i, 0, -1):
            print(j, end=" ")
        print()


