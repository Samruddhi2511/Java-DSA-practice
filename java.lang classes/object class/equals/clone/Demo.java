class Demo implements Cloneable
{
    int a,b;
    Demo(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public static void main(String args[]) throws CloneNotSupportedException
    {
        Demo d1=new Demo(10,20);
        Demo d2=(Demo)d1.clone();     //clone() creates identical copy of object
        System.out.println(d1==d2); 
        System.out.println(d1.a);
        //System.out.println(d1.b);
        System.out.println(d1.a=50);
        //System.out.println(d1.b=40);  
        System.out.println(d1.a);

        System.out.println(d1.equals(d2));  //only one obj created only one new hence true

    }
}
