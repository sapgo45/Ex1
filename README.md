# Ex1-oop
204548523 id

functions: calss Monom
Monom init_from_string -Define string with non-capital letter. define two variables. if the string is empty return error message.
	 * Define index = x and index = minus and index = power.
	 * if x = -1 return a to equals number of find in string.
	 * else if x=0 or minus=0 and x=1 , so if x=0 number a=1 if minus=0 number a=-1 ,and b= 1.
	 * if p existent so b=the rest of the string, else a=(still x) and b = all other.
	 * @param s - get monom in strin
 Monom (STRING)-	 * create a new monom according to string and get it in to the original monom.
Monom f(0x)-	 * The function return the y value if the power is not negative.
dreivative -/** Monom derivative - if power is 0 return 0, else do power * monom coefficient and -1 from monom power.
	 * original monom after a derived method.
   add- 	 * addition between two monom. if powers of the monoms is equal sum the monoms coefficients.
multiply-	 * multiply between two monoms and sum the powers.
equals - comparison between two monoms - if the monom is not empty and the coefficients are equal
	 and the powers are equals as well so the monoms are equal. 


class Polynom - f(x) - * Finding the function result when y=f(x). 
	 *define monoms iterator. if we did not pass the last value, define monom which will be the next value and p will be the sum 
	 of monoms in the polynom.
 add-ddition all the arrays monoms of polynomial to one polynomial. 
	 * add to the original polynom the all monoms in p1.
   add monom -addition between monoms with equal power from arrays monoms and sort in array.
	 * define boolean = false. define monoms iterator. if we did not pass the last value, define monom which will be the next value.
	 *if the powers of the two monoms m1 and m2 are equals, do sum between the monoms and define boolean= true. 
	 * if the coefficent = 0 remove the value.
	 * if the boolean value is negative and the power of monom >=0 and coefficent != 0 do: add monom m1 original polynom.
	 * sort polynom.
   substruct - subtraction all the arrays monoms of polynomial to one polynomial.
	 * subtract from the original polynom the all monoms of p1.
   substruct monom -subtraction between monoms with equal power from arrays monoms and sort in array.
	 *  * define boolean = false. define monoms iterator. if we did not pass the last value, define monom which will be the next value.
	 *if the powers of the two monoms m1 and m2 are equals, do subtract between the monoms and define boolean= true. 
	 * if the coefficent = 0 remove the value.
	 * if the boolean value is negative and the power of monom >=0, so define two monoms, first copy monom and second defult monom.
	 * do subtract between the monoms, copy place memory. and if coefficent != 0 do: add monom m1 original polynom.
	 * sort polynom.
   multiply -	 * Multiply between two polynomials.
multiply monom-
	 * Private function that multiplies a the monom in monom.
	 * if the coefficient equals zero, so clear original polynom.
	 * else define monoms iterator. if we did not pass the last value, define monom which will be the next value
	 end multiply monom in monom. 
   equal-sequals between two polynomials. 
	 * define index size of count the amount of the monom in iterator.
	 * define boolean = false. if size of original polynom equal size from iterator, so define two iterators.
	 * first itertor for original polynom and second p1.
	 * if we did not pass the last value in original polynom, define monoms m1 and m2 which will be the next value
	 * if m1 and m2 not equals, so return false.
   size- 	 * size polynom
   isZero- 	 * Checking if the polynomial equal to zero.
   root - root - https://en.wikipedia.org/wiki/Bisection_method
	 * define two indexes y0 and y1 - first result of f(x0) and second result of f(x1).
	 * if y0*y1>0 , so no continuous function.
	 * define two index absX and absY. if one from two indexes > eps, so define two index middleX and middleY.
	 * if y0*middleY or y1middleY < 0, so continuous function.
   copy -	 * create a deep copy of this Polynomial.
   derivative -	 * Compute a new Polynom which is the derivative of this Polynom
   area -
	 * Compute Riemann's Integral over this Polynom starting from x0, till x1 using eps size steps,
	 * see: https://en.wikipedia.org/wiki/Riemann_integral
	 * see: https://www.youtube.com/watch?v=nwvJWYqMoyk
	 * define n = number of rectangles.
	 * for(i=1->n), define xi any point, if f(xi)<0 , so no calculate the area.




 the gral is additioanl jar file to represnt fronted reslat of the graph







