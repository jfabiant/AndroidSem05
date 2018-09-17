package electron.jfabiant.laboratorio02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;

    private CircleImageView ci1;
    private CircleImageView ci2;
    private CircleImageView ci3;
    private CircleImageView ci4;

    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private TextView tv8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.txtNombres1);
        tv2 = (TextView)findViewById(R.id.txtNombres2);
        tv3 = (TextView)findViewById(R.id.txtNombres3);
        tv4 = (TextView)findViewById(R.id.txtNombres4);

        ci1 = (CircleImageView)findViewById(R.id.profile_image_1);
        ci2 = (CircleImageView)findViewById(R.id.profile_image_2);
        ci3 = (CircleImageView)findViewById(R.id.profile_image_3);
        ci4 = (CircleImageView)findViewById(R.id.profile_image_4);

        tv5 = (TextView)findViewById(R.id.txtOcupacion1);
        tv6 = (TextView)findViewById(R.id.txtOcupacion2);
        tv7 = (TextView)findViewById(R.id.txtOcupacion3);
        tv8 = (TextView)findViewById(R.id.txtOcupacion4);

    }

    public void redireccion1 (View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("nombres", tv1.getText().toString());
        intent.putExtra("ocupacion", tv5.getText().toString());
        startActivity(intent);
    }
    public void redireccion2 (View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("nombres", tv2.getText().toString());
        intent.putExtra("ocupacion", tv6.getText().toString());
        startActivity(intent);
    }
    public void redireccion3 (View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("nombres", tv3.getText().toString());
        intent.putExtra("ocupacion", tv7.getText().toString());
        startActivity(intent);
    }
    public void redireccion4 (View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("nombres", tv4.getText().toString());
        intent.putExtra("ocupacion", tv8.getText().toString());
        startActivity(intent);
    }

}
