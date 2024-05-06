name = input(' name of goods')
price = int(input('enter price'))
output_for_price_and_discount = price * 0.10
discounted_price = price - output_for_price_and_discount

print(f"Discounted price for {name} is: {discounted_price:.2f}")
