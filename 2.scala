import scala.io.StdIn
object Main{
    
    def patternMatching(num: Int): String = {
        num match
            case num if num <=0 => "Negative/zero"
            case num if num%2 == 0 => "Even Number"
            case _ => "Odd Number"
        
    }

    def main(args: Array[String]): Unit = {
        print("Enter nuber: ")
        print(patternMatching(StdIn.readInt()))

    }
}