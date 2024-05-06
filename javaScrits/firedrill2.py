scores = []

for i in range(10):
	score = int(input(f"enter score #{i+1} :  "))
	scores.append(score)
print('Scores (horrizontally): ',end=" ")
for score in scores:
	print(score)