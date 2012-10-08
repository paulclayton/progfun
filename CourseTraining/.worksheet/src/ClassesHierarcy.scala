object ClassesHierarcy {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
	val t1 = new NonEmpty(3, new Empty, new Empty);System.out.println("""t1  : NonEmpty = """ + $show(t1 ));$skip(21); 
	val t2 =  t1 incl 4;System.out.println("""t2  : IntSet = """ + $show(t2 ));$skip(21); 
  val t3 = t1 incl 1;System.out.println("""t3  : IntSet = """ + $show(t3 ));$skip(23); 
  val u = t1  union t2;System.out.println("""u  : IntSet = """ + $show(u ));$skip(22); 
  
  
  val n1 = null;System.out.println("""n1  : Null = """ + $show(n1 ));$skip(23); 
  val n2:String = null;System.out.println("""n2  : String = """ + $show(n2 ));$skip(25); val res$0 = 

  if(true) 1 else false;System.out.println("""res0: AnyVal = """ + $show(res$0))}
}

abstract class IntSet {
	def incl(x:Int) : IntSet
	def contains(x: Int): Boolean
	def union(other: IntSet): IntSet
}


class Empty extends IntSet {
	def incl(x:Int) : IntSet = new NonEmpty(x, new Empty, new Empty)
	def contains(x:Int): Boolean  = false
	def union(other: IntSet): IntSet = other
	
  override def toString = "."
}


class NonEmpty(elem:Int, left:IntSet, right:IntSet) extends IntSet {
	def incl(x:Int) : IntSet = {
		if ( x < elem) new NonEmpty( elem, left incl x, right)
		else if ( x > elem)  new NonEmpty( elem, left, right incl x)
		else this
	}
	
	def contains(x:Int): Boolean  = {
		if ( x  < elem )  left contains x
		else if ( x > elem) right contains x
		else true
	}
	
	def union(other:IntSet): IntSet = (( left union right) union other) incl elem
	
	override def toString = "{" + left + " "+ elem + " " + right + "}"
}