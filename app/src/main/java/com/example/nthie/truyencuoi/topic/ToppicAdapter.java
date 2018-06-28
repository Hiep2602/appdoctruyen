package com.example.nthie.truyencuoi.topic;

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

public class ToppicAdapter extends BaseAdapter {
    private ItopicAdapter inter;

    private List<Topic> topics;

    public ToppicAdapter(List<Topic> topics,ItopicAdapter inter) {
        this.inter = inter;
        this.topics = topics;
    }

    @Override
    public int getCount() {
        if (topics == null) {
            return 0;
        }
        return topics.size();
    }

    @Override
    public Object getItem(int position) {
        return topics.get(position);

    }

    @Override
    public long getItemId(int  position) {
        return position;
    }

    @Override
    public View getView(final int position, View contentView, ViewGroup viewGroup) {
        if (contentView == null){
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            contentView = inflater.inflate(R.layout.item_store,viewGroup,false);
        }
        ImageView imageView = (ImageView)contentView.findViewById(R.id.Ivmg_1);
        TextView textView = (TextView)contentView.findViewById(R.id.txt_1);
        Topic topic = topics.get(position);
        imageView.setImageResource(topic.getIdImg());
        textView.setText(topic.getName());
        contentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inter.openStore(position);
            }
        });
        return contentView;
    }
    public interface ItopicAdapter{
        void openStore(int position);
    }
}
