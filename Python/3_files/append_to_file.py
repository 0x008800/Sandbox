data = input('enter your data: ')
f = open('file.txt', 'a')
f.write(data + '\n')
f.close()
