package com.example.celue;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //�ӷ�
        Context contextAdd = new Context(new AddMethod(8,9));
        contextAdd.out();
        //����
        Context contextSub = new Context(new SubMethod(8,9));
        contextSub.out();
       // �˷�
        Context contextInvo = new Context(new InvoMethod(8,9));
        contextInvo.out();
        
        //����ʵ�ָ����㷨
    }


   
}
