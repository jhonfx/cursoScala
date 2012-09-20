object session {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(25); val res$0 = 
  1 + 3;System.out.println("""res0: Int(4) = """ + $show(res$0));$skip(44); ;
  def abs(x: Double) = if( x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(126); 
  def sqrtIter(guess: Double, x: Double):Double =
  	if (isGoodEnough(guess, x)) guess
  	else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(85); 
  	
  def isGoodEnough(guess: Double, x: Double) =
  	abs(guess * guess - x) < 0.001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(74); 
  		
  def improve(guess: Double, x: Double) =
  	(guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(45); 
  	
  def sqrt(x: Double) = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(13); val res$1 = 
  
  sqrt(2);System.out.println("""res1: Double = """ + $show(res$1));$skip(10); val res$2 = 
  sqrt(4);System.out.println("""res2: Double = """ + $show(res$2))}
}