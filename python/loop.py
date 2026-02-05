# this is how we make a for loop in python
#and yeah it used # sign instead of //, which is kiinda frustrating

for i in range (5):
    print(i)

#this will print numbers from 0 to 4
# if you want to print numbers from 1 to 5, you can do this:
print() #add some space here so it will look separated

for i in range (1,6):
    print(i)

#Notes: By default, range starts from 0
# (1,6) means start from 1 and go up to (but not including) 6
# treat it as a half-open interval [1,6) in mathematics
# its like (start,stop) in math, where start is included but stop is not included
#range in math also means highest value - lowest value (6-1 =5) so thats why we get 5 numbers in the second loop
# which are 1,2,3,4,5
