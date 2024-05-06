import random

ACTUAL_NUMBER = random.randrange(1, 10)

for i in range(10):
	userInput = int(input("enter a nmmber between (1 - 10):  "))

	if userInput == ACTUAL_NUMBER:
		print("you guessed correctly", ACTUAL)
		break
	if userInput != ACTUAL_NUMBER:
		print("try again!")
		
	