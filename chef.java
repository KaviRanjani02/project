def chef_happiness(test_cases);
    results =[]
    
    for case in test_cases:
        N, l, r, A = case
        m = sum(1 for x in A if l <= x <= r)
        
        max_happiness = m
        min_happiness = - (N - m)
        
        results.append(f"{max_happiness} {min_happiness}")
    
    return results

 Read input
T = int(input())
test_cases = []

for _ in range(T):
    N, l, r = map(int, input().split())
    A = list(map(int, input().split()))
    test_cases.append((N, l, r, A))

 Get results and print
results = chef_happiness(test_cases)
for result in results:
    print(result)
