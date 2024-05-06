
ACTUAL = 7
for i in range(3):

	userInput = int(input("enter a nmmber between (1 - 10):  "))

	if userInput == ACTUAL:
		print("you guessed correctly")
		break
	if userInput != ACTUAL:
		print("try again!")
		
	