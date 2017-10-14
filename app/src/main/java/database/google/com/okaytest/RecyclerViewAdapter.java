package database.google.com.okaytest;

/**
 * Created by ray on 10/14/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.NativeExpressAdView;
import com.squareup.picasso.Picasso;


import java.util.List;

/**
 * Created by tecstaff on 10/09/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int ITEM_VIEW_TYPE = 0;
    private static final int AD_VIEW_TYPE = 1;


    Context mContext;

    // The list of Native ads and recylcerview items.
    private final List<Object> mRecyclerViewItems;

    public RecyclerViewAdapter(Context context, List<Object> recyclerViewItems) {

        this.mContext = context;
        this.mRecyclerViewItems = recyclerViewItems;
    }

    //ViewHolder for binding User view
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView userName;
        public TextView userDetails;
        public ImageView userPic;

        public MyViewHolder(View view) {
            super(view);
            userName = (TextView) view.findViewById(R.id.userName);
            userDetails = (TextView) view.findViewById(R.id.userDetails);
            userPic = (ImageView) view.findViewById(R.id.userProfile);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position==0) {
                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.bdjobs.app&hl=en"));
                mContext.startActivity(link);
            }

            else if(position==1){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.careerguidebd.jobcircular&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==2){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.sobkhobor.govjob&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==3){
                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.dot.matrix.govtjobs&hl=en"));
                mContext.startActivity(link);

            }
            else if(position==4){
                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.bd.main.bdjs&hl=en"));
                mContext.startActivity(link);

            }
            else if(position==5){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.mangopeople.jobbangladesh&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==6){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.ejibikadishari.apps&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==7){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.powergroupbd.chakrionline&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==8){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.abirmilon.weeklyjob&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==9){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.andromo.dev308822.app490179&hl=en"));
                mContext.startActivity(link);
            }
            else if (position==10){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.designdew.job.bangladesh&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==11){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.imabuilder.rkrbd.chakrirkhabar&hl=en"));
                mContext.startActivity(link);
            }

            else if(position==12){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.andromo.dev308822.app490179&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==13){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.saimonabir.bdjobspapers&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==14){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=chakrir.khobor.bd&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==15){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.nahian.chakri&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==16){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.InnovativeBanglaApps.ChakrirJonnoJobsCare&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==17){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.atompro.allbdjobnews&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==18){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.nameless.jobsinbd&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==19){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.kajerbazar.amitapk&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==20){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.devbd.bdjobs&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==21){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.atompro.allbdjobnews&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==22){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.mobincube.chakri.sc_H2VSMG&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==23){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.bestbangla.jobs_in_bangladesh&hl=en"));
                mContext.startActivity(link);
            }


            else if(position==24){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.nahian.chakri&hl=en"));
                mContext.startActivity(link);
            }

            else if(position==25){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.holo.online_income&hl=en"));
                mContext.startActivity(link);
            }

            else if(position==26){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=bangla.newspaper.bd&hl=en"));
                mContext.startActivity(link);
            }

            else if(position==27){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.isofttech.bd.isoftjobs&hl=en"));
                mContext.startActivity(link);
            }

            else if(position==28){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.imabuilder.rkrbd.chakrirkhabar&hl=en"));
                mContext.startActivity(link);
            }

            else if(position==29){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.mcc.bdjobs&hl=en"));
                mContext.startActivity(link);
            }


            else if(position==30){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.mangopeople.jobbangladesh&hl=en"));
                mContext.startActivity(link);
            }

            else if(position==31){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.abrapps.bdgovtjobsfree&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==32){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.alhikmah.chakrirkobor&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==33){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=apps.dev.bdjobsites&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==34){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.jora.android&hl=en"));
                mContext.startActivity(link);
            }
            else if(position==35){

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.abirsaimon.bdjobs2study&hl=en"));
                mContext.startActivity(link);
            }

            else {

                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.abirmilon.topbdjobscircular&hl=en"));
                mContext.startActivity(link);
            }

        }
    }

    //ViewHolder for binding ad view
    public class NativeExpressAdViewHolder extends RecyclerView.ViewHolder {

        public NativeExpressAdViewHolder(View itemView) {
            super(itemView);
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //inflates adview or simple item view depending on the position of view
        switch (viewType) {

            case ITEM_VIEW_TYPE:
                View itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.row_item_user, parent, false);
                return new MyViewHolder(itemView);

            case AD_VIEW_TYPE:
            default:
                View nativeExpressLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.native_ad_row_type, parent, false);
                return new NativeExpressAdViewHolder(nativeExpressLayoutView);


        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        int viewType = getItemViewType(position);

        switch (viewType) {

            case ITEM_VIEW_TYPE:

                MyViewHolder myViewHolder = (MyViewHolder) holder;
                final User user = (User) mRecyclerViewItems.get(position);

                //set name and detail of user
                myViewHolder.userName.setText(user.getName());
                myViewHolder.userDetails.setText(user.getDetails());

                //set the photo of user
                Picasso.with(((MyViewHolder) holder).userPic.getContext()).load(user.getImageId()).into(myViewHolder.userPic);


                break;

            case AD_VIEW_TYPE:
            default:
                NativeExpressAdViewHolder nativeExpressHolder = (NativeExpressAdViewHolder) holder;
                NativeExpressAdView adView = (NativeExpressAdView) mRecyclerViewItems.get(position);
                ViewGroup adCardView = (ViewGroup) nativeExpressHolder.itemView;
                adCardView.removeAllViews();

                if (adCardView.getChildCount() > 0) {
                    adCardView.removeAllViews();
                }
                if (adView.getParent() != null) {
                    ((ViewGroup) adView.getParent()).removeView(adView);
                }

                adCardView.addView(adView);

        }
    }

    @Override
    public int getItemCount() {
        return mRecyclerViewItems.size();
    }

    @Override
    public int getItemViewType(int position) {

        //the number 4 indicates that ad will be shown at every 4th position.
        // You can change it to whatever you like but also make sure to change it in your activity

        return (position % 4 == 0) ? AD_VIEW_TYPE : ITEM_VIEW_TYPE;
    }
}