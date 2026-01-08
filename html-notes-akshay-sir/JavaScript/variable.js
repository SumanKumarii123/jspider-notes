//! how to declare a variable in js
//we use three keyword to declare a varaible in js
// var,let,const
//The main difference b/w let,var and const is based on three scope and there intialization
//var is a global scoped and function scoped variable,we can redeclare as well

                                                        
//! var
var a;//declaration
a=10;//intialization
var a1=20;//declaration+intialization
a1=29;//re-intialization
var a1;//re-declaration
// !let
let b;//declaration
b=2;//intialization
let b1=30;//declaration+intialization
b1=40;//re-intialization
//let b1; //cannot re-declaration
// !const
const c1=10;



// Example
debugger;
let a2=30;
console.log(a2);
a3=50;
console.log(a3);
var a3;
console.log(a3);