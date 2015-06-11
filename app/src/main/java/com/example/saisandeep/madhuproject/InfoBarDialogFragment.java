package com.example.saisandeep.madhuproject;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by saisandeep on 5/26/2015.
 */
public class InfoBarDialogFragment extends DialogFragment implements View.OnClickListener {

    Button Yes,No;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dialog_box,null);

        Yes= (Button) view.findViewById(R.id.yes);
        No= (Button) view.findViewById(R.id.no);
        setCancelable(false);
        Yes.setOnClickListener(this);
        No.setOnClickListener(this);

        return view;


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.yes)
        {
            dismiss();
            Toast.makeText(getActivity(),"Yes was clicked",Toast.LENGTH_SHORT).show();
        }

        if(v.getId() == R.id.no)
        {
            dismiss();
            Toast.makeText(getActivity(),"No was clicked",Toast.LENGTH_SHORT).show();
        }

    }
}
