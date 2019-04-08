package net.cocoon.cocoon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.BinderThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SvenFragment extends Fragment {

    private Button btnArtist;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

                View view = inflater.inflate(R.layout.fragment_sven, container, false);

                 TextView textView = (TextView)view.findViewById(R.id.andrefb);
                 textView.setMovementMethod(LinkMovementMethod.getInstance());
            return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnArtist = (Button)getActivity().findViewById(R.id.btnAndre);
        btnArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://one.systemonesoftware.com/webform.aspx?key=f985e5b358a849528ac828f4a6c1ce59"));
                getActivity().startActivity(i);

            }
        });

        btnArtist = (Button)getActivity().findViewById(R.id.btnDana);
        btnArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://one.systemonesoftware.com/webform.aspx?key=f985e5b358a849528ac828f4a6c1ce59"));
                getActivity().startActivity(i);

            }
        });

        btnArtist = (Button)getActivity().findViewById(R.id.btnDorian);
        btnArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://one.systemonesoftware.com/webform.aspx?key=f985e5b358a849528ac828f4a6c1ce59"));
                getActivity().startActivity(i);

            }
        });

        btnArtist = (Button)getActivity().findViewById(R.id.btnFabe);
        btnArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://one.systemonesoftware.com/webform.aspx?key=f985e5b358a849528ac828f4a6c1ce59"));
                getActivity().startActivity(i);

            }
        });

        btnArtist = (Button)getActivity().findViewById(R.id.btnGregor);
        btnArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://one.systemonesoftware.com/webform.aspx?key=f985e5b358a849528ac828f4a6c1ce59"));
                getActivity().startActivity(i);

            }
        });

        btnArtist = (Button)getActivity().findViewById(R.id.btnIlario);
        btnArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://one.systemonesoftware.com/webform.aspx?key=f985e5b358a849528ac828f4a6c1ce59"));
                getActivity().startActivity(i);

            }
        });

        btnArtist = (Button)getActivity().findViewById(R.id.btnSven);
        btnArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://one.systemonesoftware.com/webform.aspx?key=f985e5b358a849528ac828f4a6c1ce59"));
                getActivity().startActivity(i);

            }
        });

    }

}
