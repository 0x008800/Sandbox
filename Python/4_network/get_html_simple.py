import requests

url = 'https://freelance.ua/?orders=android-development&page=1&pc=1'
r = requests.get(url)

print(r.text)
