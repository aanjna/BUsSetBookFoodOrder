package com.book.bus.busbooking;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Choudhary on 26-Dec-15.
 */
public class AppIntroFragment  extends Fragment {

    final static String LAYOUT_ID = "layoutid";

    public static AppIntroFragment newInstance(int layoutId) {
        AppIntroFragment pane = new AppIntroFragment();
        Bundle args = new Bundle();
        args.putInt(LAYOUT_ID, layoutId);
        pane.setArguments(args);
        return pane;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(getArguments().getInt(LAYOUT_ID, -1), container, false);
        return rootView;
    }
}