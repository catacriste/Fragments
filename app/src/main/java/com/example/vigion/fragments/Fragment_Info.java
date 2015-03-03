package com.example.vigion.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a46485 on 03-03-2015.
 */
public class Fragment_Info extends Fragment {
    //Info f = new Info();

    private List<InfoButton> myButtons = new ArrayList<InfoButton>();

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

      /*  popularLista();
        popularListView();
        registerClickCallback();*/
        return inflater.inflate(R.layout.fragment_info, container, false);
    }
  /*  private void registerClickCallback() {
        ListView lista = (ListView)getView().findViewById(R.id.listViewInformacao);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicada, int position, long id) {
                InfoButton buttonClicado = myButtons.get(position);
                String messagem = "Ola tamos aqui na posicao: " + position
                        + " cujo coracao é " + buttonClicado.getNome();
                //Toast.makeText(Info.this, messagem, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void popularListView() {
        ArrayAdapter<InfoButton> adapter = new MyListAdapter();
        ListView lista = (ListView)getView().findViewById(R.id.listViewInformacao);
        lista.setAdapter(adapter);

    }


    private void popularLista()
    {
        myButtons.add(new InfoButton("Suporte Básico de vida",R.drawable.sbv2));
        myButtons.add(new InfoButton("VOS",R.drawable.iconvos));
        myButtons.add(new InfoButton("Compressões Torácicas",R.drawable.iconcompressoes));

    }

    private class MyListAdapter extends ArrayAdapter<InfoButton> {
        public MyListAdapter()
        {
            super( getActivity(),R.layout.item_view_xml,myButtons);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View itemView = convertView;
            if(itemView == null)
            {
                itemView = getActivity().getLayoutInflater().inflate(R.layout.item_view_xml, parent, false);
            }

            InfoButton currentInfoButton = myButtons.get(position);

            ImageView imageView = (ImageView)itemView.findViewById(R.id.item_imageID);
            imageView.setImageResource(currentInfoButton.getIconID());

            TextView textView = (TextView)itemView.findViewById(R.id.item_Name);
            textView.setText(currentInfoButton.getNome());

            return itemView;

            //return super.getView(position, convertView, parent);
        }
    }*/
}
