object nqueend {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(556); 
  def queens(n:Int): Set[List[Int]] = {
  
  	def isSafe(col:Int, queens:List[Int]): Boolean = {
  		val row =  queens.length
  	  val queendWithRow = (row -1  to 0 by -1 ) zip queens
  	  
  	  queendWithRow  forall {
  	  	case (r,c) =>  col != c && math.abs(col -c) != row -r
  	  }
  	}
  
  	def placeQuuens(k:Int) : Set[List[Int]] = {
  		if ( k == 0) Set(List())
  		else
  			for {
  				quuens <- placeQuuens(k-1)
  				col    <- 0 until n
  				if  isSafe(col,quuens)
  			} yield col :: quuens
  	}
  	
  	
  	placeQuuens(n)
  };System.out.println("""queens: (n: Int)Set[List[Int]]""");$skip(183); 
  
  
  def show(q:List[Int]) = {
  	val lines =
  		for ( col <- q.reverse)
  		yield Vector.fill(q.length)(" * ").updated (col, " X ").mkString
  	"\n\n"+ (lines mkString "\n")
  };System.out.println("""show: (q: List[Int])java.lang.String""");$skip(32); val res$0 = 
 
  queens(8) take 3 map (show);System.out.println("""res0: scala.collection.immutable.Set[java.lang.String] = """ + $show(res$0))}
}