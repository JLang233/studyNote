let str ="    asd...9993";
let r = "";

for(let i = 0; i < str.length; i++){
    let j = str.charCodeAt(i);
    if(j >=48 && j <=57){
        r += str[i];
    }else{
        if(j == 46 && r.length == 0){
            r +=str[i];
        }else{
            if(r.length != 0) break;
        }
    }
}

console.log(r);