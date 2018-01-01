package com.example.app7.prsenter;

import com.example.app7.Bean;
import com.example.app7.model.ModelToos;
import com.example.app7.view.ViewPort;

/**
 * Created by Administrator on 2017/12/30/030.
 */

public class PresenterToos implements ModelToos.OnFinish {
    private ViewPort port;
    private ModelToos toos;

    public PresenterToos(ViewPort port) {
        this.port = port;
        toos=new ModelToos(this);
    }
public void getBean(){
        toos.getUser();
}
    @Override
    public void finish(Bean bean) {
     port.showUser(bean);
    }
}
