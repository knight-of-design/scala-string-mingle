object Solution {

    def main(args: Array[String]) {
       val p = io.StdIn.readLine()
       val q = io.StdIn.readLine()
       (p,q).zipped.foreach((a,b)=>print(""+a+b))
    }
    
}
