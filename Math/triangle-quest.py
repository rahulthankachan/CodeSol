for i in range(1,input()): #More than 2 lines will result in 0 score. Do not leave a blank line also
    print reduce(lambda x, y: x + pow(10, y-1)*i, range(0,i+1))
