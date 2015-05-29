package com.nurhabibah.soilmate;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements ActionBar.TabListener {

    AppSectionsPagerAdapter mAppSectionsPagerAdapter;
    ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAppSectionsPagerAdapter = new AppSectionsPagerAdapter(getSupportFragmentManager());

        // Set up the action bar.
        final ActionBar actionBar = getActionBar();

        // Specify that the Home/Up button should not be enabled, since there is no hierarchical
        // parent.
        actionBar.setHomeButtonEnabled(false);

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mAppSectionsPagerAdapter);
        mViewPager.setOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    public void onPageSelected(int position) {

                        actionBar.setSelectedNavigationItem(position);
                    }
                }
        );

        for (int i = 0; i < mAppSectionsPagerAdapter.getCount(); i++) {
            // Create a tab with text corresponding to the page title defined by the adapter.
            // Also specify this Activity object, which implements the TabListener interface, as the
            // listener for when this tab is selected.
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(mAppSectionsPagerAdapter.getPageTitle(i))
                            .setTabListener(this));
        }
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

        mViewPager.setCurrentItem(tab.getPosition());

    }

    @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //kumpulan section daftar warna
    public static class AppSectionsPagerAdapter extends FragmentPagerAdapter{
        public AppSectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch(i) {
                case 0:
                    return new Section0();

                case 1:
                    return new Section1();
                case 2:
                    return new Section2();
                case 3:
                    return new Section3();
                case 4:
                    return new Section4();
                case 5:
                    return new Section5();
                case 6:
                    return new Section6();


            }
            return null;
        }
        @Override
        public int getCount() {
            return 7;
        }



    }
    //class daftar warna hue 2.5Y
    public static class Section0 extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_section25y, container, false);

            //button warna
            Button btn0_20, btn0_30, btn0_40, btn0_50, btn0_60, btn0_70, btn0_80,
                    btn0_32, btn0_42, btn0_52, btn0_62, btn0_72, btn0_82,
                    btn0_44, btn0_54, btn0_64, btn0_74, btn0_84,
                    btn0_56, btn0_66, btn0_76, btn0_86,
                    btn0_68, btn0_78, btn0_88;


            return rootView;
        }
    }

    //daftar warna 2.5YR
    public static class Section1 extends Fragment {

        //button warna
        Button btn1_20, btn1_30, btn1_40, btn1_50, btn1_60,
                btn1_22, btn1_32, btn1_42, btn1_52, btn1_62,
                btn1_24, btn1_34, btn1_44, btn1_54, btn1_64,
                btn1_36, btn1_46, btn1_56, btn1_66,
                btn1_48, btn1_58, btn1_68;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_section25yr, container, false);




            return rootView;
        }
    }

    //daftar warna hue 5Y
    public static class Section2 extends Fragment {

        //button warna
        Button btn2_21, btn2_31, btn2_41, btn2_51, btn2_61, btn2_71, btn2_81,
                btn2_22, btn2_32, btn2_42, btn2_52, btn2_62, btn2_72,btn2_82,
                btn2_43, btn2_53, btn2_63, btn2_73, btn2_83,
                btn2_44, btn2_54, btn2_64, btn2_74, btn2_84,
                btn2_56, btn2_66, btn2_76, btn2_86,
                btn2_68, btn2_78, btn2_88;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_section5y, container, false);




            return rootView;
        }
    }

    //daftar warna Hue 5YR
    public static class Section3 extends Fragment {

        //button warna
        Button btn3_21, btn3_31, btn3_41, btn3_51, btn3_61, btn3_71, btn3_81,
                btn3_22, btn3_32, btn3_42, btn3_52, btn3_62, btn3_72,btn3_82,
                btn3_33, btn3_43, btn3_53, btn3_63, btn3_73, btn3_83,
                btn3_34, btn3_44,  btn3_54, btn3_64, btn3_74, btn3_84,
                btn3_46, btn3_56, btn3_66, btn3_76,
                btn3_48, btn3_58, btn3_68, btn3_78;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_section5yr, container, false);



            return rootView;
        }
    }

    //daftar warna chroma 7.5YR
    public static class Section4 extends Fragment {

        //button warna
        Button btn4_20, btn4_30, btn4_40, btn4_50, btn4_60, btn4_70, btn4_80,
                btn4_32, btn4_42, btn4_52, btn4_62, btn4_72, btn4_82,
                btn4_44, btn4_54, btn4_64, btn4_74, btn4_84,
                btn4_56, btn4_66, btn4_76, btn4_86,
                btn4_58, btn4_68, btn4_78;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_section75yr, container, false);

            //button warna


            return rootView;
        }
    }

    //daftar warna 10R
    public static class Section5 extends Fragment {

        //button warna
        Button btn5_21, btn35_31, btn5_41, btn5_51, btn5_61,
                btn5_22, btn5_32, btn5_42, btn5_52, btn5_62,
                btn5_33, btn5_43, btn5_53, btn5_63,
                btn5_34, btn5_44, btn5_54, btn5_64,
                btn5_36, btn5_46, btn5_56, btn5_66,
                btn5_48, btn5_58, btn5_68;
    }

    //daftar warna 10YR
    public static class Section6 extends Fragment {

        //button warna
        Button btn6_21, btn6_31, btn6_41, btn6_51, btn6_61, btn6_71, btn6_81,
                btn6_22, btn6_32, btn6_42, btn6_52, btn6_62, btn6_72,btn6_82,
                btn6_33, btn6_43, btn6_53, btn6_63, btn6_73, btn6_83,
                btn6_34, btn6_44, btn6_54, btn6_64, btn6_74, btn6_84,
                btn6_56, btn6_66, btn6_76, btn6_86,
                btn6_58, btn6_68, btn6_78, btn6_88;

    }




}
