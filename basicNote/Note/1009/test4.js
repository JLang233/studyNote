let red = new Array;
let s = new Array;
let i,j;

for(i = 0; i < 33; i++) red[i] = i+1;
for(i = 0; i < 6;i++){
    j = Math.floor(Math.random()*(32-i)); 
    s[i] = red[j];
    for(let k = j; k < red.length; k++) red[k] = red[k+1];
    red.length--;
}
s[i] = Math.floor(Math.random()*(16))+1;

console.log(s);
