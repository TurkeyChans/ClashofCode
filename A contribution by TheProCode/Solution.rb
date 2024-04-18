ans = ""
num = gets.to_i
num.times do
  folder = gets.chomp
  ans += folder + "/"
end
filename = gets.chomp
extension = gets.chomp
ans += filename + "." + extension
puts ans
