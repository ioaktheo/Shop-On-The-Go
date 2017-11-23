package com.sirialkillers.shoponthego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.sirialkillers.shoponthego.Maps_Related_Activities.MapsActivity;
import com.sirialkillers.shoponthego.Shop_Related_Activities.AddDiscountActivity;
import com.sirialkillers.shoponthego.Shop_Related_Activities.AddShopActivity;
import com.sirialkillers.shoponthego.Shop_Related_Activities.ShopsListView;

public class MenuActivity extends AppCompatActivity implements OnClickListener {
    private Button buttonMap;
    private Button buttonList;
    private Button buttonAddProductPhoto;
    private Button addShop;
    private Button addDiscount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        buttonMap = (Button) findViewById(R.id.buttonMap);
        buttonMap.setOnClickListener(this);
        buttonList = (Button) findViewById(R.id.buttonList);
        buttonList.setOnClickListener(this);
        addDiscount = (Button) findViewById(R.id.addDiscountButton);
        addDiscount.setOnClickListener(this);
        addShop = (Button) findViewById(R.id.addShopButton);
        addShop.setOnClickListener(this);

        buttonAddProductPhoto=(Button)findViewById(R.id.addProductPhotoButton);
        buttonAddProductPhoto.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonMap:
                Intent intentStartNextActivity = new Intent(this, MapsActivity.class);
                startActivity(intentStartNextActivity);
                break;
            case R.id.buttonList:
                Intent intentStartListActivity = new Intent(this, ShopsListView.class);
                startActivity(intentStartListActivity);
            case R.id.addProductPhotoButton:
                Intent intentStartProductPhotoActivity = new Intent(this, ProductPhotoActivity.class);
                startActivity(intentStartProductPhotoActivity);
            case R.id.addShopButton:
                Intent intentShop = new Intent(this, AddShopActivity.class);
                startActivity(intentShop);
            case R.id.addDiscountButton:
                Intent intentDiscount = new Intent(this, AddShopActivity.class);
                startActivity(intentDiscount);
            default:
                break;
        }
    }

}



