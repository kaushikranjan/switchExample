package switchDemo

import org.apache.spark.rdd.RDD

object switchOne {

  /**
   * On receiving any RDD of vector, it's supposed to perform a match
   */
  def catchFunction[A] (args : RDD[Vector[A]]) : Unit = {
		  args match {
		    /**
		     * Fails to authenticate.
		     * 
		     * Prints "Int" irrespective of whatever data is send to the function
		     */
		  case _: RDD[Vector[Int]] => println("Int")
		  case _: RDD[Vector[Float]] => println("Float")
		  }
  }
}
