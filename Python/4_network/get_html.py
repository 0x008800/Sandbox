import urllib.request

response = urllib.request.urlopen('https://google.com/')
products = response.read()
mystr = products.decode("utf8")
response.close()
file = open('file.txt', 'w')
file.write(mystr)
file.close()
print(mystr)
