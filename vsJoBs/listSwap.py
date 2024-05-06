my_List = [2,33,22,1,212,332,734,556,77]
print('original list', my_List)
my_List[5:7] = my_List[5:7][::-1]
print('reverse:', my_List)