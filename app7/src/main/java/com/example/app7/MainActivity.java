package com.example.app7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.app7.prsenter.PresenterToos;
import com.example.app7.view.ViewPort;

public class MainActivity extends AppCompatActivity implements ViewPort {

    private RecyclerView mRlv;
    private PresenterToos presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter=new PresenterToos(this);
        initView();
        presenter.getBean();
    }

    private void initView() {
        mRlv = (RecyclerView) findViewById(R.id.rlv);
    }

    @Override
    public void showUser(Bean bean) {
     mRlv.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
     mRlv.setAdapter(new MyAdapter(bean,MainActivity.this));
    }
}
