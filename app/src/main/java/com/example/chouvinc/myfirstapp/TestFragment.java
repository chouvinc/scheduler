package com.example.chouvinc.myfirstapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by chouvinc on 1/31/2018.
 */

public class TestFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstance) {
        return inflater.inflate(R.layout.activity_main, container, false);
    }

}
