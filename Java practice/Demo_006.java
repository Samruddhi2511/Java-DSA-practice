class Demo_006
{
    public static void main(String args[])
    {
        Integer iobj=new Integer("");
        String s1=iobj.toString();

        System.out.println(s1);
        
    }

    @Override
    public String toString() {
        return "Demo_006 []";
    }
}