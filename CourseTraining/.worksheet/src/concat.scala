object concat {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(99); 
  
  def concat[T](xs:List[T], ys:List[T]): List[T] =
  	(xs foldRight ys) (_ :: _);System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(26); 
  	
  val a = List(2,3,1);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(20); 
  val b = List(6,3);System.out.println("""b  : List[Int] = """ + $show(b ));$skip(17); val res$0 = 
  
  concat(a,b);System.out.println("""res0: List[Int] = """ + $show(res$0))}
}