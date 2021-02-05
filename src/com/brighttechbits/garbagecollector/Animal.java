package com.brighttechbits.garbagecollector;

public class Animal {
    String name;
    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Animal tiger = new Animal();
        tiger.setName("Asian Tiger");
        System.out.println("Object is created");
        tiger =null;
        System.gc();
    }

    protected void finalize(){
        System.out.println("GC is about to destroy "+ this.name +" object");
    }
}
