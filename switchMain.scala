package switchDemo
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.rdd.RDD


object switchMain {

  /**
   * Main function to send RDD of vectors to the authenticating function in another class
   */
  
  def main(args: Array[String]): Unit = {
    val sc = new SparkContext("local", "switchFunction")
    val x_Int = Vector(1,2,3)
    val x_Float = Vector(1.0,2.0,3.0)
    
    val c_Int = sc.parallelize(Vector[Vector[Int]](x_Int))
    val c_Float = sc.parallelize(Vector[Vector[Double]](x_Float))
    
    /**
     * catchFunction is the authenticating function
     */
    switchOne.catchFunction(c_Float)
    
  }

}
