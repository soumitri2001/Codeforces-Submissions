# Cf Round - 669/ Q-C 

# Solution Code
# ......................
import sys
no=(int)(input())
if no==1:
    print('! 1')
    sys.exit(0)
ar=[-1]*(no+1)
print('? 1 2', flush=True)
v1=(int)(input())
print('? 2 1', flush=True)
v2=(int)(input())
n=0
if v2>v1:
    ar[2]=v2
    n=1
else:
    ar[1]=v1
    n=2
for i in range(3,no+1):
    print('?',n,i, flush=True)
    r1=(int)(input())
    print('?',i,n, flush=True)
    r2=(int)(input())
    if r2>r1:
        ar[i]=r2
        n=n
    else:
        ar[n]=r1
        n=i
print('! ',end='')
for i in range(1,no+1):
    if ar[i]==-1:
        print(no,end=' ',flush=True)
    else:
        print(ar[i],end=' ',flush=True)