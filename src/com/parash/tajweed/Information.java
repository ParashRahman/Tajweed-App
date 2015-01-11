package com.parash.tajweed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Information extends Activity implements OnClickListener{
	
	Button bReturn;
	Button bQuiz;
	public final static String KEY = "KEY";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		int value;
		if(intent != null){
			value = intent.getIntExtra(KEY, 0);
		} else {
			value = 0;
		}
				
		switch(value){
		case 0: setContentView(R.layout.r_full_mouth); break;
		case 1: setContentView(R.layout.r_ghunnah); break;
		case 2: setContentView(R.layout.r_idghaam); break;
		case 3: setContentView(R.layout.r_ikhfa); break;
		case 4: setContentView(R.layout.r_izhaar); break;
		case 5: setContentView(R.layout.r_laam_allah); break;
		case 6: setContentView(R.layout.r_meem); break; 
		case 7: setContentView(R.layout.r_moon); break;
		case 8: setContentView(R.layout.r_mudd); break;
		case 9: setContentView(R.layout.r_qalb); break;
		case 10: setContentView(R.layout.r_qalqalah); break;
		case 11: setContentView(R.layout.r_raa); break;
		case 12: setContentView(R.layout.r_sun); break;
		case 13: setContentView(R.layout.r_waqf); break;
		default: break;
		}
		
		bReturn = (Button) findViewById(R.id.b_return);
		bQuiz = (Button) findViewById(R.id.b_quiz);
		
		bReturn.setOnClickListener(this);
		bQuiz.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Toast toast = Toast.makeText(getApplicationContext(), "Quized", Toast.LENGTH_LONG);
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.b_return: finish(); break;
		case R.id.b_quiz: toast.show(); break;
		default: break;
		}
	}
	
}
