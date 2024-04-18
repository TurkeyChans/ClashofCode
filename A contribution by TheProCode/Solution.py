ans = ""
num = int(input())
for i in range(num):
    folder = input()
    ans += folder + "/"
filename = input()
extension = input()
ans += filename + "." + extension
print(ans)
