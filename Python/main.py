"""
                            Indentation

#Indentation refers to the spaces at the beginning of a code line.
if 5 > 2:
  print("Five is greater than two!")

............................................................................

This is a comment
written in
more than just one line

...............................................................................

x = 4       # x is of type int
x = "Sally" # x is now of type str
print(x)

...............................................................................

# String variables can be declared either by using single or double quotes:
x = "John"
# is the same as
x = 'John'

...............................................................................

a = 4
A = "Sally"
#A will not overwrite a

...............................................................................

Pascal Case
MyName="Pro"

camelCase
myName='Pro'
...............................................................................

x, y, z = "Orange", "Banana", "Cherry"
x = y = z = "Orange".............................assigning same vakue to the variables

fruits = ["apple", "banana", "cherry"]
x, y, z = fruits

...............................................................................

print(x, y, z)
print(x + y + z)

Better to use comma wala as it will import space also...In + one you have to manually give space

NOTE:-For numbers, the + character works as a mathematical operator

NOTE:-When you try to combine a string and a number with the + operator, Python will give you an error...so better to use , wala

...............................................................................

Variables that are created outside of a function (as in all of the examples above) are known as global variables.
Global variables can be used by everyone, both inside of functions and outside.

x = "awesome"

def myfunc():
  print("Python is " + x)

myfunc()
............................................................................

If you create a variable with the same name inside a function, this variable will be local, and can only be used 
inside the function. The global variable with the same name will remain as it was, global and with the original value

x = "awesome"

def myfunc():
  x = "fantastic"
  print("Python is " + x)

myfunc()

print("Python is " + x)

.......................................................................

                    GLOBAL KEYWORD

To create a global variable inside a function, you can use the global keyword

def myfunc():
  global x
  x = "fantastic"

myfunc()

print("Python is " + x)

..........................................................................

x = "awesome"

def myfunc():
  global x
  x = "fantastic"

myfunc()

print("Python is " + x)

...............................................................................
                        DATATYPES
                        
In Python, the data type is set when you assign a value to a variable                        
                        
x = "Hello World"

print(x)         #displays x
print(type(x))   #display the data type of x

..............................................................................
                 Builtin Datatype

Text Type:	str
Numeric Types:	int, float, complex
Sequence Types:	list, tuple, range
Mapping Type:	dict
Set Types:	set, frozenset
Boolean Type:	bool
Binary Types:	bytes, bytearray, memoryview
None Type:	NoneType
                
...............................................................................

x = "Hello World"	str	
x = 20	int	
x = 20.5	float	
x = 1j	complex	
x = ["apple", "banana", "cherry"]	list	
x = ("apple", "banana", "cherry")	tuple	
x = range(6)	range	
x = {"name" : "John", "age" : 36}	dict	
x = {"apple", "banana", "cherry"}	set	
x = frozenset({"apple", "banana", "cherry"})	frozenset	
x = True	bool	
x = b"Hello"	bytes	
x = bytearray(5)	bytearray	
x = memoryview(bytes(5))	memoryview	
x = None
..............................................................................

        Setting the Specific Data Type

x = str("Hello World")	str	
x = int(20)	int	
x = float(20.5)	float	
x = complex(1j)	complex


...............................................................................

            Type Conversion
            
x = 1    # int
y = 2.8  # float
z = 1j   # complex

#convert from int to float:
a = float(x)

#convert from float to int:
b = int(y)

#convert from int to complex:
c = complex(x)

m = int("3")     # m will be 3
z = float("3")   # z will be 3.0
w = float("4.2") # w will be 4.2

x = str("s1") # x will be 's1'
y = str(2)    # y will be '2'
z = str(3.0)  # z will be '3.0'
..............................................................................

                Random Number
Python has a built-in module called random that can be used to make random numbers.                
Import the random module, and display a random number between 1 and 9:

import random
print(random.randrange(1, 10))                

...............................................................................
                BOOLEAN

You can execute code based on the Boolean answer of a function:

Example
Print "YES!" if the function returns True, otherwise print "NO!":

def myFunction() :
  return True

if myFunction():     #if True:                                                                                                      
  print("YES!")
else:
  print("NO!")

...........................
Check if an object is an integer or not:

x = 200
print(isinstance(x, int))

"""