package com.example.jiananyuan.android_empty;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.bumptech.glide.Glide;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView v;
    private VideoView vv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        v = findViewById(R.id.iv_2);
        Glide.with(this).load("https://img.zcool.cn/community/0167905851206fa8012060c8f67f34.gif").into(v);
        vv = findViewById(R.id.iv_3);
        // getURL();
        Uri uri = Uri.parse(getURL());
        vv.setMediaController(new MediaController(this));
        vv.setVideoURI(uri);
        vv.start();
        vv.requestFocus();
    }

    String getURL() {
        try { // https://3g.163.com/v/video/VC1QG8AI5.html
            URL url = new URL("https://www.baidu.com/");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            Toast.makeText(ImageViewActivity.this,"执行到了",Toast.LENGTH_SHORT).show();
            /*
            String s;
            while((s = reader.readLine()) != null) {
                // Toast.makeText(ImageViewActivity.this,rec,Toast.LENGTH_SHORT).show();
                if( s.startsWith( "\"contentUrl\":\"" ) ) {
                    s = s.substring(14);
                    s = s.substring(0, s.length() - 1);
                    return s;
                }
            }

             */
            return "";
        } catch (Exception e) {
            Toast.makeText(ImageViewActivity.this,"原视频无法播放，为您替换视频",Toast.LENGTH_SHORT).show();
            return "https://flv2.bn.netease.com/videolib1/1811/26/OqJAZ893T/HD/OqJAZ893T-mobile.mp4";
        }
    }

}

// https://flv2.bn.netease.com/videolib1/1811/26/OqJAZ893T/HD/OqJAZ893T-mobile.mp4

// https://flv2.bn.netease.com/9dcec2f28d966c64f17ad5df14370be5f5600c3e078634b366b45ecb4df133c3f5e6b987c6fccab5b1be4c1e5d32ab3b6784f39fccec5a1fcf86a37c611543ada9143aa524da4c95e2e7ae1c7b9a5bed3e95ff207f78b49375b63d69318875f68d9b932b36396d1075ae177edce0d4b347af1e7bc40b767b.mp4

// https://flv2.bn.netease.com/830a58d87282297164bdda6c66f7a4008c13c7edbfaebef86abd7e3e4d83630805a79cee7ba8e1b5789014cbc5946c1caaa3583865602d8496e3739b3d59063fe1b119e68d815afdb2f2c54dfff0be21df129c6c38d18952974cd2da3ed51d25d93b4af2a45a0c583090b5816f2b402406c1014e4953e450.mp4
