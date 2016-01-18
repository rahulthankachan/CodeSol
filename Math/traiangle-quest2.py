for i in range(1,int(raw_input())+1): #More than 2 lines will result in 0 score. Do not leave a blank line also
    print sum(map(lambda x: pow(10,x),range(0,i)))* sum(map(lambda x: pow(10,x),range(0,i)))
