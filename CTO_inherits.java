




/*
Parent of the CTO class

*/


    public  class CTO_inherits {
        public static void main(String[] args) {
            CTO cto = new CTO();
            System.out.println(cto);
        }

        public static class CCO {
            public void workHard() {
            }
        }
            public static interface Businessman {
                public void workHard();

            }

            public static class CTO extends CCO implements Businessman {


                }
            }
        








//abstract static public class h{
//        abstract public void workHard();
//    }
//    public static interface Businessman {
//        public void workHard();
//    }
//
//    public static class CTO extends h implements Businessman {
//         public void workHard(){}
//    }
//}