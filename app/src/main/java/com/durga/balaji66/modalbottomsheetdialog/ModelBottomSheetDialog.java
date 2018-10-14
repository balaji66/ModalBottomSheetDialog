package com.durga.balaji66.modalbottomsheetdialog;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ModelBottomSheetDialog extends BottomSheetDialogFragment implements View.OnClickListener{

    private TextView button;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_sheet,container,false);
        initializeViews(view);
        button.setOnClickListener(this);
        return view;
    }

    public void initializeViews(View view)
    {
     button =view.findViewById(R.id.button);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button:
                Toast.makeText(getActivity(),"hai",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
