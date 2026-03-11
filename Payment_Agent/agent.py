import requests

def get_payment(payment_id):
    url = f"http://localhost:8080/payments/get/{payment_id}"
    response = requests.get(url)
    return response.json()

while True:
    user_input = input("Ask the payment agent: ")

    if "payment" in user_input:
        payment_id = ''.join(filter(str.isdigit, user_input))
        result = get_payment(payment_id)
        print("Payment Result:", result)

    else:
        print("I only handle payments right now.")