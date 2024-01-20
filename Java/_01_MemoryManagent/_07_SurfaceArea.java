public class _07_SurfaceArea 
{

    static int Surface_Area_of_Cube(int e)  
    {
        int ans=6*e*e;
        return ans;
    }

    static int Surface_Area_of_Cuboid(int l,int b,int h)
    {
        int ans=2*(l*b+b*h+h*l);
        return ans;
    }

    static float Surface_Area_of_Cylinder(int r,int h)
    {
        float pi=3.14f;
        float ans=2*pi*r*(r+h);
        return ans;
    }

    public static void main(String[] args) 
    {
        int e=3,r=5,l=2,b=4,h=6;

        int A=Surface_Area_of_Cube(e);        
        System.out.println("The Surface Area of Cube is = " + A + " m^2.");

        int B=Surface_Area_of_Cuboid(l,b,h);                                     //method ki return value variable mein store krrhe aur fir uss variable ko print krarhe 
        System.out.println("The Surface Area of Cuboid is = " + B + " m^2.");    //#Another way down(direct method ko call krke uski return value print krarhe)

        System.out.println("The Surface Area of Cylinder is = " + Surface_Area_of_Cylinder(r,h) + " m^2.");
    
    }
}

