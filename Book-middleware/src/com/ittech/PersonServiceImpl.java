package com.ittech;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by yuan on 2018/6/27.
 */
public class PersonServiceImpl extends UnicastRemoteObject implements PersonService {


    protected PersonServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public Person getPersonInfo(int n) throws RemoteException {
        Person person=new Person();
        person.setId(n);
        System.out.println(person);
        return person;
    }
}
