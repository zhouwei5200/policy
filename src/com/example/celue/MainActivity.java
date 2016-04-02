package com.example.celue;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //加法
        Context contextAdd = new Context(new AddMethod(8,9));
        contextAdd.out();
        //减法
        Context contextSub = new Context(new SubMethod(8,9));
        contextSub.out();
       // 乘法
        Context contextInvo = new Context(new InvoMethod(8,9));
        contextInvo.out();
        
        //可以实现更多算法
    }


   
}
