  // Using Bind Function.
	this.age = 13;
  function student(firstName,lastName,age){
    this.firstName = firstName;
    this.lastName = lastName;
     this.age = age;
    this.greeting = function(){
    return "Hi I am "+this.firstName+" "+this.lastName+". And i am "+this.age+" years old.";
    }
  }

  var student1 = new student("Raj","Mohan",23);
  var student2 = new student("Kavin","Kumar",24);
  var stu = student1.greeting.bind(student1);
  

  console.log(student1.greeting());
  console.log(student2.greeting());
  console.log(stu());

  // console.log(student1.firstName,student1.lastName,student1.age);
  // console.log(student2.firstName,student2.lastName,student2.age);