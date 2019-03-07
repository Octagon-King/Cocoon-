package net.cocoon.cocoon;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class NewsletterFragment extends Fragment {




    private RecyclerView mRecyclerView;
    private DatabaseReference mRef;
    private FirebaseDatabase mFirebaseDatabase;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_newsletter, container, false);
        getActivity().setTitle("NewsFeed");

        mRecyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);

        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
                layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRef = mFirebaseDatabase.getReference("Data");


        return view;

    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Model, ViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Model, ViewHolder>(
                        Model.class,
                        R.layout.row,
                        ViewHolder.class,
                        mRef
                ) {
            @Override
            protected void populateViewHolder(ViewHolder viewHolder, Model model, final int position) {

                viewHolder.setDetails(getContext(),model.getImage(),model.getDescription());
                
            }
        };

        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}

