package electron.jfabiant.laboratorio02;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView txtNombres, txtOcupacion, txtCelular, txtSms, txtWebsite;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Leyendo las cajas de los layouts:
        txtNombres = findViewById(R.id.textNombre);
        txtOcupacion = findViewById(R.id.txtOcupacion);
        imageView = findViewById(R.id.imageAvatar);
        txtCelular = findViewById(R.id.txtCelular);
        txtSms = findViewById(R.id.txtSms);
        txtWebsite = findViewById(R.id.txtWebsite);

        //Recibe el valor:
        Bundle bundle = getIntent().getExtras();
        String nombres = bundle.getString("nombres");
        String ocupacion = bundle.getString("ocupacion");

        //Agrega el valor a la caja de texto:
        txtNombres.setText(nombres);
        txtOcupacion.setText(ocupacion);
        if (txtNombres.getText().equals("Florentina Martinez Sanchez")) {
            imageView.setImageResource(R.drawable.img2);
            txtCelular.setText("+51 565 898 565");
            txtSms.setText("565 898 565");
            txtWebsite.setText("www.florentinamartinezsanchez.com");
        }else if (txtNombres.getText().equals("Valeria Sanchez Arias")) {
            imageView.setImageResource(R.drawable.img1);
            txtCelular.setText("+51 999 888 777");
            txtSms.setText("999 888 777");
            txtWebsite.setText("www.valeriasanchezarias.com");
        } else if (txtNombres.getText().equals("Rosario Mariana Vertigo")) {
            imageView.setImageResource(R.drawable.img3);
            txtCelular.setText("+51 666 555 444");
            txtSms.setText("666 555 444");
            txtWebsite.setText("www.rosario.com");
        } else if (txtNombres.getText().equals("Maritza Julieta Rosario")) {
            imageView.setImageResource(R.drawable.img4);
            txtCelular.setText("+51 156 156 154");
            txtSms.setText("156 156 154");
            txtWebsite.setText("wwww.maritzajulieta.com");
        } else {
            //
        }
    }

    public void funcionLlamar (View view) {
        String numero = txtCelular.getText().toString();

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+numero));
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }else {
            Toast.makeText(this, "No existe una aplicación para llamadas", Toast.LENGTH_SHORT).show();
        }

    }

    public void funcionMensaje (View view) {
        String strPhone = txtSms.getText().toString();
        String strMessage = "Escribir un mensaje ...";

        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setType("vnd.android-dir/mms-sms");
        sendIntent.putExtra("address", strPhone);
        sendIntent.putExtra("sms_body", strMessage);
        startActivity(sendIntent);
    }

    public void funcionWeb (View view) {
        String url = txtWebsite.getText().toString();
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
