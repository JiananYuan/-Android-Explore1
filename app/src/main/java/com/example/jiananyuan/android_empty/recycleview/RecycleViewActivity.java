package com.example.jiananyuan.android_empty.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jiananyuan.android_empty.R;

public class RecycleViewActivity extends AppCompatActivity {

    private Button mBtnLiner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        mBtnLiner = findViewById(R.id.btn_linear);
        mBtnLiner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecycleViewActivity.this,LinerRecycleViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
