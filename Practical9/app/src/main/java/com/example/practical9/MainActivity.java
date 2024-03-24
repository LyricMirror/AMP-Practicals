package com.example.practical9;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.database.Cursor;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DataBaseHelper myDb;
    EditText editName,editSurname,editMarks ,editTextId;
    Button btnAddData;
    Button btnviewAll;
    Button btnDelete;
    Button btnviewUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DataBaseHelper(this);
        editName = (EditText)findViewById(R.id.eText1);
        editSurname = (EditText)findViewById(R.id.eText2);
        editMarks = (EditText)findViewById(R.id.eText3);
        editTextId = (EditText)findViewById(R.id.editTextId);
        btnAddData = (Button)findViewById(R.id.btnAdd);
        btnviewAll = (Button)findViewById(R.id.btnViewAll);
        btnviewUpdate= (Button)findViewById(R.id.btnUpdate);
        btnDelete= (Button)findViewById(R.id.btnDelete);
        AddData();
        viewAll();
        UpdateData();
        DeleteData();
    }

    private void AddData() {
        btnAddData.setOnClickListener(
                v -> {
                    boolean isInserted = myDb.insertData(editName.getText().toString(),
                            editSurname.getText().toString(),
                            editMarks.getText().toString() );
                    if(isInserted)
                        Toast.makeText(MainActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                }
        );
    }

    private void viewAll() {
        btnviewAll.setOnClickListener(
                v -> {
                    Cursor res = myDb.getAllData();
                    if(res.getCount() == 0) {
                        showMessage("Error","Nothing found");
                        return;
                    }
                    StringBuilder buffer = new StringBuilder();
                    while (res.moveToNext()) {
                        buffer.append("Id :").append(res.getString(0)).append("\n");
                        buffer.append("Name :").append(res.getString(1)).append("\n");
                        buffer.append("Surname :").append(res.getString(2)).append("\n");
                        buffer.append("Marks :").append(res.getString(3)).append("\n\n");
                    }
                    showMessage("Data",buffer.toString());
                }
        );
    }

    private void UpdateData() {
        btnviewUpdate.setOnClickListener(
                v -> {
                    boolean isUpdate = myDb.updateData(editTextId.getText().toString(),
                            editName.getText().toString(),
                            editSurname.getText().toString(),editMarks.getText().toString());
                    if(isUpdate)
                        Toast.makeText(MainActivity.this,"Data Update",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this,"Data not Updated",Toast.LENGTH_LONG).show();
                }
        );
    }

    public void DeleteData() {
        btnDelete.setOnClickListener(
                v -> {
                    Integer deletedRows = myDb.deleteData(editTextId.getText().toString());
                    if(deletedRows > 0)
                        Toast.makeText(MainActivity.this,"Data Deleted",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this,"Data not Deleted",Toast.LENGTH_LONG).show();
                }
        );
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}