package com.sunxipeng.differentlayout;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private ListView lv;

    private List<Item> list ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
        
        list = new ArrayList<Item>();

        /**
         * 集合中添加不同类型的Item；
         */


            for(int i=0; i<6; i++){

                Item  item = new Item(Item.HEADER);

                list.add(item);

                for(int j=0; j<10; j++){

                   Item item1 = new Item(Item.ITEM);

                    list.add(item1);
                }
            }



        for(int m=0; m<list.size();m++){

            int type = list.get(m).getType();

            Log.i("MainActivity",String.valueOf(type));

            System.out.print(type);
        }
        lv.setAdapter(new MyAdapter(this , list));
    }


}
