a=[]
for i in range(6):
a.append([int(x) for x in input().split()])
M=0
for i in range(4):
for j in range(4):
m=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]
m+=a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]
if(M<m):
M=m
print(M)
