	var accountBalance = 400;
	var nikeShoes = 400;
	var coupon = 50;
	
	if(nikeShoes <=accountBalance){
	console.log("Nike shoes were bought");
	console.log("Your updated account balance is : "+ accountBalance-nikeShoes);
	}
	else if(nikeShoes-coupon <= accountBalance){
	console.log("Cool! Nike Shoes were bought with a coupon");
	console.log("Your updated account balance is : "+ accountBalance-(nikeShoes-coupon));
	}
	else
	{
	console.log("Insufficient money to buy nike shoes");
	}