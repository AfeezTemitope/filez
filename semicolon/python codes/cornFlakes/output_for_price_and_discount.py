price = int(input('enter price'))
discount_price = int(input('enter discount'))

discount = discount_price / 100
output_for_price_and_discount = price * discount
discounted_price = price - output_for_price_and_discount

print(f"Discounted price: {discounted_price:.2f}")
