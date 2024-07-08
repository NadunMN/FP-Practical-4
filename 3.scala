object Main{

    def toUpper(name: String): String ={
        name.toUpperCase
    }

    def toLower(name: String): String ={
        name.toLowerCase
    }

    def formatNames(name: String, stratIndex: Int, endIndex: Int): String= {
        val str = name.substring(stratIndex, endIndex);
        str
    }

    def main(args: Array[String]): Unit= {
        println(toUpper("benny"))
        val sub1 = formatNames("Niroshan", 0, 2)
        val sub12 = formatNames("Niroshan", 2,8)
        val sub2 = toUpper(sub1)
        println(sub2+ sub12)
        println(toLower("Saman"))

        val sub4 = formatNames("kumara", 0,1);
        val sub5 = formatNames("kumara", 1,5);
        val sub6 = formatNames("kumara", 5,6)
        val up1= toUpper(sub4);
        val up2= toUpper(sub6);
        println(up1+sub5+up2)


    }
}