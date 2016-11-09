package adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ody.sickslayers.databinding.ItemPersonBinding;

/**
 * Created by Ody on 09-Nov-16.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> {

    String[] _dataset = new String[]{};
    View.OnClickListener _listener;

    // Provide a suitable constructor (depends on the kind of dataset)
    public PeopleAdapter(String[] myDataset, View.OnClickListener clickListener ) {
        _dataset = myDataset;
        _listener = clickListener;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public PeopleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        ItemPersonBinding binding = ItemPersonBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(binding.getRoot());
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.binding.txtPersonName.setText(_dataset[position]);

        //When this Item is Clicked Set the Listener that was injected
        holder.binding.getRoot().setOnClickListener(_listener);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return _dataset.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemPersonBinding binding;

        public ViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.getBinding(itemView);
        }
    }
}


