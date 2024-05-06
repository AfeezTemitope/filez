total_score = 0
for number in range(10):
    score = int(input("Enter a score: "))
    total_score += score


print(f"The average score is {total_score / 10}")