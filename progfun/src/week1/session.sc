object session {
  1 + 3;                                          //> res0: Int(4) = 4
  def abs(x: Double) = if( x < 0) -x else x       //> abs: (x: Double)Double
  def sqrtIter(guess: Double, x: Double):Double =
  	if (isGoodEnough(guess, x)) guess
  	else sqrtIter(improve(guess, x), x)       //> sqrtIter: (guess: Double, x: Double)Double
  	
  def isGoodEnough(guess: Double, x: Double) =
  	abs(guess * guess - x) < 0.001            //> isGoodEnough: (guess: Double, x: Double)Boolean
  		
  def improve(guess: Double, x: Double) =
  	(guess + x / guess) / 2                   //> improve: (guess: Double, x: Double)Double
  	
  def sqrt(x: Double) = sqrtIter(1.0, x)          //> sqrt: (x: Double)Double
  
  sqrt(2)                                         //> res1: Double = 1.4142156862745097
  sqrt(4)                                         //> res2: Double = 2.0000000929222947
}