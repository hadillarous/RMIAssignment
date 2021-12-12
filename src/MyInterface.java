import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
    String reverse(String ch) throws RemoteException;
    char minchar(String ch) throws RemoteException;
    String casechanger(String ch) throws RemoteException;

}

