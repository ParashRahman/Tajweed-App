package com.parash.tajweed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	
	TextView[] tvs = new TextView[14];
	String[] names = {"full_mouth", "ghunnah", "idghaam", "ikhfa", "izhaar", 
			"laam_allah", "meem", "moon", "mudd", "qalb", "qalqalah", "raa",
			"sun", "waqf"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i = 0; i < tvs.length; i++){
        	int id = getResources().getIdentifier("tv_"+names[i], "id", getPackageName());
        	((TextView) findViewById(id)).setOnClickListener(this);
        }
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int num = 0;
		
		switch(v.getId()){
		case R.id.tv_full_mouth: num = 0; break;
		case R.id.tv_ghunnah: num = 1; break;
		case R.id.tv_idghaam: num = 2; break;
		case R.id.tv_ikhfa: num = 3; break;
		case R.id.tv_izhaar: num = 4; break;
		case R.id.tv_laam_allah: num = 5; break;
		case R.id.tv_meem: num = 6; break;
		case R.id.tv_moon: num = 7; break;
		case R.id.tv_mudd: num = 8; break;
		case R.id.tv_qalb: num = 9; break;
		case R.id.tv_qalqalah: num = 10; break;
		case R.id.tv_raa: num = 11; break;
		case R.id.tv_sun: num = 12; break;
		case R.id.tv_waqf: num = 13; break;
		default: break;
		}
		try{
			@SuppressWarnings("rawtypes")
			Class toClass = Class.forName("com.parash.tajweed.Information");
			Intent toIntent = new Intent(this, toClass);
			toIntent.putExtra(Information.KEY, num);
			startActivity(toIntent);
		} catch (Exception e){
			e.printStackTrace();
		}

	}
}
