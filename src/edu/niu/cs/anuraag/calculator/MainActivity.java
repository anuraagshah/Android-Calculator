package edu.niu.cs.anuraag.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	EditText etfirst,etsecond;
	TextView tvans;
	Button btnAdd, btnSub, btnMult, btnDiv;
	double num1, num2, res_add, res_sub, res_mult, res_div;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etfirst = (EditText)findViewById(R.id.etFirst);
		etsecond = (EditText)findViewById(R.id.etSecond);
		tvans = (TextView)findViewById(R.id.tvans);
		btnAdd = (Button)findViewById(R.id.btnadd);
		btnSub = (Button)findViewById(R.id.btnsub);
		btnMult = (Button)findViewById(R.id.btnmul);
		btnDiv = (Button)findViewById(R.id.btndiv);
		
		btnDiv.setOnClickListener(new View.OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				num1 = Double.parseDouble(etfirst.getText().toString());
				num2 = Double.parseDouble(etsecond.getText().toString());
				res_div = num1/num2;
				
				tvans.setText(String.valueOf(res_div));
			}
		});
		
		
		
		
		btnSub.setOnClickListener(new View.OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				num1 = Double.parseDouble(etfirst.getText().toString());
				num2 = Double.parseDouble(etsecond.getText().toString());
				res_sub = num1-num2;
				
				tvans.setText(String.valueOf(res_sub));
			}
		});
		
		
		btnAdd.setOnClickListener(new View.OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				num1 = Double.parseDouble(etfirst.getText().toString());
				num2 = Double.parseDouble(etsecond.getText().toString());
				res_add = num1+num2;
				
				tvans.setText(String.valueOf(res_add));
			}
		});
		
		btnMult.setOnClickListener(new View.OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				num1 = Double.parseDouble(etfirst.getText().toString());
				num2 = Double.parseDouble(etsecond.getText().toString());
				res_mult = num1*num2;
				
				tvans.setText(String.valueOf(res_mult));
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
