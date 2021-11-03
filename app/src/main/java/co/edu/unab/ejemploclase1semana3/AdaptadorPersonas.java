package co.edu.unab.ejemploclase1semana3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import co.edu.unab.ejemploclase1semana3.modelos.Persona;

public class AdaptadorPersonas extends BaseAdapter {

    private final ArrayList<Persona> personas;
    private Context contexto;
    private int layout;
    private ArrayList<Persona> Personas;

    public AdaptadorPersonas(Context contexto, int layout, ArrayList<Persona> personas){
        this.contexto=contexto;
        this.layout=layout;
        this.personas=personas;
    }

    @Override
    public int getCount() {
        return personas.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int posicion, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(contexto);

        View vistaItem = inflater.inflate(layout, null);
        Persona persona = personas.get(posicion);

        TextView textViewNombre = vistaItem.findViewById(R.id.textViewNombre);
        textViewNombre.setText(persona.getNombre());

        TextView textViewApellido = vistaItem.findViewById(R.id.textViewApellido);
        textViewApellido.setText(persona.getApellido());
        return vistaItem;
    }
}
