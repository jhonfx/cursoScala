object TestOne {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(27); 
	val x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(31); 
  def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(14); val res$0 = 
  increase(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(44); 
  println("Welcome to the Scala worksheet")}
}