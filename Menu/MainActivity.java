
package com.example.practical6;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.newb){
            Toast.makeText(this, "New Selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.Share){
            Toast.makeText(this, "Share Selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.delete){
            Toast.makeText(this, "Delete Selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.save){
            Toast.makeText(this, "Save Selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.search){
            Toast.makeText(this, "Search Selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.Exit){
            Toast.makeText(this, "Exit Selected", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Exit Selected", Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
        return true;
    }
}