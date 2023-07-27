

public class LogicalOperators {

    public static void main(String[] args) {
        // and &&
        // left side | right side = result
        //      T    |     T      =   T
        //      T    |     F      =   F
        //      F    |     T      =   F
        //      F    |     F      =   F
        System.out.println(56 < 90 && 676 <= 78 );
        
        // or ||
        // left side | right side = result
        //      T    |     T      =   T
        //      T    |     F      =   T
        //      F    |     T      =   T
        //      F    |     F      =   F
        System.out.println(56 < 90 || 676 <= 78 );

        // not !
        System.out.println(45 != 78 );
    }
}
