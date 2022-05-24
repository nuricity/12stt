package com.example.a12stt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.Bundle;

import com.android.volley.toolbox.StringRequest;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void makeRequest() {
            BreakIterator editText;
            String url = editText.getText().toString();

            StringRequest request = new StringRequest(
                    Request.Method.GET,
                    url,
                    new Responce.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            println("응답 -> " + response);
                            processResponse(response);
                        }

                        private void processResponse(String response) {
                            Gson gson = new Gson();
                            MovieList movieList = gson.fromJson(response, MovieList.class);
                            println("영화 정보의 수 : " + movieList.boxOfficeResult.dailyBoxOfficeList.size());
                        }
                    }
            )        }
    }
}