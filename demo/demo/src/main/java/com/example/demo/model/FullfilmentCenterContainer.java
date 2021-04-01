package com.example.demo.model;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class FullfilmentCenterContainer {

    public List<FullfilmentCenter> Centers; //kluczem jest nazwa magazynu


    public FullfilmentCenterContainer(){
        Centers= new ArrayList();
    };


    public boolean addCenter(FullfilmentCenter f1){
    System.out.println(" cneter added");
        return Centers.add(f1);

    }

    public boolean removeCenter(String storage_name){
        for(FullfilmentCenter fullfilmentCenter:Centers){
            if(fullfilmentCenter.getStorage_name().equals(storage_name)) {
                Centers.remove(fullfilmentCenter);
                return true;
            }
        }
        return false;
    }


    public void summary()   {
        System.out.println("List of all magazines:");
        for(FullfilmentCenter center : Centers)
            center.summary();
    }


    public void sort(){
        Centers.sort(Comparator.comparing(a -> a.getCurrent_fill()));
        for(FullfilmentCenter center: Centers)
            center.summary();
    }

    public List<FullfilmentCenter> getCenters() {
        return Centers;
    }

}
