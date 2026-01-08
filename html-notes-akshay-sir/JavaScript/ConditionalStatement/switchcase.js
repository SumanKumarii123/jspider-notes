let day=6;
switch(day){
    case 0:{
        console.log('Sunday');
        break;
    }
    case 1:{
        console.log('Monday');
    }
    case 2:{
        console.log('Tuesday');
    }
    case 3:{
        console.log('Wednesday');
    }
    case 4:{
        console.log('Thursday');
    }
    case 5:{
        console.log('Friday');
    }
    case 6:{
        console.log('Saturday');
    }
    default :{
        console.log('Please enter correct day');    
    }
}


// ! 4. nested if else
    let username = prompt('Enter your name');
    if(username){
        let age = prompt('Enter your age')
        if(age){
             console.log(username , age);
        }else{
            console.log('Enter correct age');
            
        }
    }else{
        console.log('please enter the correct username')
    }