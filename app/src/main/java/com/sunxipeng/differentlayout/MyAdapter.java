package com.sunxipeng.differentlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2015/11/24.
*/
public class MyAdapter extends BaseAdapter implements PinnedSectionListView.PinnedSectionListAdapter{

    private Context context;

    private List<Item> datas;

    public MyAdapter(Context context,List<Item> datas ){

        this.context = context;

        this.datas = datas;

    }



    @Override
    public int getCount() {

        return datas.size();
    }

    @Override
    public Object getItem(int position) {

        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(getItemViewType(position) == Item.HEADER){

            convertView = LayoutInflater.from(context).inflate(R.layout.head,null);

            return  convertView;

        }

        convertView = LayoutInflater.from(context).inflate(R.layout.item,null);


        return convertView;
    }

    @Override
    public int getViewTypeCount() {


        return 2;
    }

    @Override
    public int getItemViewType(int position) {


        return datas.get(position).getType();

    }

    @Override
    public boolean isItemViewTypePinned(int viewType) {


        return Item.HEADER == viewType;
    }
}
