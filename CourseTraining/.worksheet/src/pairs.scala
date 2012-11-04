object pairs {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(26); 
 	val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(71); 
 	
 	def isPrime(n:Int): Boolean = (2 until n) forall (d => n % d !=0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(149); 
 	
 	def calculatePrime(n:Int) =
 		(1 until n) flatMap ( i =>
 			(1 until i) map (j => (i,j))) filter ( pair =>
 				(isPrime(pair._1 + pair._2)));System.out.println("""calculatePrime: (n: Int)scala.collection.immutable.IndexedSeq[(Int, Int)]""");$skip(25); val res$0 = 
   
   calculatePrime(7);System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(137); 
            
            
  def scalarProduct(xs: List[Double], ys: List[Double]) : Double = (for ( (x,y) <- xs zip ys) yield x * y).sum;System.out.println("""scalarProduct: (xs: List[Double], ys: List[Double])Double""");$skip(48); val res$1 = 
  
  
  scalarProduct(List(2,3,4), List(2,1,3));System.out.println("""res1: Double = """ + $show(res$1))}
}