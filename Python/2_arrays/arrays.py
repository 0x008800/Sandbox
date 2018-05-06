from array import *

# arrayName = array(typecode, [initializers])

my_array = array('i', [1,2,3,4])



#    ‘b’ -> Represents signed integer of size 1 byte
#    ‘B’ -> Represents unsigned integer of size 1 byte
#    ‘c’ -> Represents character of size 1 byte
#    ‘u’ -> Represents unicode character of size 2 bytes
#    ‘h’ -> Represents signed integer of size 2 bytes
#    ‘H’ -> Represents unsigned integer of size 2 bytes
#    ‘i’ -> Represents signed integer of size 2 bytes
#    ‘I’ -> Represents unsigned integer of size 2 bytes
#    ‘w’ -> Represents unicode character of size 4 bytes
#    ‘l’ -> Represents signed integer of size 4 bytes
#    ‘L’ -> Represents unsigned integer of size 4 bytes
#    ‘f’ -> Represents floating point of size 4 bytes
#    ‘d’ -> Represents floating point of size 8 bytes

for i in my_array:
    print(i)

print('my_array[0] -', my_array[0])

my_array.append(5)

print(my_array)

my_array.insert(0,0)

print(my_array)

my_extend_array = array('i', [6,7,8,9])

my_array.extend(my_extend_array)

print(my_array)

c = [10, 11, 12] # this is list

my_array.fromlist(c)

print(my_array)

my_array.remove(10)

print('remove 10 element')

print(my_array)

print(my_array.pop())

print(my_array)

temp = my_array.index(2)

print(temp)

# reverse_arr = my_array.reverse()

# print(reverse_arr)

print(my_array.buffer_info())

print(my_array.count(5)) # Check for number of occurrences of an element

char_array = array('u', ['0','x','0','0','8','8','0','0'])

print('convert char array to string: ', char_array.tobytes())


