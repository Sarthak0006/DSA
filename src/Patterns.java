public class Patterns {

    public static void Greet() {
        System.out.println("RAM RAM JI");
    }

    public static void Pattern1(int a){
        /* ****
           ****
           ****
           **** */
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

     public static void Pattern2(int a){
        /* *
           **
           ***
           **** */
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

     public static void Pattern3(int a){
        /* 1
           12
           123
           1234 */
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < a; j++) {
                System.out.print(j+1);
            }
            System.out.print("\n");
        }
    }

      public static void Pattern4(int a){
        /* 1
           22
           333
           4444 */
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < a; j++) {
                System.out.print(i+1);
            }
            System.out.print("\n");
        }
    }

      public static void Pattern5(int a){
        /* ****
           ***
           **
           *  */
        for ( int i = a; i > 0 ; i--) {
            for ( int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

      public static void Pattern6(int a){
        /* 1234
           123
           12
           1 */
        for ( int i = a; i > 0; i--) {
            for ( int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.print("\n");
        }
    }
     
      public static void Pattern6(int a){
        /* ****
           ****
           ****
           **** */
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

