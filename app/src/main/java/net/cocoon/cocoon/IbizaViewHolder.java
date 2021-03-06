package net.cocoon.cocoon;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class IbizaViewHolder extends RecyclerView.ViewHolder {

    View mView;

    public IbizaViewHolder(@NonNull View itemView) {
        super(itemView);
        this.mView = itemView;
    }
    //set details to recycler view row
    public void setDetails(Context ctx, String image){
        //Views
        ImageView mImageTv = mView.findViewById(R.id.iImageView);
        //set data to view
        if(image != null && !image.isEmpty() ){
            Picasso.get().load(image).into(mImageTv);
        }

    }

}
