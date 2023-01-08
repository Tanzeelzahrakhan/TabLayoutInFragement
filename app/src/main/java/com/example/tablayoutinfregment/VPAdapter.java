package com.example.tablayoutinfregment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentPagerAdapter {
    private final ArrayList<Fragment> FragmentArrayList = new ArrayList<>();
    private final ArrayList<String> TitlesArrayList = new ArrayList<>();

    public VPAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return FragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentArrayList.size();
    }

    public void AddFragment(Fragment fragment, String title) {
        FragmentArrayList.add(fragment);
        TitlesArrayList.add(title);
    }

}