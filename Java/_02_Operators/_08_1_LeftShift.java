public class _08_1_LeftShift 
{
    public static void main(String[] args) {
        
        int p=3;

        int q=p<<1; //6...3*2^1
        int r=p<<2; //12..3*2^2
        int s=p<<3; //24..3*2^3
        int w=p<<5; //....3*2^5
        int l=p<<30;  //-ve why?..next file     
        int m=p<<32;  //3 why  32 bit shift krne ke baad repeat kyo horha? ans copy page no.25
        int n=p<<33;  //6 why
    
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
        System.out.println(w);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
    }    
}
