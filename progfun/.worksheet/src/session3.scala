object session3 {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  def abs(x:Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(341); 

	def sqrt(x: Double) = {
	
		def sqrtIter(guess: Double, x: Double): Double =
   		if (isGoodEnough(guess, x)) guess
   		else sqrtIter(improve(guess, x), x)

		def isGoodEnough(guess: Double, x: Double) =
			abs(guess * guess - x) / x < 0.001

		def improve(guess: Double, x: Double) =
   		(guess + x / guess) / 2

			sqrtIter(1.0, x)
	};System.out.println("""sqrt: (x: Double)Double""");$skip(13); val res$0 = 
	
	
	sqrt(6);System.out.println("""res0: Double = """ + $show(res$0));$skip(15); val res$1 = 
	sqrt(0.1e-20);System.out.println("""res1: Double = """ + $show(res$1))}
}