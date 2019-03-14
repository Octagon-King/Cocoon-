package net.cocoon.cocoon;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ShopFragment extends Fragment {

    private Dialog WebDialog1, WebDialog2;
    private WebView amazon, bandcamp;
    private Button btnAmazon, btnBand;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_shop, container, false);

        btnAmazon = (Button) rootView.findViewById(R.id.btnAmazon);
        btnAmazon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                WebDialog1 = new Dialog(getActivity());
                WebDialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);
                WebDialog1.setContentView(R.layout.web_layout);
                WebDialog1.setCancelable(true);

                amazon = (WebView) WebDialog1.findViewById(R.id.amazon);
                amazon.setWebViewClient(new WebViewClient());
                amazon.setScrollbarFadingEnabled(true);
                amazon.setHorizontalScrollBarEnabled(false);
                amazon.getSettings().setJavaScriptEnabled(true);
                amazon.getSettings().setUserAgentString("First Webview");
                amazon.loadUrl("https://www.amazon.de/s/ref=nb_sb_noss?__mk_de_DE=%C3%85M%C3%85%C5%BD%C3%95%C3%91&url=search-alias%3Daps&field-keywords=cocoon+official&rh=i%3Aaps%2Ck%3Acocoon+official");

                WebDialog1.show();
            }

            btnBand =(Button)rootView.findViewById(R.id.btnBand);
            btnBand.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick (View v){
                    WebDialog2 = new Dialog(getActivity());
                    WebDialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    WebDialog2.setContentView(R.layout.web_layout);
                    WebDialog2.setCancelable(true);

                    bandcamp = (WebView) WebDialog2.findViewById(R.id.bandcamp);
                    bandcamp.setWebViewClient(new WebViewClient());
                    bandcamp.setScrollbarFadingEnabled(true);
                    bandcamp.setHorizontalScrollBarEnabled(false);
                    bandcamp.getSettings().setJavaScriptEnabled(true);
                    bandcamp.getSettings().setUserAgentString("Second Webview");
                    bandcamp.loadUrl("https://cocoonrecordings.bandcamp.com");

                    WebDialog2.show();
                }

            }


        });

        return rootView;

}
