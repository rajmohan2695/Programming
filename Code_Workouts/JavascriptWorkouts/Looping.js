//Looping
//for loop
var str = "Hello World";
for(var i=0;i<str.length;i++){
console.log(str[i])
}

//foreach loop
for(var i=0;i<str.length;i++){
console.log(str[i])
}

/* Output for both will be 
H
e
l
l
o

W
o
r
l
d
*/

//forEach loop
function add(args){
j=0;    
args.forEach((i,k,l,m)=>{
    j+=i;    
	console.log(m);
})
console.log(j);
}
add(1,2,3,4,5);

//forin
function add(...args){
for(let i in args){
    console.log(i);    
}
}
add(1,2,3,4,5);

/* Output
	0 
	1 
	2 
	3 
	4
*/

//forof							// It is used to iterate all the elements present inside the function
function add(args){
j=0;    
for(let i of args){
    j+=i;    
}
console.log(j);					// 15
}
add([1,2,3,4,5]);

/*---------------------------------------------------------------*/

//while loop
var i=1;
while(i<=5){
	console.log(i);
	i++;
}
/*	Output:
		1
		2
		3
		4
		5
		5
*/

/*---------------------------------------------------------------*/

//do..while loop
var i=1000;
do{
	console.log('Hello');
}while(i<10);

/* Output
	Hello
*/

/*---------------------------------------------------------------*/

//Looping through the object inside an object

var myObj = {
	"name":"John",
	"age":30,
	"cars": {
	  "car1":"Ford",
	  "car2":"BMW",
	  "car3":"Fiat"
	}
   }

   for(var x in myObj){
	   if(typeof myObj[x] != 'object'){
		   console.log(x+" : "+myObj[x])
	   }
	   else{
		   for(var y in myObj[x]){
			   console.log(x+" : "+y+" : "+myObj[x][y]);
		   }
	   }
   }

   /* Output
   	  	name : John
		age : 30
		cars : car1 : Ford
		cars : car2 : BMW
		cars : car3 : Fiat
	*/

/*---------------------------------------------------------------*/

//Looping through nested objects

var myObj = {
	"name":"John",
	"age":30,
	"cars": {
	  "car1":"Ford",
	  "car2":"BMW",
	  "car3":"Fiat",
       "cars":{
            "van1":"FordVan",
            "van2":"BMWVan",
            "van3":{
                    "Bus":"BMW",
                    "Bus2":"Benz"
            },
            "van4":{
                    "Train":"Train2",
                    "Train1":"Train3"
       }
       }
	}
   }
function keys(Obj){
   for(var x in Obj){
	   if(typeof Obj[x] != 'object'){
		   console.log(x+" : "+Obj[x])
	   }
	   else{
		   keys(Obj[x]);
		   }
	   }
}
keys(myObj);

/* Output
	name : John
	age : 30
	car1 : Ford
	car2 : BMW
	car3 : Fiat
	van1 : FordVan
	van2 : BMWVan
	Bus : BMW
	Bus2 : Benz
	Train : Train2
	Train1 : Train3
*/

/*---------------------------------------------------------------*/