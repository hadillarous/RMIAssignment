import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Locale;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}
    String chi="";
    public String reverse (String ch) {
        for (int i = 0; i < ch.length(); i++)
          chi = ch.charAt(i) + chi;
        return chi;
    }
    public char minchar(String ch ){
        char min='z';

        for(int i=0;i<ch.length()-1;i++){
             if (ch.charAt(i)<min){
                 min=ch.charAt(i);
             }
        }

        return min;
    }
    public String casechanger (String ch){
        String ch1="";
        for(int i=0;i<ch.length();i++){

            char c = ch.charAt(i);
            if(Character.isUpperCase(c)){
                ch1=ch1+ch.toLowerCase().charAt(i);

            }
            else{
                ch1=ch1+ch.toUpperCase().charAt(i);

            }
        }
        return ch1;


    }


    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}
