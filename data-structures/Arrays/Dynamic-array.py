# Enter your code here. Read input from STDIN. Print output to STDOUT
lastans = 0
N,Q = map(int, raw_input().split())
all_seq = []

for i in range(0,N):
    all_seq.append([])
    
for q in range(0,Q):
    query = map(int, raw_input().split())
    if query[0] == 1:
        to_seq = ((query[1] ^ lastans)%N)
        all_seq[to_seq].append(query[2])
    elif query[0] == 2:
        to_seq = ((query[1] ^ lastans)%N)
        print all_seq[to_seq][(query[2] % len(all_seq[to_seq]))]
        lastans = all_seq[to_seq][(query[2] % len(all_seq[to_seq]))]
        
