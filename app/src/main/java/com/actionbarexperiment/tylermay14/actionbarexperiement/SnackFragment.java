package com.actionbarexperiment.tylermay14.actionbarexperiement;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tylermay14 on 3/19/2018.
 */

public class SnackFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedinstaceState){
        return inflater.inflate(R.layout.fragment_snack, container, false);
    }
}
