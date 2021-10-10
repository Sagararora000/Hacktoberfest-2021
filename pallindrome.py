n=int(input())
temp=n 
sum1=0
while(n!=0):
    r=n%10 
    sum1=(sum1*10)+r
    n=n//10
if(temp==sum1):
    print("Number is Pallindrome")
else:
    print("Number is not Pallindrome")

