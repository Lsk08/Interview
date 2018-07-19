package com.ittech;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by yuan on 2018/6/27.
 */
public interface PersonService extends Remote {
    public Person getPersonInfo(int n) throws RemoteException;
}
