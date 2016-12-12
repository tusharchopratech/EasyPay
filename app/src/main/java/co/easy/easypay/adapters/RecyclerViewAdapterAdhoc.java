package co.easy.easypay.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import co.easy.easypay.R;
import co.easy.easypay.data.Data;

/**
 * Created by tc on 12/12/16.
 */

public class RecyclerViewAdapterAdhoc extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder = null;
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflate_item_adhoc, parent, false);
        holder = new AdhocViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        AdhocViewHolder adhocViewHolder = (AdhocViewHolder) holder;
        adhocViewHolder.textViewBiller.setText(Data.adhocPojoArrayList.get(position).getBiller());
        adhocViewHolder.textViewNickName.setText(Data.adhocPojoArrayList.get(position).getNickName());

    }

    @Override
    public int getItemCount() {
        return Data.adhocPojoArrayList.size();
    }

    class AdhocViewHolder extends RecyclerView.ViewHolder {

        TextView textViewBiller;
        TextView textViewNickName;

        public AdhocViewHolder(View itemView) {
            super(itemView);
            textViewBiller = (TextView) itemView.findViewById(R.id.textViewBillerId);
            textViewNickName = (TextView) itemView.findViewById(R.id.textViewNickNameId);
        }
    }

}
