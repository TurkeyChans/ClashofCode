import std;

void main()
{
    int N = readln.chomp.to!int;
    long ans = 0;
    for(int i = N; i >= 1; --i) {
        ans += N*i;
    }


    writeln(ans);
}