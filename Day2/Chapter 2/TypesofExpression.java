public class TypesofExpression {
    public static void main(String[] args) {
        /*
         * byte+short -> int
         * short+int -> int
         * float+long -> float
         * char+int ->int
         * long+double ->double
         * 
         * these are known as resulting expression.
         */
        int a  = 45;
        int b = 89;
        float f = 45.6f+a;
        System.out.println(f);
    }
}
