package net.cocoon.cocoon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class IbizaFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private DatabaseReference mRef;
    private FirebaseDatabase mFirebaseDatabase;
    private FirestoreRecyclerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ibiza, container, false);

        mRecyclerView = (RecyclerView)view.findViewById(R.id.ibizaRecyclerView);

        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRef = mFirebaseDatabase.getReference("Ibiza");

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Query query = FirebaseFirestore.getInstance()
                .collection("Ibiza") //TODO: this should describe the path to your models
                .limit(50);


        FirestoreRecyclerOptions<IbizaModel> options = new FirestoreRecyclerOptions.Builder<IbizaModel>()
                .setQuery(query, IbizaModel.class)
                .build();


        adapter = new FirestoreRecyclerAdapter<IbizaModel, IbizaViewHolder>(options) {
            @NonNull
            @Override
            public IbizaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
                View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_ibiza, viewGroup, false);

                IbizaViewHolder ibizaViewHolder = new IbizaViewHolder(view);

                return ibizaViewHolder;
            }

            @Override
            protected void onBindViewHolder(@NonNull IbizaViewHolder holder, int position, @NonNull IbizaModel model) {
                holder.setDetails(getContext(), model.getImage());

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pg/COCOON.OFFICIAL/events/?ref=page_internal"));
                        startActivity(browserIntent);
                    }
                });

            }
        };


        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter.stopListening();
    }


}
