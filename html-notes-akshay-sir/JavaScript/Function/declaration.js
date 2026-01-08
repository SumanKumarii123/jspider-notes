// ! function declaration
/* function sum(){
    console.log('This is a function');  
}
sum() */

function sum(a=0,b=0,c=0){
    console.log(a+b+c);
    return a+b+c;
}
console.log(sum());
console.log(sum(10));
console.log(sum(10,20));
console.log(sum(10,20,30));



