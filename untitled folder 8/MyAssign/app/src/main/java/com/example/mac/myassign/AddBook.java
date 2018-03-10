package com.example.mac.myassign;



        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

/**
 * Created by Umer Rana on 28/10/2016.
 */
public class AddBook  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);
        Button btnNextScreen = (Button) findViewById(R.id.btnAdd_DB);
//Listening to button event
        btnNextScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                EditText bookName = (EditText) findViewById(R.id.bname);
                EditText authorName = (EditText) findViewById(R.id.Aname);
                EditText txtPrice = (EditText) findViewById(R.id.txt_price);
// Add in database
                DatabaseHandler db = new DatabaseHandler(AddBook.this);
                Log.d("Insert: ", "Inserting ..");
                db.addBook(new Book(bookName.getText().toString(),authorName.getText().toString(),txtPrice .getText().toString()));
                Toast.makeText(getApplicationContext(), "Book Added Successfully " + bookName.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

