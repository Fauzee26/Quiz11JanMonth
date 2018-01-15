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
                String nMonth = etMonth.getText().toString();

                if (nMonth.equalsIgnoreCase("Januari" )) {
                    lblResult.setText("This Is First Month");
                }else if (nMonth.equalsIgnoreCase("Februari" )) {
                    lblResult.setText("This Is Second Month");
                }else if (nMonth.equalsIgnoreCase("Maret" )) {
                    lblResult.setText("This Is Third Month");
                }else if (nMonth.equalsIgnoreCase("April" )) {
                    lblResult.setText("This Is Fourth Month");
                }else if (nMonth.equalsIgnoreCase("May" )) {
                    lblResult.setText("This Is Fifth Month");
                }else if (nMonth.equalsIgnoreCase("June" )) {
                    lblResult.setText("This Is Sixth Month");
                }else if (nMonth.equalsIgnoreCase("July" )) {
                    lblResult.setText("This Is Seventh Month");
                }else if (nMonth.equalsIgnoreCase("August" )) {
                    lblResult.setText("This Is Eighth Month");
                }else if (nMonth.equalsIgnoreCase("September" )) {
                    lblResult.setText("This Is Ninth Month");
                }else if (nMonth.equalsIgnoreCase("Oktober" )) {
                    lblResult.setText("This Is Tenth Month");
                }else if (nMonth.equalsIgnoreCase("November" )) {
                    lblResult.setText("This Is Eleventh Month");
                }else if (nMonth.equalsIgnoreCase("Desember" )) {
                    lblResult.setText("This Is Twelveth Month");
                }else{
                    etMonth.setError("Your Data Is Wrong");
                }
            }
        });
    }
}
