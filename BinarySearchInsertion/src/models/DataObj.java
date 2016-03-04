/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author chris
 * @param <T>
 */
public class DataObj<T extends Comparable<T>> implements Comparable<DataObj<T>>{

    T obj;

    public DataObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
    
    public void showType() {
        System.out.println(obj.getClass().getName());
    }

    @Override
    public int compareTo(DataObj<T> o) {
        return getObj().compareTo(o.getObj());
    }

}
