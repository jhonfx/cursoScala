object session2 {
  def abs(x:Double) = if (x < 0) -x else x        //> abs: (x: Double)Double

	def sqrtIter(guess: Double, x: Double): Double =
   	if (isGoodEnough(guess, x)) guess
   	else sqrtIter(improve(guess, x), x)       //> sqrtIter: (guess: Double, x: Double)Double

	def isGoodEnough(guess: Double, x: Double) =
		abs(guess * guess - x) / x < 0.001;
                                                  //> isGoodEnough: (guess: Double, x: Double)Boolean

	def improve(guess: Double, x: Double) =
   	(guess + x / guess) / 2                   //> improve: (guess: Double, x: Double)Double

	def sqrt(x: Double) = sqrtIter(1.0, x)    //> sqrt: (x: Double)Double
	
	sqrt(6)                                   //> res0: Double = 2.4494943716069653
	sqrt(0.1e-20)                             //> res1: Double = 3.1633394544890125E-11
}