package Revision._02_ConditionalStatements;
//Q35. In a company, worker efficiency is determined on the basis of the time required for a
// worker to complete a particular job. If the time taken by the worker is between 2 – 3
// hours, then the worker is said to be highly efficient. If the time required by the worker is
// between 3 – 4 hours, then the worker is ordered to improve speed. If the time taken is
// between 4 – 5 hours, the worker is given training to improve his speed, and if the time
// taken by the worker is more than 5 hours, then the worker has to leave the company. If the
// time taken by the worker is input through the keyboard, find the efficiency of the worker.

public class Q35_WorkerEfficiency 
{
    public static void main(String[] args)
    {
        //let the time required for a worker to complete a particular job be 
        //represented by 'T'
        
        int T;
        T=3;
        
        if(T>=2 && T<=3)
        {
            System.out.println("Worker is Highly Efficient");
        }
        
        else if(T>=3 && T<=4)
        {
            System.out.println("Worker should improve speed");
        }
        
        else if(T>=4 && T<=5)
        {
            System.out.println("Worker will be given training to improve the training");
        }
        
        else if(T>5)
        {
            System.out.println("Worker has to leave the company");
        }
        
    }
}