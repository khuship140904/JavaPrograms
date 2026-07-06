 /* non static method call */
 
 public class method2 {
        int sum(int a,int b)
        {
        System.out.println(a+b);
        return a+b;
    }
        public static void main(String[] args) {
           method2 g=new method2();
           g.sum(46758,878888);
        }
}
