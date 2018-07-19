package com.ittech;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by yuan on 2018/6/27.
 */
public class Server {

    public static void main(String[] args) throws RemoteException, NamingException {
        PersonService personService=new PersonServiceImpl();
        LocateRegistry.createRegistry(6600);
        Context namingContext=new InitialContext();
        namingContext.rebind("rmi://127.0.0.1:6600/PersonService/personService",personService);
        System.out.println("server start!!");
    }
}
