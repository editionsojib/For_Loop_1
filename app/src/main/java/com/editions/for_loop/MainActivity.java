package com.editions.for_loop;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

   LinearLayout mylayout;

   Button button;
   EditText editText_1 , editText_2;
   TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



//Test for loop ===============================================================

//        mylayout= findViewById(R.id.myLauout);
//
//        for (int x= 0; x<10; x++){
//
//            Button button= new Button(getApplicationContext());
//            button.setText("Button: "+x);
//
//            mylayout.addView(button);
//
//        }


//Test for loop ===============================================================



//        ================================================

        editText_1= findViewById(R.id.editText_1);
        editText_2= findViewById(R.id.editText_2);
        button= findViewById(R.id.btn);
        textView= findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ed_1 = editText_1.getText().toString();
                String ed_2 = editText_2.getText().toString();

                if (ed_1.isEmpty() && ed_2.isEmpty()){
                    editText_1.setText("1");
                    editText_2.setText("10");
                }else {
                    int ied_1= Integer.parseInt(ed_1);
                    int ied_2= Integer.parseInt(ed_2);

                    for (int x= ied_1; x<= ied_2; x++){

                        textView.append("  "+x);
                    }
                }

            }
        });












    }
}