//Each new term in the Fibonacci sequence is generated by adding the previous two terms.
//By starting with 1 and 2, the first 10 terms will be:
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

//By considering the terms in the Fibonacci sequence whose 
//values do not exceed four million, find the sum of the even-valued terms.

object Problem2 {
	var avg = 0;  
	var list = List(); 
	def main(args: Array[String]){
		//avg = 0; 
		var sum, x = 0
		sum = 0
		for(a <- 1 to 40000000){
			x = fibonacci(a)
			if(x % 2 == 0)
		  		sum += fibonacci(a);
		 }
		 println(sum)
	}
	  
	//still need to improve this algorithm's run time
	def fibonacci(i: Integer): Integer={
		//print(i + ", ");	
		if(i == 1 || i == 0 || i == 2) return i; 
		else{ 
			return fibonacci(i - 1) + fibonacci(i - 2); 
		}

	}
}