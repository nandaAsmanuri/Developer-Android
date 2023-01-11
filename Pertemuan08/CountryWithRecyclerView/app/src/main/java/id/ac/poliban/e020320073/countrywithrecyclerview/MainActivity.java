package id.ac.poliban.e020320073.countrywithrecyclerview;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;

import id.ac.poliban.e020320073.countrywithrecyclerview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mCountryList = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private CountryAdapter mAdapter;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mCountryList.add("Indonesia");
        mCountryList.add("Brunei");
        mCountryList.add("Timor Leste");
        mCountryList.add("Nicaragua");

        // Put initial data into the Country list.


        // Create recycler view.
        mRecyclerView = findViewById(R.id.recyclerView);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new CountryAdapter(this, mCountryList);
        // Connect the adapter with the recycler view.
        mRecyclerView.setAdapter(mAdapter);
        // Give the recycler view a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(this::addCountry);
    }

    private void addCountry(View view) {
        View subView = LayoutInflater.from(this)
                .inflate(R.layout.input_country,null);
        EditText etCountry= subView.findViewById(R.id.etCountry);
        new AlertDialog.Builder(this)
                .setTitle("Your Country:")
                .setView(subView)
                .setPositiveButton("OK",(dialog, which) -> {
                    if (!etCountry.getText().toString().isEmpty()) {
                        mCountryList.add(etCountry.getText().toString());
                        mAdapter.notifyDataSetChanged();
                    }
                })
                .show();
    }

    /**
     * Inflates the menu, and adds items to the action bar if it is present.
     *
     * @param menu Menu to inflate.
     * @return Returns true if the menu inflated.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Handles app bar item clicks.
     *
     * @param item Item clicked.
     * @return True if one of the defined items was clicked.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        // This comment suppresses the Android Studio warning about simplifying
        // the return statements.
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}