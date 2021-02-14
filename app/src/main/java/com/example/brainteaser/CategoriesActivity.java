package com.example.brainteaser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity {




    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Toolbar toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Categories");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.rv);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        List<categoryModel> list = new ArrayList<>();
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));
        list.add(new categoryModel("", "Category1"));

        CategoryAdapter adapter = new CategoryAdapter(list);
        recyclerView.setAdapter(adapter);



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()== android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}