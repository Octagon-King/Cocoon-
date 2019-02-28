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

public class EventsFragment extends Fragment implements View.OnClickListener {
    private Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_events, container, false);
        Button btnFragment0 = (Button) view.findViewById(R.id.buttonBeirut);
        Button btnFragment2 = (Button) view.findViewById(R.id.buttonBarcelona);
        Button btnFragment3 = (Button) view.findViewById(R.id.buttonNewYork);
        Button btnFragment4 = (Button) view.findViewById(R.id.buttonLondon);
        Button btnFragment5 = (Button) view.findViewById(R.id.buttonMadrid);
        Button btnFragment6 = (Button) view.findViewById(R.id.buttonAugsburg);
        Button btnFragment7 = (Button) view.findViewById(R.id.buttonMdrnty);
        Button btnFragment8 = (Button) view.findViewById(R.id.buttonCordoba);
        Button btnFragment9 = (Button) view.findViewById(R.id.buttonMontevideo);
        Button btnFragment10 = (Button) view.findViewById(R.id.buttonPrague);
        Button btnFragment11 = (Button) view.findViewById(R.id.buttonCocoonInThePark);
        Button btnFragment12 = (Button) view.findViewById(R.id.buttonMiami);
        Button btnFragment13 = (Button) view.findViewById(R.id.buttonBudapest);
        Button btnFragment14 = (Button) view.findViewById(R.id.buttonAmman);



        btnFragment0.setOnClickListener(this);
        btnFragment2.setOnClickListener(this);
        btnFragment3.setOnClickListener(this);
        btnFragment4.setOnClickListener(this);
        btnFragment5.setOnClickListener(this);
        btnFragment6.setOnClickListener(this);
        btnFragment7.setOnClickListener(this);
        btnFragment8.setOnClickListener(this);
        btnFragment9.setOnClickListener(this);
        btnFragment10.setOnClickListener(this);
        btnFragment11.setOnClickListener(this);
        btnFragment12.setOnClickListener(this);
        btnFragment13.setOnClickListener(this);
        btnFragment14.setOnClickListener(this);


        return view;
    }


    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.buttonBarcelona:
                fragment = new EventBarcelonaFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonNewYork:
                fragment = new EventNewyorkFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonLondon:
                fragment = new EventLondonFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonMiami:
                fragment = new EventMiamiFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonMadrid:
                fragment = new EventMadridFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonAugsburg:
                fragment = new EventAugsburgFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonMdrnty:
                fragment = new EventMdrntyFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonCordoba:
                fragment = new EventCordobaFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonMontevideo:
                fragment = new EventMontevideoFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonPrague:
                fragment = new EventsPragueFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonCocoonInThePark:
                fragment = new EventCocoonInTheParkFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonBeirut:
                fragment = new EventBeirutFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonBudapest:
                fragment = new EventBudapestFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonAmman:
                fragment = new EventAmmanFragment();
                replaceFragment(fragment);
                break;

        }
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
