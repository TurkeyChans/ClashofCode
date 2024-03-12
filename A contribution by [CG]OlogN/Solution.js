const N = parseInt(readline());

for(var i = 1; i <= N; ++i) {
    if(i % 5 == 0 && i % 7 == 0) {
        console.log('FooBar')
    }
    else if(i % 5 == 0) {
        console.log('Foo')
    }
    else if(i % 7 == 0) {
        console.log('Bar')
    }
    else {
        console.log(i);
    }
    
}
