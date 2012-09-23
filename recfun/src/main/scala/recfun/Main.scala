package recfun
import common._
import scala.util._
import scala.collection.mutable._
import scala.collection.generic.SeqFactory

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    def findAbove(currentRow: Int, currentColumn: Int): Int = {
      if (currentColumn == 0 || currentRow == 0 || currentColumn == currentRow) return  1
      return findAbove(currentRow - 1, currentColumn - 1) + findAbove(currentRow - 1, currentColumn)
    }

    var result:Int = 1
    
    if (r > 0 && c > 0) {
      if (c == r) result = 1
      else result = findAbove(r - 1, c - 1) + findAbove(r - 1, c)
    }
    
    result
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    var result = false

    if (!chars.isEmpty) {
      var numberOfP = 0
      chars.foreach((c: Char) => {
        if (c == '(' && numberOfP >= 0) numberOfP += 1
        if (c == ')') numberOfP -= 1
      })

      result = (numberOfP == 0)
    }

    result
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    var result: Int = 0
    if (coins.isEmpty) result

    def findDivider(number: Int, t: Int, x: Int,elements :LinkedList[Int]): Int = {
      var ret: Int = 0

      println("x:" + x + " number:" + number + " t:" + t + " elements:"+ elements)
      if (number <= 0) ret;
      else {

        coins.foreach((c: Int) => {
          var temp = number - c
          println(">>>> x:" + x + " number:" + number + " c:" + c)

          if (temp == 0) {
            //insertInto(elements, c)
            
            result += 1
          } else if (temp > 0) {
            var xtemp = x + 1
            findDivider(temp, c, xtemp, elements)
          }
        })
      }

      ret
    }

    
    coins.foreach((c: Int) => {
      var temp = (money - c);
      findDivider(temp, c, 1, new LinkedList)
    })

    println("result:" + result)

    result
  }

}
