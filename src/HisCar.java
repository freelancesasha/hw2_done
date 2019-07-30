public class HisCar implements CarInterface {

    // при имплементации метод может біть или паблик или абстракт
    public void gas ()
    {System.out.println("gas implements");
    }

    public void brake ()
    {System.out.println("brake implements");
    }
    public void descriotion()
    {System.out.println("description implements");
    }
     public static void main (String[] args)
     {
         HisCar train = new HisCar();
         train.gas();
         train.brake();
         train.descriotion();
     }
}
