package com.example.nthie.truyencuoi.icon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nthie.truyencuoi.R;

import java.util.List;

/**
 * Created by nthie on 4/6/2018.
 */

public class IconAdapter extends BaseAdapter {
    private List<Icons> icons;
    public IconAdapter(List<Icons> icons) {
        this.icons = icons;
    }


    @Override
    public int getCount() {
        if (icons == null) {
            return 0;
        }
        return icons.size();
    }

    @Override
    public Object getItem(int position) {
        return icons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View itemView, ViewGroup viewGroup) {if (itemView == null){
        LayoutInflater inflater = LayoutInflater.
                from(viewGroup.getContext());
        itemView = inflater.inflate(R.layout.item_danhmuc,viewGroup,false);
    }
        ImageView img = (ImageView)itemView.findViewById(R.id.img_icon);
        TextView txt = (TextView)itemView.findViewById(R.id.tv_icon);
        Icons icon = icons.get(position);
        img.setImageResource(icon.getIdImage());
        txt.setText(icon.getName());
        return itemView;
    }
}
