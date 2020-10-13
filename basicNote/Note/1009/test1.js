// let n = 0, m = 0;
//     if (n == 0) {
//         if (m > 0) {
//     	console.log("True");
//         }
//         else {
//     	console.log("False");
//         }
//     }

//console.log("True");

// let z = 1, n = 4;
// if (n == 0) console.log(z);

// for (let i = 1; i <= n; i++) {
//   z += 4 * i - 3;
// }
// console.log(z);

let a = new Array();
let n = 5;
let i,j,k;

a[0] = new Array();
a[0][0]=1;

//构造二维数组，根据上一行计算这一行
for(i = 1; i < n; i++){
    a[i] = new Array();
    a[i][0]=i+1;
    for(j = 1; j < i; j++) a[i][j] = a[i-1][j-1]+a[i-1][j];
    a[i][j] = i+1;   
}

//先打印空格再打印数字
let s =""
for(i = 0; i < n; i++){
    j = n-i;
    for(k = 1;k <= j;k++) s += " ";
    for(j = 0; j <= i; j++) s += a[i][j] + " ";
    console.log(s);
    s = "";
}