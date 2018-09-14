package com.copiacs.retrofitpost;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.copiacs.retrofitpost.PostMaster.Daak.Daak;
import com.copiacs.retrofitpost.PostMaster.Daak.DaakInterface;
import com.copiacs.retrofitpost.PostMaster.Lifafa.Lifafa;
import com.copiacs.retrofitpost.PostMaster.Lifafa.TempAddPart;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roots();
            }
        });
    }
    String Success, StatusCode, ErrorMessage, PPRID, MobileStatus, list;
    TextView SuccessTextView, StatusCodeTextView, ErrorMessageTextView, PPRIDTextView, MobileStatusTextView, listTextView;
    private void initUI()
    {
        SuccessTextView=findViewById(R.id.success);
        StatusCodeTextView=findViewById(R.id.statuscode);
        ErrorMessageTextView=findViewById(R.id.errormessage);
        PPRIDTextView=findViewById(R.id.pprid);
        MobileStatusTextView=findViewById(R.id.mobilestatus);
        listTextView=findViewById(R.id.list);
    }
    List<TempAddPart> tempAddParts=new ArrayList<>();
    private void roots()
    {
        for(int i=0;i<3;i++)
        {
            tempAddParts.add(new TempAddPart("","item 0"+i,"7","3",""));
        }
        Lifafa lifafa =new Lifafa(
                "3042",
                "",
                "869",
                "8",
                "",
                "",
                "Roshan Singh is developing this api at front end and this is his test message",
                "",
                "",
                "",
                "",
                "",
                "",
                "Toothpaste",
                "9",
                "4",
                "",
                "",
                "4",
                "Roots",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "860",
                "",
                "",
                "443",
                "1",
                "48",
                "",
                "16002",
                tempAddParts);

        DaakInterface apiService= RetrofitUtils.getClient().create(DaakInterface.class);
        Call<Daak> call =apiService.getRoots(lifafa);
        call.enqueue(new Callback<Daak>() {
            @Override
            public void onResponse(Call<Daak> call, Response<Daak> response) {
                Success     =String.valueOf(response.body().getSuccess());
                StatusCode  =String.valueOf(response.body().getStatusCode());
                ErrorMessage=String.valueOf(response.body().getErrorMessage());
                PPRID       =String.valueOf(response.body().getResult().getPPRID());
                MobileStatus=String.valueOf(response.body().getResult().getMobileStatus());
                list        =String.valueOf(response.body().getResult().getList());
                Log.d("onResponse : ",Success);
                Log.d("onResponse : ",StatusCode);
                Log.d("onResponse : ",ErrorMessage);
                Log.d("onResponse : ",PPRID);
                Log.d("onResponse : ",MobileStatus);
                Log.d("onResponse : ",list);
                SuccessTextView.setText("Success : "+Success);
                StatusCodeTextView.setText("StatusCode : "+StatusCode);
                ErrorMessageTextView.setText("ErrorMessage : "+ErrorMessage);
                PPRIDTextView.setText("PPRID : "+PPRID);
                MobileStatusTextView.setText("MobileStatus : "+ MobileStatus);
                listTextView.setText("list : "+list);

            }

            @Override
            public void onFailure(Call<Daak> call, Throwable t) {
                Log.d("onFailure : ",t.getMessage());

            }
        });
    }


}
