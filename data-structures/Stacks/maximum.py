# Enter your code here. Read input from STDIN. Print output to STDOUT

n_queries = input()
stack_values = []
max_val = [-9999]

for i in range(0, n_queries):
    query = raw_input()
    operator = int(query[0])
    
    if operator == 1:
        #Append
        operator, value = map(int, query.split())
        stack_values.append(float(value))
        if max_val[-1] <= value:
            max_val.append(value)
        
        
    elif operator == 2:
        #delete
        if len(stack_values):
            pop_val = stack_values.pop()
            if pop_val == max_val[-1]:
                max_val.pop()
        
    elif operator == 3:
        #max
        print int(max_val[-1])
            
            


    
    
