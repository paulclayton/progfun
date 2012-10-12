object Traits {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet")}
}

trait Planar {
	def height: Int
	def width: Int
	def surface:Int = height * width
}