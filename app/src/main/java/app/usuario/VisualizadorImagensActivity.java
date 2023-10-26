package app.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class VisualizadorImagensActivity extends AppCompatActivity {

        ImageView imgfoto;
        Button btfoto1, btfoto2;
        TextView txtinformacao;

        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_visualizador_imagens);
            imgfoto = (ImageView) findViewById(R.id.imgFoto);

            btfoto1 = (Button) findViewById(R.id.btnFoto1);
            btfoto2 = (Button) findViewById(R.id.btnFoto2);
            txtinformacao = (TextView) findViewById(R.id.txtInformacao);
            btfoto1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    imgfoto.setImageResource(R.drawable.foto1);
                    txtinformacao.setText("Foto1");
                } });
            btfoto2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    imgfoto.setImageResource(R.drawable.foto2);
                    txtinformacao.setText("Foto2");

                }
            });
        }
}

