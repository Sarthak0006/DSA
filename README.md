Recursion: 

1. Print numbers from 1 to N:
class Main {
    public static void main(String[] args) {
        Print(1);
    }
    
    static void Print(int n){
        if ( n < 6) {
            System.out.println(n);
            Print(++n);
        }
    }
}
