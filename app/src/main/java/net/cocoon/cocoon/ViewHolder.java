package net.cocoon.cocoon;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        mView = itemView;
    }
        //set details to recycler view row
    public void setDetails(Context ctx, String image, String description){
        //Views
        TextView mDetailsTv = mView.findViewById(R.id.rDescriptionTv);
        ImageView mImageTv = mView.findViewById(R.id.rImageView);
        //set data to view

        mDetailsTv.setText(description);
        Picasso.get().load(image).into(mImageTv);

    }
}
