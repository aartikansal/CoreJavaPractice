
  /*
Hey, are you alive?

*/

  public class Person_isAlive {
      public static void main(String[] args) throws Exception {
      }

      public interface Person {
          boolean isAlive();


      }

      public interface Presentable extends Person {
          @Override
          default boolean isAlive() {
              {
                  if (isAlive()) {
                      return true;
                  } else {
                      return false;
                  }
              }
          }
      }
  }






