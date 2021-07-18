package com.example.test7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;


public class MainActivity extends AppCompatActivity {
            Button likeButton;
            TextView likecountView;
            Button unlikeButton;
            TextView unlikecountView;

            int likeCount = 1;
            int unlikeCount = 2;
            boolean likeState = false;
            boolean unlikeState = false;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                ListView listView = findViewById(R.id.listView);

                likeButton = (Button) findViewById(R.id.likeButton);
                unlikeButton = (Button) findViewById(R.id.unlikeButton);
                likeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (likeState) {
                            decrLikeCount();
                        } else {
                            incrLikeCount();
                            if (unlikeState) {
                                decrunLikeCount();
                                unlikeState = !unlikeState;
                            }
                        }

                        likeState = !likeState;
                    }
                });
                unlikeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (unlikeState) {
                            decrunLikeCount();
                        } else {
                            incrunLikeCount();
                            if (likeState) {
                                decrLikeCount();
                                likeState = !likeState;
                            }
                        }

                        unlikeState = !unlikeState;
                    }
                });
                likecountView = (TextView) findViewById(R.id.likecountView);
                unlikecountView = (TextView) findViewById(R.id.unlikecountView);

                CommAdapter adapter = new CommAdapter();
                adapter.addItem(new CommItem("kym71**","13분전","적당히 재밌다. 오랜만에 잠 안오는 영화 봤네요.","추천 0","|","신고하기"));
                adapter.addItem(new CommItem("kim32**","1시간전","재밌다. ㅎㅎ","추천 2","|","신고하기"));
                listView.setAdapter(adapter);

            }

    public void incrLikeCount() {
        likeCount += 1;
        likecountView.setText(String.valueOf(likeCount));
        likeButton.setBackgroundResource(R.drawable.ic_thumb_up_selected);
    }

    public void decrLikeCount() {
        likeCount -= 1;
        likecountView.setText(String.valueOf(likeCount));
        likeButton.setBackgroundResource(R.drawable.ic_thumb_up);
    }

    public void incrunLikeCount() {
        unlikeCount += 1;
        unlikecountView.setText(String.valueOf(unlikeCount));
        unlikeButton.setBackgroundResource(R.drawable.ic_thumb_down_selected);
    }

    public void decrunLikeCount() {
        unlikeCount -= 1;
        unlikecountView.setText(String.valueOf(unlikeCount));
        unlikeButton.setBackgroundResource(R.drawable.ic_thumb_down);
    }

    class CommAdapter extends BaseAdapter {
        ArrayList<CommItem> items = new ArrayList<CommItem>();


        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(CommItem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }



        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            CommItemView view = new CommItemView(getApplicationContext());

            CommItem item = items.get(position);
            view.setName(item.getName());
            view.setTime(item.getTime());
            view.setComment(item.getComment());
            view.setCommlike(item.getCommlike());
            view.setBar(item.getBar());
            view.setreport(item.getReport());

            return view;
        }
    }

}