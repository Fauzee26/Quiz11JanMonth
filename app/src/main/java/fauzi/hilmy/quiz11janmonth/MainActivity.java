package fauzi.hilmy.quiz11janmonth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etMonth;
    Button btnResult;
    TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMonth = (EditText)findViewById(R.id.etMonth);
        btnResult = (Button)findViewById(R.id.btnResult);
        lblResult = (TextView)findViewById(R.id.lblResult);

        //aksi ketika button di klik
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget editText dan memasukkan ke nilai string
                String nMonth = etMonth.getText().toString();

                //mengecek apakah editText kosong
                //kondisi ketika panjangnya kosong
                if (nMonth.equalsIgnoreCase("Januari" )) {
                    //memberi warning berupa error
                    lblResult.setText("This Is First Month");
                }else if (nMonth.equalsIgnoreCase("Februari" )) {
                    //memberi warning berupa error
                    lblResult.setText("This Is Second Month");
                }else if (nMonth.equalsIgnoreCase("Maret" )) {
                    //memberi warning berupa error
                    lblResult.setText("This Is Third Month");
                }else if (nMonth.equalsIgnoreCase("April" )) {
                    //memberi warning berupa error
                    lblResult.setText("This Is Fourth Month");
                }else if (nMonth.equalsIgnoreCase("May" )) {
                    //memberi warning berupa error
                    lblResult.setText("This Is Fifth Month");
                }else if (nMonth.equalsIgnoreCase("June" )) {
                    //memberi warning berupa error
                    lblResult.setText("This Is Sixth Month");
                }else if (nMonth.equalsIgnoreCase("July" )) {
                    //memberi warning berupa error
                    lblResult.setText("This Is Seventh Month");
                }else if (nMonth.equalsIgnoreCase("August" )) {
                    //memberi warning berupa error
                    lblResult.setText("This Is Eighth Month");
                }else if (nMonth.equalsIgnoreCase("September" )) {
                    //memberi warning berupa error
                    lblResult.setText("This Is Ninth Month");
                }else if (nMonth.equalsIgnoreCase("Oktober" )) {
                    //memberi warning berupa error
                    lblResult.setText("This Is Tenth Month");
                }else if (nMonth.equalsIgnoreCase("November" )) {
                    //memberi warning berupa error
                    lblResult.setText("This Is Eleventh Month");
                }else if (nMonth.equalsIgnoreCase("Desember" )) {
                    //memberi warning berupa error
                    lblResult.setText("This Is Twelveth Month");
                }else{
                    //mengubah nilai dari string k integer
                    etMonth.setError("Your Data Is Wrong");
                }
            }
        });
    }
}
