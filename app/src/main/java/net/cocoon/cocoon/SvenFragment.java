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

public class SvenFragment extends Fragment implements View.OnClickListener {

    private Button btnArtist;
    private Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

                View view = inflater.inflate(R.layout.fragment_sven, container, false);

        Button button1  = (Button) view.findViewById(R.id.andrefb);
        Button button2  = (Button) view.findViewById(R.id.andreig);
        Button button3  = (Button) view.findViewById(R.id.andresc);
        Button button4  = (Button) view.findViewById(R.id.danafb);
        Button button5  = (Button) view.findViewById(R.id.danaig);
        Button button6  = (Button) view.findViewById(R.id.danasc);
        Button button7  = (Button) view.findViewById(R.id.dorianfb);
        Button button8  = (Button) view.findViewById(R.id.fabefb);
        Button button9  = (Button) view.findViewById(R.id.fabeig);
        Button button10  = (Button) view.findViewById(R.id.fabesc);
        Button button11  = (Button) view.findViewById(R.id.gregfb);
        Button button12  = (Button) view.findViewById(R.id.gregig);
        Button button13  = (Button) view.findViewById(R.id.gregsc);
        Button button14  = (Button) view.findViewById(R.id.ilariofb);
        Button button15  = (Button) view.findViewById(R.id.ilarioig);
        Button button16  = (Button) view.findViewById(R.id.ilariosc);
        Button button17  = (Button) view.findViewById(R.id.svenfb);
        Button button18  = (Button) view.findViewById(R.id.svenig);
        Button button19  = (Button) view.findViewById(R.id.svendt);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);

            return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.andrefb:
                Uri uri = Uri.parse("https://www.facebook.com/AndreGalluzzi.official/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.andreig:
                Uri uri1 = Uri.parse("https://www.instagram.com/andregalluzzi_official/"); // missing 'http://' will cause crashed
                Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(intent1);
                //Do This
                break;
            case R.id.andresc:
                Uri uri2 = Uri.parse("https://soundcloud.com/andre-galluzzi"); // missing 'http://' will cause crashed
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent2);
                //Do This
                break;
            case R.id.danafb:
                Uri uri3 = Uri.parse("https://www.facebook.com/danaruh/"); // missing 'http://' will cause crashed
                Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                startActivity(intent3);
                //Do This
                break;
            case R.id.danaig:
                Uri uri4 = Uri.parse("https://www.instagram.com/danaruh/"); // missing 'http://' will cause crashed
                Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                startActivity(intent4);
                //Do This
                break;
            case R.id.danasc:
                Uri uri5 = Uri.parse("https://soundcloud.com/danaruh"); // missing 'http://' will cause crashed
                Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
                startActivity(intent5);
                //Do This
                break;
            case R.id.dorianfb:
                Uri uri6 = Uri.parse("https://www.facebook.com/Dorian-Paic-778791745523113/"); // missing 'http://' will cause crashed
                Intent intent6 = new Intent(Intent.ACTION_VIEW, uri6);
                startActivity(intent6);
                //Do This
                break;
            case R.id.fabefb:
                Uri uri7 = Uri.parse("https://www.facebook.com/fabeagain/"); // missing 'http://' will cause crashed
                Intent intent7 = new Intent(Intent.ACTION_VIEW, uri7);
                startActivity(intent7);
                //Do This
                break;
            case R.id.fabeig:
                Uri uri8 = Uri.parse("https://www.instagram.com/fabe86/"); // missing 'http://' will cause crashed
                Intent intent8 = new Intent(Intent.ACTION_VIEW, uri8);
                startActivity(intent8);
                //Do This
                break;
            case R.id.fabesc:
                Uri uri9 = Uri.parse("https://soundcloud.com/fabeagain"); // missing 'http://' will cause crashed
                Intent intent9 = new Intent(Intent.ACTION_VIEW, uri9);
                startActivity(intent9);
                //Do This
                break;
            case R.id.gregfb:
                Uri uri10 = Uri.parse("https://www.facebook.com/gregortresherofficial/"); // missing 'http://' will cause crashed
                Intent intent10 = new Intent(Intent.ACTION_VIEW, uri10);
                startActivity(intent10);
                //Do This
                break;
            case R.id.gregig:
                Uri uri11 = Uri.parse("https://www.instagram.com/gregortresher/"); // missing 'http://' will cause crashed
                Intent intent11 = new Intent(Intent.ACTION_VIEW, uri11);
                startActivity(intent11);
                //Do This
                break;
            case R.id.gregsc:
                Uri uri12 = Uri.parse("https://soundcloud.com/gregortresher"); // missing 'http://' will cause crashed
                Intent intent12 = new Intent(Intent.ACTION_VIEW, uri12);
                startActivity(intent12);
                //Do This
                break;
            case R.id.ilariofb:
                Uri uri13 = Uri.parse("https://www.facebook.com/ILARIOALICANTEOFFICIAL/"); // missing 'http://' will cause crashed
                Intent intent13 = new Intent(Intent.ACTION_VIEW, uri13);
                startActivity(intent13);
                //Do This
                break;
            case R.id.ilarioig:
                Uri uri14 = Uri.parse("https://www.instagram.com/ilario_alicante/"); // missing 'http://' will cause crashed
                Intent intent14 = new Intent(Intent.ACTION_VIEW, uri14);
                startActivity(intent14);
                //Do This
                break;
            case R.id.ilariosc:
                Uri uri15 = Uri.parse("https://soundcloud.com/ilario-alicante"); // missing 'http://' will cause crashed
                Intent intent15 = new Intent(Intent.ACTION_VIEW, uri15);
                startActivity(intent15);
                //Do This
                break;
            case R.id.svenfb:
                Uri uri16 = Uri.parse("https://www.facebook.com/SvenVaethOfficial/"); // missing 'http://' will cause crashed
                Intent intent16 = new Intent(Intent.ACTION_VIEW, uri16);
                startActivity(intent16);
                //Do This
                break;
            case R.id.svenig:
                Uri uri17 = Uri.parse("https://www.instagram.com/svenvaeth_official//"); // missing 'http://' will cause crashed
                Intent intent17 = new Intent(Intent.ACTION_VIEW, uri17);
                startActivity(intent17);
                //Do This
                break;
            case R.id.svendt:
                Uri uri18 = Uri.parse("https://www.cocoon.net/sven-vath/#events"); // missing 'http://' will cause crashed
                Intent intent18 = new Intent(Intent.ACTION_VIEW, uri18);
                startActivity(intent18);
                //Do This
                break;
        }
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
