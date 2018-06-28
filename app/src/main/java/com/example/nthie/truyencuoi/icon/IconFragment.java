package com.example.nthie.truyencuoi.icon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.nthie.truyencuoi.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nthie on 4/6/2018.
 */

public class IconFragment extends Fragment {
    private List<Icons> icons;
    private ListView lv_icon;
    private IconAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vova,container,false);
        Bundle bundle = getArguments();
        String name = bundle.getString("NAME");
        init(view, name);
        return view;
    }
    private void init(View view, String name){
        icons = new ArrayList<>();
        switch (name){
            case "Vo Va":
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Kinh di ve cac ba vo"));
                icons.add(new Icons(R.drawable.emoj,
                        "Bo Con Thi Tan Gai"));
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Ba Troc"));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Cai Toi Ngu Thi Danh Cho Chua"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nhin Trom..."));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nguoi Nha Dang Cho Gap"));

                break;
            case "Dan Gian":
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Kinh di ve cac ba vo"));
                icons.add(new Icons(R.drawable.emoj,
                        "Bo Con Thi Tan Gai"));
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Ba Troc"));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Cai Toi Ngu Thi Danh Cho Chua"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nhin Trom..."));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nguoi Nha Dang Cho Gap"));
                break;
            case "Gia Dinh":
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Kinh di ve cac ba vo"));
                icons.add(new Icons(R.drawable.emoj,
                        "Bo Con Thi Tan Gai"));
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Ba Troc"));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Cai Toi Ngu Thi Danh Cho Chua"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nhin Trom..."));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nguoi Nha Dang Cho Gap"));
                break;
            case "Tieu Lam":
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Kinh di ve cac ba vo"));
                icons.add(new Icons(R.drawable.emoj,
                        "Bo Con Thi Tan Gai"));
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Ba Troc"));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Cai Toi Ngu Thi Danh Cho Chua"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nhin Trom..."));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nguoi Nha Dang Cho Gap"));
                break;
            case "Tinh Yeu":
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Kinh di ve cac ba vo"));
                icons.add(new Icons(R.drawable.emoj,
                        "Bo Con Thi Tan Gai"));
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Ba Troc"));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Cai Toi Ngu Thi Danh Cho Chua"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nhin Trom..."));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nguoi Nha Dang Cho Gap"));
                break;
            case "Ngon Tinh":
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Kinh di ve cac ba vo"));
                icons.add(new Icons(R.drawable.emoj,
                        "Bo Con Thi Tan Gai"));
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Ba Troc"));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Cai Toi Ngu Thi Danh Cho Chua"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nhin Trom..."));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nguoi Nha Dang Cho Gap"));
                break;
            case "Ngu Ngon":
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Kinh di ve cac ba vo"));
                icons.add(new Icons(R.drawable.emoj,
                        "Bo Con Thi Tan Gai"));
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Ba Troc"));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Cai Toi Ngu Thi Danh Cho Chua"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nhin Trom..."));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nguoi Nha Dang Cho Gap"));
                break;
            case "Ga Trong":
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Kinh di ve cac ba vo"));
                icons.add(new Icons(R.drawable.emoj,
                        "Bo Con Thi Tan Gai"));
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Ba Troc"));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Cai Toi Ngu Thi Danh Cho Chua"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nhin Trom..."));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nguoi Nha Dang Cho Gap"));
                break;
            case "Tram choc":
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Kinh di ve cac ba vo"));
                icons.add(new Icons(R.drawable.emoj,
                        "Bo Con Thi Tan Gai"));
                icons.add(new Icons(R.drawable.emoj,
                        "Truyen Ba Troc"));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Cai Toi Ngu Thi Danh Cho Chua"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nhin Trom..."));
                icons.add(new Icons(R.drawable.emoj,
                        "Dem Tan Hon"));
                icons.add(new Icons(R.drawable.emoj,
                        "Nguoi Nha Dang Cho Gap"));
                break;
            default:
                break;
        }
        lv_icon = (ListView)view.findViewById(R.id.lv_vova);
        adapter = new IconAdapter(icons);
        lv_icon.setAdapter(adapter);

        TextView title = (TextView)view.findViewById(R.id.txt_3);
        title.setText(name);
    }
}
