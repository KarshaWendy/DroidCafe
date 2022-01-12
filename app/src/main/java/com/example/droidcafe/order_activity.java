package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class order_activity extends AppCompatActivity {
    private static final String TAG_ACTIVITY = order_activity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_main);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked=((RadioButton)view).isChecked();
        switch(view.getId()){
            case R.id.sameday:
                if(checked){
                    displayToast("You have selected same day Delivery");
                }
                break;
            case R.id.nextday:
                if(checked){
                    displayToast("you have selected nextday delivery");
                }
                break;
            case R.id.pickup:
                if(checked){
                    displayToast("you have selected to pick up yourself");
                }
        }
    }


    public void displayToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }

}
