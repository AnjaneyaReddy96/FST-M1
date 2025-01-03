# Given lists
listOne = [33, 23, 11, 7, 19]
listTwo = [22, 56, 44, 64, 12]
 
# Print the lists
print("First List ", listOne)
print("Second List ", listTwo)
 

thirdList = []
 

for num in listOne:
    if (num % 2 != 0):
        thirdList.append(num)
        

for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)
 
# Print result
print("result List is:")
print(thirdList)