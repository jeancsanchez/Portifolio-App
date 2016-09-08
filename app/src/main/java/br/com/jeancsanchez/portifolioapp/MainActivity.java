package br.com.jeancsanchez.portifolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPopularMovies;
    private Button btnGoUbiquitous;
    private Button btnCapstone;
    private Button btnStockHawk;
    private Button btnBuildItBigger;
    private Button btnAppMaterial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnPopularMovies = (Button) findViewById(R.id.btnPopularMovies);
        btnGoUbiquitous = (Button) findViewById(R.id.btnGoUbiquitous);
        btnCapstone = (Button) findViewById(R.id.btnCapstone);
        btnStockHawk = (Button) findViewById(R.id.btnStockHawk);
        btnAppMaterial = (Button) findViewById(R.id.btnAppMaterial);
        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);

        addOnclickListeners();
    }

    private void addOnclickListeners() {
        btnPopularMovies.setOnClickListener(this);
        btnGoUbiquitous.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
        btnStockHawk.setOnClickListener(this);
        btnAppMaterial.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
    }


    @Override
    public void onClick(View view){
        String msg = "This button will launch my ";

        switch (view.getId()){
            case R.id.btnAppMaterial:
                msg += "Material";
                break;

            case R.id.btnBuildItBigger:
                msg += "Build It Bigger";
                break;

            case R.id.btnCapstone:
                msg += "Capstone";
                break;

            case R.id.btnGoUbiquitous:
                msg += "Go Ubiquitous";
                break;

            case R.id.btnPopularMovies:
                msg += "Popular Movies";
                break;

            case R.id.btnStockHawk:
                msg += "Stock Hawk";
                break;
        }

        Toast.makeText(this, msg + " App!", Toast.LENGTH_SHORT).show();
    }
}
