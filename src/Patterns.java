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
        for ( int i = 0; i <= a; i++) {
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
        for ( int i = 0; i <= a; i++) {
            for ( int j = 0; j < i; j++) {
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
        for ( int i = 0; i <= a; i++) {
            for ( int j = 0; j < i; j++) {
                System.out.print(i);
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
     
    public static void Pattern7(int a){
        /*    *
             ***
            *****
           *******  */
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < a-i-1; j++) {
                System.out.print(" ");
            }
            for ( int k = 0; k <= 2*i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void Pattern8(int a){
        /* *******
            *****
             ***
              *   */
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for ( int k = 2*(a-i) - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void Pattern9(int a){
        /*    *
             ***
            *****
           *******
           *******
            *****
             ***
              *   */
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < a-i-1; j++) {
                System.out.print(" ");
            }
            for ( int k = 0; k <= 2*i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for ( int k = 2*(a-i) - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void Pattern10(int a){
        /*   *
             **
             ***
             ****
             ***
             **
             *  */
          
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for ( int k = a; k > 0; k--) {
            for ( int l = 0; l < k; l++) {
            System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void Pattern11(int a){
        /*   1
             01
             101
             0101 */
          
        int b = 1;
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j <= i; j++) {
                System.out.print(b);
                int c = b-1;
                b = Math.abs(c);
            }
            System.out.print("\n");
        }
    }

        public static void Pattern12(int a){
        /*   1       1
             12     21
             123   321
             123443321 */
          
      for ( int i = 0; i < a; i++) {
          int b = 1;
          for ( int j = 0; j <= i; j++) {
              System.out.print(b);
              b = b + 1;
          }
          for ( int k = 2*(a-i) - 2; k > 0; k--) {
              System.out.print(" ");
          }
          int c = i + 1;
            for ( int j = 0; j <= i; j++) {
                System.out.print(c);
                c = c - 1;
            }
          System.out.print("\n");
      }
    }

    public static void Pattern13(int a){
        /*   1       
             23     
             456   
             78910 */
        
      int b = 1;
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < i; j++){
                System.out.print(b + " ");
                b = b+1;
            }
            System.out.print("\n");
        }
    }

    public static void Pattern14(int a){
        /*   A       
             AB     
             ABC   
             ABCD */
        
        for ( int i = 0; i < a; i++) {
            char b = 'A';
            for ( int j = 0; j < i; j++){
                System.out.print(b + " ");
                b++;
            }
            System.out.print("\n");
        }
    }

        public static void Pattern15(int a){
        /*   ABCD     
             ABC     
             AB   
             A */
        
      for ( int i = a; i > 0; i--) {
          char b = 'A';
          for ( int j = 0; j < i; j++){
              System.out.print(b + " ");
              b++;
          }
          System.out.print("\n");
      }
    }

        public static void Pattern16(int a){
        /*   A     
             BB     
             CCC   
             DDDD */
        
        char b = 'A';
        for ( int i = 0; i < a; i++) {
            
            for ( int j = 0; j <= i; j++){
                System.out.print(b + " ");
            }
            System.out.print("\n");
            b++;
        }
    }

        public static void Pattern17(int a){
        /*   A     
             BB     
             CCC   
             DDDD */
        
        char b = 'A';
        for ( int i = 0; i < a; i++) {
            
            for ( int j = 0; j <= i; j++){
                System.out.print(b + " ");
            }
            System.out.print("\n");
            b++;
        }
    }

        public static void Pattern18(int a){
        /*    A
             ABA
            ABCBA
           ABCDBCA  */
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < a-i-1; j++) {
                System.out.print(" ");
            }
            char b = 'A';
            for ( int k = 0; k < i){
               System.out.print(b);
               b++;
            }
            char d = b + I;
            for ( int l = 0; l < i ) {
               System.out.print(c);
               c--;
            }
            System.out.print("\n");
        }
    }
}

