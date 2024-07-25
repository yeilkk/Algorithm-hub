def solution(n):
    a = n//7
    mod = n%7;
    if(n < 7):
        return 1
    elif(mod==0):
        return a
    else:
        return a+1