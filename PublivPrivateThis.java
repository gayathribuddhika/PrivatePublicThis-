
package publivprivatethis;


public class PublivPrivateThis {

    
    public static void main(String[] args) {
        SubThis time = new SubThis();
        System.out.println(time.display());
        System.out.println(time.regTime());
        
        time.setTime(15, 46, 33);
        System.out.println(time.display());
        System.out.println(time.regTime());
        
    }
    
}
