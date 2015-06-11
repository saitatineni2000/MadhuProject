package com.example.saisandeep.madhuproject;


import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by saisandeep on 5/26/2015.
 */
public class InfoBarFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View row=inflater.inflate(R.layout.fragment_info_bar,container,false);

        return row;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.clinictext)
        {
           FragmentManager manager2=getFragmentManager();
            InfoBarDialogFragment infoBarDialogFragment=new InfoBarDialogFragment();
            infoBarDialogFragment.show(manager2,"MyDialog");


        }
    }
}
