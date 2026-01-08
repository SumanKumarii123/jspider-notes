const people = [
  { id: 1, name: "Alice", age: 22, role: "Developer", city: "Bengaluru", salary: 55000, email: "alice@mail.com", married: false },
  { id: 2, name: "Bob", age: 30, role: "Designer", city: "Chennai", salary: 48000, email: "bob@mail.net", married: true },
  { id: 3, name: "Charlie", age: 28, role: "Manager", city: "Mumbai", salary: 75000, email: "charlie@mail.com", married: false },
  { id: 4, name: "David", age: 35, role: "Developer", city: "Delhi", salary: 62000, email: "david@mail.org", married: true },
  { id: 5, name: "Emma", age: 26, role: "Developer", city: "Bengaluru", salary: 59000, email: "emma@mail.com", married: false },
  { id: 6, name: "Fiona", age: 31, role: "Designer", city: "Hyderabad", salary: 50000, email: "fiona@mail.net", married: true },
  { id: 7, name: "George", age: 29, role: "Manager", city: "Chennai", salary: 78000, email: "george@mail.com", married: true },
  { id: 8, name: "Hannah", age: 24, role: "Developer", city: "Mumbai", salary: 57000, email: "hannah@mail.com", married: false },
  { id: 9, name: "Irene", age: 27, role: "Designer", city: "Bengaluru", salary: 51000, email: "irene@mail.com", married: false },
  { id: 10, name: "Jack", age: 33, role: "Manager", city: "Delhi", salary: 80000, email: "jack@mail.org", married: true }
];

// 1. Filter all people whose role is “Developer”.
/*let op=people.filter((el) =>{
    return el.role=='Developer';
})
console.log(op); */

// 2. Get an array of all names
*/ let names=people.map(el) =>el.name;
console.log(names); */


// 3. Calculate the total salary of all people.
/* let sum=people.reduce((acc,el,i,people) =>{
    return acc+el.salary;
},0);
console.log(sum); */

// 4. Check if any person has a salary above 75,000.
/* let op=people.filter((el) =>{
    return el.salary>75000;
})
console.log(op); */

// 5. Get all people living in “Bengaluru”.
/* let op=people.filter((el) => {
    return el.city=="Bengaluru";
})
console.log(op); */

// Determine whether any person is from “Hyderabad”.
/* let op=people.filter((el) => {
    return el.city=="Hyderabad";
})
console.log(op); */

// Find the average age of all people.
let op=people.reduce((acc,el,i,people) => {
    return (acc+el.age)/10;
},0)
console.log(op);




