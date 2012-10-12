import week4._

object nth {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 
	def singleton[T](elem:T) = new Cons[T](elem, new Nil[T]);System.out.println("""singleton: [T](elem: T)week4.Cons[T]""");$skip(163); 
	
	def nth[T](n:Int,xs: List[T]): T =
	  if ( xs.isEmpty) throw new IndexOutOfBoundsException("xs.isEmpty")
		else if ( n == 0) xs.head
		else nth(n - 1, xs.tail);System.out.println("""nth: [T](n: Int, xs: week4.List[T])T""");$skip(43); 
	
	   
	val a = singleton(3, singleton(5));System.out.println("""a  : week4.Cons[(Int, week4.Cons[Int])] = """ + $show(a ));$skip(13); val res$0 = 
	
	nth(0, a);System.out.println("""res0: (Int, week4.Cons[Int]) = """ + $show(res$0))}
}