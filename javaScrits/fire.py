
from even import even_indexes

array = []
for i in range(10):
		number = int(input(' enter score '))
		array.append(number)

even_indices = even_indexes(array)
print(even_indices) 