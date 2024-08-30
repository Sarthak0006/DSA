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
}

