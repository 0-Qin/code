package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button bt;
private TextView textView;
private RadioGroup rg;
private RadioButton rg1,rg2;
private CheckBox cb1,cb2,cb3,cb4;
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);

        editText=findViewById(R.id.editText);
        bt=(Button)findViewById(R.id.button);
        textView=findViewById(R.id.textView3);
        rg=findViewById(R.id.rg);
        rg1=findViewById(R.id.radioButton);
        rg2=findViewById(R.id.radioButton2);
        cb1=findViewById(R.id.checkBox);
        cb2=findViewById(R.id.checkBox2);
        cb3=findViewById(R.id.checkBox3);
        cb4=findViewById(R.id.checkBox4);
//
//      CompoundButton.OnCheckedChangeListener listener=new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if(b){
//                    s[0]=compoundButton.getText().toString();
////                    textView.setText(textView.getText().toString()+compoundButton.getText().toString());
//                }
//            }
//        };
//        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
//
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if(checkedId==R.id.radioButton){
////                    s[1]="男";
//                        textView.setText("男");
//                }
//                if(checkedId == R.id.radioButton2){
//                    textView.setText("女");
////                s[1]="nv";
//
//                }
//
//
//            }
//
//        });

//
//        cb1.setOnCheckedChangeListener(listener);
//        cb2.setOnCheckedChangeListener(listener);
//        cb3.setOnCheckedChangeListener(listener);
//        cb4.setOnCheckedChangeListener(listener);




        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                s +=rg1.isChecked()?rg1.getText().toString():rg2.getText().toString();
                s +=cb1.isChecked()?cb1.getText().toString():"";
                s +=cb2.isChecked()?cb2.getText().toString():"";
                s +=cb3.isChecked()?cb3.getText().toString():"";
                s +=cb4.isChecked()?cb4.getText().toString():"";

                textView.setText(s);
//                Toast.makeText(MainActivity.this,"匿名内部类的方式实现事件处理", Toast.LENGTH_SHORT).show();

//             textView.setText(s[100]);
            }
        });

    }


}
