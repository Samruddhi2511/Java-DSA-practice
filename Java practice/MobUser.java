class MobUser
{
    public static void main(String args[])
    {
        Mob oppo=new Mob();
        oppo.insertSim(new Jio());

    }
}
class Mob
{
     void insertSim(Sim a)
     {
        a.calling();
        a.sms();
     }
}
interface Sim
{
    void calling();
    void sms();
}
class Jio implements Sim
{
    public void calling(){ System.out.println("JIO calling");}
    public void sms(){System.out.println("JIO sms");}
}
class Airtel implements Sim
{
    public void calling(){System.out.println("Airtel calling");}
    public void sms(){System.out.println("Airtel sms");}
}
class Idea implements Sim
{
    public void calling(){System.out.println("Idea calling");}
    public void sms(){System.out.println("Idea sms");}
}