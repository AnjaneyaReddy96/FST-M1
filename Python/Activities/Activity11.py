fruit_shop = {
    "apple": 5,
    "banana": 10,
    "orange": 12,
    "muskmelon": 18
}
 
to_check = input("What are you looking for? ").lower()
 
if(to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")