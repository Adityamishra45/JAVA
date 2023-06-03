public class associativity {
    //precedence:- it defines which mathematical symbol has the high priority. * has a highr priority than + , * has a same valua as /;
    //associativity:-  Means it will tell that what if both operators have same priority then it will execute in which direction. for ex:- for * and / it goes from left to right.
    public static void main(String[] args) {
        
        int a = 6*5-34/2; //Precedence
        /*
        highest precedence goes to * and /.
        = 30-34/2
        = 30-17
        = 13
        */  


        int b = 60/5-34*2; //associativity

        /*
         12-68
         -56
         */
        System.out.println(a);
    }
}
