


public class rectangle {
    double a,b;
     rectangle(double length, double width)
    {
        a=length;
        b=width;
    }

    String check()
    {
        if(a==b)
        {
           return "Square";
        }
        else 
        {
           return "Not square";
        }
    }
     
}
