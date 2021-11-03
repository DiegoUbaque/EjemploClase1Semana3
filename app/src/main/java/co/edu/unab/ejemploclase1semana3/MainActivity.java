package co.edu.unab.ejemploclase1semana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.unab.ejemploclase1semana3.modelos.Persona;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        ArrayList<Persona> nombres = new ArrayList<Persona>();
        nombres.add(new Persona("juan", "Arteaga",3012345678L));
        nombres.add(new Persona("Pedro", "Gonzalez",3012345678L));
        nombres.add(new Persona("Lucas", "Martinez",3012345678L));
        nombres.add(new Persona("Marcos", "Gracia",3012345678L));
        nombres.add(new Persona("Andres", "Sanchez",3012345678L));

        AdaptadorPersonas adaptadorListaContactos = new AdaptadorPersonas( this, R.layout.layout_para_item, nombres);



        ListView listaContactos = (ListView) findViewById(R.id.listViewContactos);
        listaContactos.setAdapter(adaptadorListaContactos);

        listaContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l){
                long telefono = nombres.get(i).getTelefono();
                llamarContacto(telefono);

            }
        });

    }

    private void llamarContacto(Long telefono){
        Uri telefonoUri = Uri.parse("tel:"+telefono);
        Intent intent = new Intent(Intent.ACTION_DIAL, telefonoUri);
        startActivity(intent);
    }
}