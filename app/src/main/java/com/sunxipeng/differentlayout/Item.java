package com.sunxipeng.differentlayout;

/**
 * Created by sunxipeng on 2015/11/24.
 */
public class Item {

    public int type;

    public static int HEADER = 0;

    public static int ITEM = 1;

    public Item(int type){

        this.type = type;

    }

    public  int getType(){

        return type;
    }

}
