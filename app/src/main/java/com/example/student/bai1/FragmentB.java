package com.example.student.bai1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentB extends Fragment {
    TextView txtB;
    Button btnB;
    EditText edtB;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);;

        btnB = (Button) view.findViewById(R.id.btnb);
        edtB = (EditText) view.findViewById(R.id.edtb);
        
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(getActivity(),edtB.getText(), Toast.LENGTH_SHORT).show();
                TextView txtM = (TextView) getActivity().findViewById(R.id.txtm);
                txtM.setText(edtB.getText().toString());
            }
        });
        return  view;

    }
}
