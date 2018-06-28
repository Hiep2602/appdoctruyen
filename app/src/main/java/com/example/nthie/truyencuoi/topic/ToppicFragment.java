package com.example.nthie.truyencuoi.topic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.nthie.truyencuoi.MainActivity;
import com.example.nthie.truyencuoi.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nthie on 4/6/2018.
 */

public class ToppicFragment extends Fragment implements ToppicAdapter.ItopicAdapter{
    private List<Topic> topics;
    private ListView listView;
    private ToppicAdapter toppicAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmenttopic,
                container,false);
        init(view);
        return view;
    }

    private void init(View view){
        topics = new ArrayList<>();
        topics.add(new Topic(R.drawable.im_1,"Vo Va"));
        topics.add(new Topic(R.drawable.im_1,"Dan Gian"));
        topics.add(new Topic(R.drawable.im_2,"Gia Dinh"));
        topics.add(new Topic(R.drawable.im_3,"Tieu Lam"));
        topics.add(new Topic(R.drawable.im_4,"Tinh Yeu"));
        topics.add(new Topic(R.drawable.im_5,"Ngu Ngon"));
        topics.add(new Topic(R.drawable.im_6,"Ga Trong"));
        topics.add(new Topic(R.drawable.im_7,"Cham Troc"));

        listView = (ListView)view.findViewById(R.id.lv_store);
        toppicAdapter = new ToppicAdapter(topics,this);
        listView.setAdapter(toppicAdapter);
    }


    @Override
    public void openStore(int position) {
        ((MainActivity) getActivity()).openStore(
                topics.get(position).getName()
        );
    }

    }

