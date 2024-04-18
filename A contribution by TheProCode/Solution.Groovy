input = new Scanner(System.in);
num = input.nextInt()
input.nextLine()
for (i = 0; i < num; ++i) {
    folder = input.nextLine()
    print folder + "/"
}
filename = input.nextLine()
extension = input.nextLine()
println filename + "." + extension