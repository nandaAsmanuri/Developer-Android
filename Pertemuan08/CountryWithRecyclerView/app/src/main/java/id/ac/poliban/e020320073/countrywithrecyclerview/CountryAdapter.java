package id.ac.poliban.e020320073.countrywithrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {

    private final LinkedList<String> mCountryList;
    private final LayoutInflater mInflater;

    class CountryViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        public final TextView CountryItemView;
        final CountryAdapter mAdapter;

        /**
         * Creates a new custom view holder to hold the view to display in
         * the RecyclerView.
         *
         * @param itemView The view in which to display the data.
         * @param adapter The adapter that manages the the data and views
         *                for the RecyclerView.
         */
        public CountryViewHolder(View itemView, CountryAdapter adapter) {
            super(itemView);
            CountryItemView = itemView.findViewById(R.id.country);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();

            // Use that to access the affected item in mCountryList.
            String element = mCountryList.get(mPosition);
            // Change the Country in the mCountryList.

            mCountryList.set(mPosition, "Clicked! " + element);
            // Notify the adapter, that the data has changed so it can
            // update the RecyclerView to display the data.
            mAdapter.notifyDataSetChanged();
        }
    }

    public CountryAdapter(Context context, LinkedList<String> CountryList) {
        mInflater = LayoutInflater.from(context);
        this.mCountryList = CountryList;
    }

    /**
     * Called when RecyclerView needs a new ViewHolder of the given type to
     * represent an item.
     *
     * This new ViewHolder should be constructed with a new View that can
     * represent the items of the given type. You can either create a new View
     * manually or inflate it from an XML layout file.
     *
     * The new ViewHolder will be used to display items of the adapter using
     * onBindViewHolder(ViewHolder, int, List). Since it will be reused to
     * display different items in the data set, it is a good idea to cache
     * references to sub views of the View to avoid unnecessary findViewById()
     * calls.
     *
     * @param parent   The ViewGroup into which the new View will be added after
     *                 it is bound to an adapter position.
     * @param viewType The view type of the new View. @return A new ViewHolder
     *                 that holds a View of the given view type.
     */
    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent,
                                                int viewType) {
        // Inflate an item view.
        View mItemView = mInflater.inflate(
                R.layout.list_item,parent, false);
        return new CountryViewHolder(mItemView, this);
    }

    /**
     * Called by RecyclerView to display the data at the specified position.
     * This method should update the contents of the ViewHolder.itemView to
     * reflect the item at the given position.
     *
     * @param holder   The ViewHolder which should be updated to represent
     *                 the contents of the item at the given position in the
     *                 data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(CountryAdapter.CountryViewHolder holder,
                                 int position) {
        // Retrieve the data for that position.
        String mCurrent = mCountryList.get(position);
        // Add the data to the view holder.
        holder.CountryItemView.setText(mCurrent);
    }
        public int getItemCount() { return mCountryList.size();
}}