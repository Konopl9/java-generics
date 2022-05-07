package com.mishcma;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        store.setItem(45);
        Integer item = (Integer) store.getItem();
        System.out.println(item);
    }
}

class  Store {
    private Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}
