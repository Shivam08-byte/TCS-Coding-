n=int(input())

x=[]
y={}

for i in range(n*(n-1)//2):
	x.append(input().split(" "))


for i in x:
	y[i[0]]=0
	y[i[1]]=0


for i in range(n*(n-1)//2):
	p=x[i][-1].split("-")
	if int(p[0])>int(p[1]):
		y[x[i][0]]+=3

	elif int(p[0])<int(p[1]):
		y[x[i][1]]+=3

	else:
		y[x[i][0]]+=1
		y[x[i][1]]+=1	


win=0
team=""

for i,j in y.items():
	if j>win:
		win=j
		team=i

print(team)
print(win)	

			
