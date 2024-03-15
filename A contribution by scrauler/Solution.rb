a,b,c,d = gets.split.map(&:to_i)
e,f,g,h = gets.split.map(&:to_i)
i = c*d+g*h
j = [0,[a + c, e + g].min-[a, e].max].max
k = [0,[b + d, f + h].min-[b, f].max].max
puts i-j*k
