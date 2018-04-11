package com.example.zhouxinqiang.jd_xm;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zhouxinqiang.jd_xm.fragments.Category_Fragment;
import com.example.zhouxinqiang.jd_xm.fragments.Find_Fragment;
import com.example.zhouxinqiang.jd_xm.fragments.Home_Fragment;
import com.example.zhouxinqiang.jd_xm.fragments.Mine_Fragment;
import com.example.zhouxinqiang.jd_xm.fragments.ShopCar_Fragment;

public class Zhu_Activity extends AppCompatActivity implements View.OnClickListener {

    private Home_Fragment home_fragment;
    private Category_Fragment category_fragment;
    private Find_Fragment find_fragment;
    private ShopCar_Fragment shopCar_fragment;
    private Mine_Fragment mine_fragment;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dong);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
       // hidefragment();
        FragmentManager fragmentManagerHome = getSupportFragmentManager();
        FragmentTransaction fragmentTransactionHome = fragmentManagerHome.beginTransaction();
        if (home_fragment == null){
            home_fragment = new Home_Fragment();
            fragmentTransactionHome.add(R.id.fl,home_fragment);
        }
        hidefragment(fragmentTransactionHome);
        fragmentTransactionHome.show(home_fragment);
        fragmentTransactionHome.commit();


    }

    private void hidefragment(FragmentTransaction string) {
        if (!(home_fragment == null)){
            string.hide(home_fragment);
        }
        if (!(category_fragment == null)){
            string.hide(category_fragment);
        }
        if (!(find_fragment == null)){
            string.hide(find_fragment);
        }
        if (!(shopCar_fragment == null)){
            string.hide(shopCar_fragment);
        }
        if (!(mine_fragment == null)){
            string.hide(mine_fragment);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                FragmentManager fragmentManagerHome = getSupportFragmentManager();
                FragmentTransaction fragmentTransactionHome = fragmentManagerHome.beginTransaction();
                if (home_fragment == null){
                    home_fragment = new Home_Fragment();
                    fragmentTransactionHome.add(R.id.fl,home_fragment);
                }
                hidefragment(fragmentTransactionHome);
                fragmentTransactionHome.show(home_fragment);
                fragmentTransactionHome.commit();
                break;
            case R.id.btn2:
                FragmentManager fragmentManagercategory = getSupportFragmentManager();
                FragmentTransaction fragmentTransactioncategory = fragmentManagercategory.beginTransaction();
                if (category_fragment == null){
                    category_fragment = new Category_Fragment();
                    fragmentTransactioncategory.add(R.id.fl,category_fragment);
                }
                hidefragment(fragmentTransactioncategory);
                fragmentTransactioncategory.show(category_fragment);
                fragmentTransactioncategory.commit();

                break;
            case R.id.btn3:
                FragmentManager fragmentManagerfind = getSupportFragmentManager();
                FragmentTransaction fragmentTransactionfind = fragmentManagerfind.beginTransaction();
                if (find_fragment == null){
                    find_fragment = new Find_Fragment();
                    fragmentTransactionfind.add(R.id.fl,find_fragment);
                }
                hidefragment(fragmentTransactionfind);
                fragmentTransactionfind.show(find_fragment);
                fragmentTransactionfind.commit();
                break;
            case R.id.btn4:
                FragmentManager fragmentManagershopcar = getSupportFragmentManager();
                FragmentTransaction fragmentTransactionshopcar = fragmentManagershopcar.beginTransaction();
                if (shopCar_fragment == null){
                    shopCar_fragment = new ShopCar_Fragment();
                    fragmentTransactionshopcar.add(R.id.fl,shopCar_fragment);
                }
                hidefragment(fragmentTransactionshopcar);
                fragmentTransactionshopcar.show(shopCar_fragment);
                fragmentTransactionshopcar.commit();
                break;
            case R.id.btn5:
                FragmentManager fragmentManagermine = getSupportFragmentManager();
                FragmentTransaction fragmentTransactionmine = fragmentManagermine.beginTransaction();
                if (mine_fragment == null){
                    mine_fragment = new Mine_Fragment();
                    fragmentTransactionmine.add(R.id.fl,mine_fragment);
                }
                hidefragment(fragmentTransactionmine);
                fragmentTransactionmine.show(mine_fragment);
                fragmentTransactionmine.commit();
                break;
        }
    }
}
