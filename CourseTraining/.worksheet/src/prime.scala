object prime {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
    def isPrime(n:Int): Boolean = (2 until n) forall (d => n % d !=0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(20); val res$0 = 
    
    isPrime(8);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(15); val res$1 = 
    isPrime(7);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(16); val res$2 = 
    isPrime(97);System.out.println("""res2: Boolean = """ + $show(res$2))}
}