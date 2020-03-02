package com.example.eva1_6_idioma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
implements RadioGroup.OnCheckedChangeListener{


    TextView txtVwSelIdio, txtVwNom, textView2, textView3;
    EditText edtTxtNom;
    RadioGroup rdGrpIdio;
    RadioButton rdBtnEs, rdBtnEn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwSelIdio = findViewById(R.id.txtVwSelIdio);
        txtVwNom = findViewById(R.id.txtVwNom);
        edtTxtNom = findViewById(R.id.edtTxtNom);
        rdGrpIdio = findViewById(R.id.rdGrpIdio);
        rdBtnEs = findViewById(R.id.rdBtnEs);
        rdBtnEn = findViewById(R.id.rdBtnEn);
        edtTxtNom = findViewById(R.id.edtTxtNom);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        rdGrpIdio.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.rdBtnEs){
            txtVwSelIdio.setText(R.string.idioma_es);
            rdBtnEs.setText(R.string.espanol_es);
            rdBtnEn.setText(R.string.espanol_en);
            txtVwNom.setText(R.string.espanol_es);
            textView2.setText(R.string.apellido_es);
            textView3.setText(R.string.edad_es);

        }else{
            txtVwSelIdio.setText(R.string.idioma_en);
            rdBtnEn.setText(R.string.ingles_en);
            rdBtnEs.setText(R.string.espanol_en);
            txtVwNom.setText(R.string.espanol_en);
            textView2.setText(R.string.apellido_en);
            textView3.setText(R.string.edad_en);

        }
    }
}
