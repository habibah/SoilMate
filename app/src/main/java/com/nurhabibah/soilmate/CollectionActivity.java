package com.nurhabibah.soilmate;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nurhabibah on 15/05/2015.
 */
public class CollectionActivity extends FragmentActivity {

    DemoCollectionPagerAdapter mDemoCollectionPagerAdapter;
    ViewPager mViewPager;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        mDemoCollectionPagerAdapter = new DemoCollectionPagerAdapter(
                getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mDemoCollectionPagerAdapter);
    }


    public class DemoCollectionPagerAdapter extends FragmentStatePagerAdapter{
        public DemoCollectionPagerAdapter(FragmentManager fm) {

            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            Fragment fragment = new ObjectFragment();
            Bundle args = new Bundle();

            args.putInt(ObjectFragment.ARG_OBJECT, i + 1);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public int getCount() {

            return 10;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return "Chroma " + (position + 1);
        }
    }


    public static class ObjectFragment extends Fragment {
        public static final String ARG_OBJECT = "chroma";

        @Override
        public View onCreateView(LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(
                    R.layout.fragment_collection_color, container, false);
            Bundle args = getArguments();
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    Integer.toString(args.getInt(ARG_OBJECT))
            );
            return rootView;
        }
    }
}
