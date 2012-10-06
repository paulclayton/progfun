object rationals {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(237); 
/*
  val x = new Rational(1,2)
  x.number
 
  
  val z = x.add (new Rational(2,3) )
  z.number
  z.denom
  
  val y = z + new Rational(2,4)
  val yy = y - new Rational(2,4)

  yy.neg
  
  */
  val x = new Rational(1,3);System.out.println("""x  : Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : Rational = """ + $show(z ));$skip(23); 
  
  val t = x - y - z;System.out.println("""t  : Rational = """ + $show(t ));$skip(8); val res$0 = 
  y + y;System.out.println("""res0: Rational = """ + $show(res$0));$skip(11); val res$1 = 
  
  x < y;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(8); val res$2 = 
  y < x;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(13); val res$3 = 
  
  x max y;System.out.println("""res3: Rational = """ + $show(res$3));$skip(10); val res$4 = 
  y max z;System.out.println("""res4: Rational = """ + $show(res$4));$skip(10); val res$5 = 
  z max x;System.out.println("""res5: Rational = """ + $show(res$5));$skip(19); val res$6 = 
 
 new Rational(3);System.out.println("""res6: Rational = """ + $show(res$6))}
}

class Rational(x:Int, y:Int){
   require(y != 0, "denom must not equal zero")

  private def gcd(a:Int, b:Int):Int = if ( b == 0) a else gcd(b, a % b)
  
  def this(x:Int) = this(x,1)
	
	def number = x / gcd(x,y)
	def denom = y / gcd(x,y)
	
	def < (that:Rational) = number * that.denom < that.number * denom
	
	def max(that:Rational) = if ( this <  that) that else this
	
	def unary_- : Rational = new Rational(-1 * number, denom)
	
	
	// def add(s:Rational):Rational =  new Rational(number * s.denom + s.number* denom, denom * s.denom)
	def + (s:Rational):Rational = new Rational(number * s.denom + s.number* denom, denom * s.denom)
	
	// def sub(s:Rational): Rational = add(s.neg)
	def - (that:Rational):Rational = this + -that
	
	override def toString = number + "/" + denom
	
}