package net.cocoon.cocoon;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class EventsFragment extends Fragment {
    private Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_events, container, false);
        Button btnFragment=(Button) view.findViewById(R.id.buttonPhuket);

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new EventsFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });
        return view;
    }



}
