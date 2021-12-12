import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service.reverse("hadil "));
            System.out.println(service.minchar("hadil "));
            System.out.println(service.casechanger("HaDil "));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
