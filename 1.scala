object Main {
  def printUserFriendly(array1: Array[String], array2: Array[Int]): Unit = {
    println("Fruits:Quantity")
    for (i <- array1.indices) {
      println(s"${array1(i)}: ${array2(i)}")
    }
  }

  def restockItem(array1: Array[String], array2: Array[Int], name: String, item: Int): Unit = {
    if (array1.contains(name)) {
      val index = array1.indexOf(name)
      array2(index) += item
      println(s"Updated $name quantity to ${array2(index)}")
    } else {
      println(s"The array does not contain $name fruit")
    }
  }

  def sellItem(array1: Array[String], array2: Array[Int], name: String, item: Int): Unit = {
    if (array1.contains(name)) {
      val index = array1.indexOf(name)
        if(item <= array2(index)){
          array2(index) -=item
          println(s"Updated $name quantity to ${array2(index)}")
        }else{
          println(s"The array does not enough $name fruit")
        }
    } else {
      println(s"The array does not contain $name fruit")
    }
  }


  def main(args: Array[String]): Unit = {
    val array1 = Array("Apple", "Banana", "Pineapple", "Orange", "Mango")
    val array2 = Array(58, 23, 45, 12, 43)
    printUserFriendly(array1, array2)
    restockItem(array1, array2, "Apple", 20)
    printUserFriendly(array1, array2)
    sellItem(array1, array2, "Orange", 8)
    printUserFriendly(array1, array2)
  }
}
