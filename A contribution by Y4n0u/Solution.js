const log = readline();
let s = 0;
for(var i = 0; i <= log.length-1; ++i) {
    if(log.charAt(i) == '(') {
        s++;
    }
    else {
        s--;
    }
}

console.log(s);
