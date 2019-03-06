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

public class FragmentA extends Fragment {
    TextView txtA;
    Button btnA;
    EditText edtA;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1,container, false);
        btnA = (Button) view.findViewById(R.id.btna);
        edtA = (EditText) view.findViewById(R.id.edta);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getActivity(), edtA.getText().toString(), Toast.LENGTH_SHORT).show();
                TextView txtM = (TextView) getActivity().findViewById(R.id.txtm);
                txtM.setText(edtA.getText().toString());

            }
        });

        return view;
    }
}
