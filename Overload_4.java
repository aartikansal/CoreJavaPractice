
/*
Three methods and a minimum
*/

public class Overload_4 {
    public static void main(String[] args) {

    }
    public static  int min(int a,int b){
       if(a>b){
           return b;
       }
       else {
           return a;
       }
    }
    public static long min(long z, long u){
      if(z>u){
          return u;
      }
      else {
          return z;
      }
    }
    public static double min(double x, double y){
     if(x>y)
     {
         return y;
     }
     else {
         return x;
     }
    }
}
