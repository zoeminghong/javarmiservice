package rmi.inf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHello extends Remote{
	/** 
     * �򵥵ķ��ء�Hello World��"���� 
     * @return ���ء�Hello World��"���� 
     * @throws java.rmi.RemoteException 
     */ 
    public String helloWorld() throws RemoteException; 

    /** 
     * һ���򵥵�ҵ�񷽷������ݴ��������������Ӧ���ʺ��� 
     * @param someBodyName  ���� 
     * @return ������Ӧ���ʺ��� 
     * @throws java.rmi.RemoteException 
     */ 
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException; 
}
