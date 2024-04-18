const N = parseInt(readline());
let ans = 0
for(var i = N; i >= 1; --i) {
    ans += N*i;
}
console.log(ans);
