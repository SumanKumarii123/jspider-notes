/*console.log(this);
function fun(){
    console.log(this); 
}
fun() *

let p1={
    name:"rohit",
    details: () => {
        console.log(this);   
    }
} 
p1.details()

 let obj={
        name : 'a',
        age : '50' ,
        details : function(){
            console.log(this.name);  
        }
    }
    obj.details() */

    let player ={
        name : 'virat kohli',
        isMarried : true,
        wifeName : 'Anushka' ,
        details : function(){
            console.log(`This wife name is ${this.name}`);  
        },
        details1(){
            console.log(`He is Married true or false ${this.isMarried}`);
            
        }
    }
    console.log(player.name);
    player.details()
    player.details1()
    
