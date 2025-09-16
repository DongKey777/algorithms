t = int(input())

for _ in range(t):
    PS = list(input())
    stack = []
    
    for s in PS:
        if s == "(":
            stack.append(s)
        elif s == ")" and stack and stack[-1] == "(":
            stack.pop()
        elif s == ")":
            stack.append(s)
            
    if stack:
        print("NO")
    else:
        print("YES")