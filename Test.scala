import scala.collection.mutable.ArrayBuffer
import scala.math._
import scala.util.Random
import DoubleUtils._

object Test
{
    def main(args: Array[String]): Unit = 
    {
        /*val length = 10
        var a: Vector = new Vector(length)
        for (i <- 0 until length)
        {
            a.setElement(i, 2*i + 1)
        }
        println("a = " + a)
        val b: Vector = new Vector(length)
        for (i <- 0 until length)
        {
            b.setElement(i, 3*i + 1)
        }
        println("b = " + b)
        println("a + b = " + (a + b))
        println("a-b = " + (a - b))
        println("a*b = " + a*b)
        println("a*2 = " + a*2)
        println("2*a = " + (2*a))*/
        /*implicit class StringImprovements(s: String)
        {
            def increment = s.map(c => (c+1).toChar)
        }
        println("String".increment)*/
        var random: Random = new Random()
        var matrix: ArrayBuffer[ArrayBuffer[Double]] = new ArrayBuffer[ArrayBuffer[Double]]()
        var dimension: Int = 4
        var row: Int = dimension
        var col: Int = dimension
        for (i <- 0 to row - 1)
        {
            var list: ArrayBuffer[Double] = new ArrayBuffer[Double]()
            for (j <- 0 to col - 1)
            {
                list.append(random.nextInt(dimension))
            }
            matrix.append(list)
        }
        var myMatrix:Matrix = new Matrix(matrix)
        myMatrix = myMatrix.product(myMatrix.transpose())
        println(myMatrix)
        var A = myMatrix
        var B = myMatrix
        println("A = ")
        println(A)
        println("B = ")
        println(B)
        println("A + B = ")
        println(A + B)
        println("A * B = ")
        println(A*B)
        println("A - B = ")
        println(A - B)
        println("A^T * B = ")
        println(A.transpose() * B)
        println("2*A = ")
        println(2*A)
        println("A*2 = ")
        println(A*2)
        /*var Q: Matrix = new Matrix(dimension, dimension)
        var R: Matrix = new Matrix(dimension, dimension)
        var result = myMatrix.QRDecomposition()
        Q = result._1
        R = result._2
        println("Q * Q^T: ")
        println(Q.product(Q.transpose()))
        println("R: ")
        println(R)
        println("Q*R: ")
        println(Q.product(R))
        println("Error: ")
        println((myMatrix.subtract(Q.product(R))).norm())*/
        /*var inverse = myMatrix.inverse()
        println("Inverse: ")
        println(inverse)
        println("Inverse * matrix: ")
        println(inverse.product(myMatrix))*/
        /*var (e, o) = myMatrix.eigensystem()
        println("o^T * myMatrix * o = ")
        println(o.transpose().product(myMatrix).product(o))
        println("eigenvalues = ")
        println(e)
        println("Trace = " + myMatrix.trace())
        println(e.sum())*/

    }
}
