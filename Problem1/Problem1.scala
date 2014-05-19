/***
**
If we list all the natural numbers below 10 that are multiples of 3 or 5, 
we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/
object Problem1 {
	def main(args: Array[String]) {
		var multipleFive, multipleThree, avg = 0; 

		for(a <- 1 to 999){
			multipleFive = a % 3; 
			multipleThree = a % 5; 

			if(a % 15 != 0){
				if (multipleFive == 0) {
					avg += a; 
				} else if (multipleThree == 0) {
					avg += a; 
				}
			} else {
				avg += a; 
			}
		}
		println(avg)
	}
}