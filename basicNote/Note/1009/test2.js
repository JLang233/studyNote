let str ="    .123";
let r = "";

for(let i = 0; i < str.length; i++){
    let j = str.charCodeAt(i);
    if((j >=48 && j <=57) || j==46){
        r += str[i];
    }else{
        if(r.length != 0) break;
    }
}

console.log(r);