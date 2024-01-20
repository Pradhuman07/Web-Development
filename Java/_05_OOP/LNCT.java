public class LNCT 
{
    class LNCTM
    {
        class cse
        {
            
        }
    }

    class LNCTS
    {
        class mechanical
        {

        }
    }

    class LNCTE
    {
        class electrical
        {

        }
    }

    public static void main(String[] args) 
    {
        LNCT var = new LNCT();

        LNCTM varM = var.new LNCTM();
        LNCTM.cse varcse = varM.new cse();

        LNCTS varS = var.new LNCTS();
        LNCTS.mechanical varmech = varS.new mechanical();

        LNCTE varE = var.new LNCTE();
        varE.new electrical();

                /****/

        JNCT gar = new JNCT();

        JNCT.JNCTM jarM = gar.new JNCTM();
        JNCT.JNCTM.cse gog = jarM.new cse();


    }
}



class JNCT
{
    class JNCTM
    {
        class cse
        {

        }
    }

    class JNCTS
    {
        class mechanical
        {

        }
    }

    class JNCTE
    {
        class electrical
        {

        }
    }
}