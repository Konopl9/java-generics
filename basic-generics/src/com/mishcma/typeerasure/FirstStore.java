package com.mishcma.typeerasure;

import java.io.Serializable;

/*
 typeerasure will during the compilation will change generic type to the bound type
 in this class to 'Serializable'
*/
public class FirstStore<T extends Serializable> {

    private T item;

    public FirstStore() {

    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
