object Traits {
  println("Welcome to the Scala worksheet")
}

trait Planar {
	def height: Int
	def width: Int
	def surface:Int = height * width
}

class Shape {
	
}

class Square extends Shape with Planar {

}