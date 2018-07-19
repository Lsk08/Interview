package com.ittech;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by yuan on 2018/6/27.
 */
public class Client {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        PersonService personService=(PersonService)Naming.lookup("rmi://127.0.0.1:6600/PersonService/personService");
        Person p=personService.getPersonInfo(5);
        System.out.println(p);
    }
}
