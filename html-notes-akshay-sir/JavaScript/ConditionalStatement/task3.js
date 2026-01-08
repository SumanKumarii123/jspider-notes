//take thee price from the user 
// if price is more than 2000 give 10% discount
// if price is more than 4000 give 20% discount
// if price is more than 6000 give 30% discount
44
let price=parseInt(prompt('Enter price1'));
if(price>6000){
    console.log('Discount price is :',price-price*0.3);   
}
else if(price>4000){
    console.log('20% discount',price-price*0.2);   
}
else if(price>2000){
    console.log('30% discount',price-price*0.1);  
}