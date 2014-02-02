package blogspot.destinationengineering.TimeTable;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.Toast;

public class TimeTableActivity extends Activity implements OnItemSelectedListener {
	String Tday;
	TextView dis1,dis2,dis3,dis4,dis5,dis6,dis7,dis8,dis9,dis10,dis11;
	EditText tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv0;
	String[] items = { "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
	Spinner spinner;
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.calc_menu, menu);
		return true;
	}
	
	
	
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
	switch(item.getItemId())
	{
	
	
	case R.id.OV:
		Intent OV = new Intent(this,OverView.class); 
		startActivity(OV);
		break;
	
	case R.id.share:
		 Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
         emailIntent.setType("text/plain");
         emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Hey listen,this app is just cool");
         emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,"I just downloaded a Lecture scheduler app and felt like sharing with you!\nCheck out Lecture scheduler by SPIDER on Play Store!");
         startActivity(emailIntent);
	}
	return false;
	}

	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	spinner = (Spinner) findViewById(R.id.spinner1);
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TabHost th = (TabHost) findViewById(R.id.tabhost);
        th.setup();
        TabSpec specs = th.newTabSpec("tag1");
        specs.setContent(R.id.tab1);
        specs.setIndicator("Time Table");
        th.addTab(specs);
        specs = th.newTabSpec("tag2");
        specs.setContent(R.id.tab2);
        specs.setIndicator("Edit Schedule");
        th.addTab(specs);
        
        
        tv1 = (EditText) findViewById(R.id.slot1);
        tv2 = (EditText) findViewById(R.id.slot2);
        tv3 = (EditText) findViewById(R.id.slot3);
        tv4 = (EditText) findViewById(R.id.slot4);
        tv5 = (EditText) findViewById(R.id.slot5);
        tv6 = (EditText) findViewById(R.id.slot6);
        tv7 = (EditText) findViewById(R.id.slot7);
        tv8 = (EditText) findViewById(R.id.slot8);
        tv9 = (EditText) findViewById(R.id.slot9);
        tv10 = (EditText) findViewById(R.id.slot10);
        tv0 = (EditText) findViewById(R.id.day);
		
        dis1 = (TextView) findViewById(R.id.dis1);
        dis2 = (TextView) findViewById(R.id.dis2);
        dis3 = (TextView) findViewById(R.id.dis3);
        dis4 = (TextView) findViewById(R.id.dis4);
        dis5 = (TextView) findViewById(R.id.dis5);
        dis6 = (TextView) findViewById(R.id.dis6);
        dis7 = (TextView) findViewById(R.id.dis7);
        dis8 = (TextView) findViewById(R.id.dis8);
        dis9 = (TextView) findViewById(R.id.dis9);
        dis10 = (TextView) findViewById(R.id.dis10);
        dis11 = (TextView) findViewById(R.id.dis11);
        
        try{
        DataBase info = new DataBase(this);
		info.open();
		String slot1data = info.getData1();
		String slot2data = info.getData2();
		String slot3data = info.getData3();
		String slot4data = info.getData4();
		String slot5data = info.getData5();
		String slot6data = info.getData6();
		String slot7data = info.getData7();
		String slot8data = info.getData8();
		String slot9data = info.getData9();
		String slot10data = info.getData10();
		info.close();
		
		if(slot1data.equals("SLOT 1 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot2data.equals("SLOT 2 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot3data.equals("SLOT 3 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot4data.equals("SLOT 4 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot5data.equals("SLOT 5 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot6data.equals("SLOT 6 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot7data.equals("SLOT 7 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot8data.equals("SLOT 8 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot9data.equals("SLOT 9 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot10data.equals("SLOT 10 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
			dis11.setText("SLOTS \n\n No data\n\n No data\n\n No data\n\n No data\n\n No data\n\n No data");
		}else{
			dis11.setVisibility(View.GONE);
		}
		
		if(slot1data.equals("SLOT 1 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
		dis1.setVisibility(View.GONE);	
		}else{
		dis1.setText(slot1data);	
		}
		if(slot2data.equals("SLOT 2 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
			dis2.setVisibility(View.GONE);	
			}else{
				dis2.setText(slot2data);	
			}
		if(slot3data.equals("SLOT 3 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
			dis3.setVisibility(View.GONE);	
			}else{
				dis3.setText(slot3data);	
			}
		if(slot4data.equals("SLOT 4 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
			dis4.setVisibility(View.GONE);	
			}else{
				dis4.setText(slot4data);	
			}
		if(slot5data.equals("SLOT 5 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
			dis5.setVisibility(View.GONE);	
			}else{
				dis5.setText(slot5data);	
			}
		if(slot6data.equals("SLOT 6 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
			dis6.setVisibility(View.GONE);	
			}else{
				dis6.setText(slot6data);	
			}
		if(slot7data.equals("SLOT 7 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
			dis7.setVisibility(View.GONE);	
			}else{
				dis7.setText(slot7data);	
			}
		if(slot8data.equals("SLOT 8 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
			dis8.setVisibility(View.GONE);	
			}else{
				dis8.setText(slot8data);	
			}
		if(slot9data.equals("SLOT 9 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
			dis9.setVisibility(View.GONE);	
			}else{
				dis9.setText(slot9data);	
			}
		if(slot10data.equals("SLOT 10 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
			dis10.setVisibility(View.GONE);	
			}else{
				dis10.setText(slot10data);	
			}
        }catch(Exception e){	Toast.makeText(this, "FAILED to generate the TIME TABLE ,exit and try again",Toast.LENGTH_SHORT).show();
		}
		spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adap = new ArrayAdapter<String>(TimeTableActivity.this,android.R.layout.simple_spinner_dropdown_item,items);
        spinner.setAdapter(adap);
        spinner.setOnItemSelectedListener(this);
        }

	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		try{
		
		int position = spinner.getSelectedItemPosition();
		switch(position){
		case 0:
			DataBase db = new DataBase(this);
    		db.open();
    		String day = db.getDay((long)1);
    		String s1 = db.getS1((long)1);
    		String s2 = db.getS2((long)1);
    		String s3 = db.getS3((long)1);
    		String s4 = db.getS4((long)1);
    		String s5 = db.getS5((long)1);
    		String s6 = db.getS6((long)1);
    		String s7 = db.getS7((long)1);
    		String s8 = db.getS8((long)1);
    		String s9 = db.getS9((long)1);
    		String s10 = db.getS10((long)1);
    		db.close();
    		tv0.setText(day);
    		tv1.setText(s1);
    		tv2.setText(s2);
    		tv3.setText(s3);
    		tv4.setText(s4);
    		tv5.setText(s5);
    		tv6.setText(s6);
    		tv7.setText(s7);
    		tv8.setText(s8);
    		tv9.setText(s9);
    		tv10.setText(s10);
    		
			break;
		case 1:
			DataBase db1 = new DataBase(this);
    		db1.open();
    		String day1 = db1.getDay(2);
    		String s11 = db1.getS1(2);
    		String s21 = db1.getS2(2);
    		String s31 = db1.getS3(2);
    		String s41 = db1.getS4(2);
    		String s51 = db1.getS5(2);
    		String s61 = db1.getS6(2);
    		String s71 = db1.getS7(2);
    		String s81 = db1.getS8(2);
    		String s91 = db1.getS9(2);
    		String s101 = db1.getS10(2);
    		db1.close();
    		tv0.setText(day1);
    		tv1.setText(s11);
    		tv2.setText(s21);
    		tv3.setText(s31);
    		tv4.setText(s41);
    		tv5.setText(s51);
    		tv6.setText(s61);
    		tv7.setText(s71);
    		tv8.setText(s81);
    		tv9.setText(s91);
    		tv10.setText(s101);
    		
			break;
		case 2:
			DataBase db11 = new DataBase(this);
    		db11.open();
    		String day11 = db11.getDay(3);
    		String s111 = db11.getS1(3);
    		String s211 = db11.getS2(3);
    		String s311 = db11.getS3(3);
    		String s411 = db11.getS4(3);
    		String s511 = db11.getS5(3);
    		String s611 = db11.getS6(3);
    		String s711 = db11.getS7(3);
    		String s811 = db11.getS8(3);
    		String s911 = db11.getS9(3);
    		String s1011 = db11.getS10(3);
    		db11.close();
    		tv0.setText(day11);
    		tv1.setText(s111);
    		tv2.setText(s211);
    		tv3.setText(s311);
    		tv4.setText(s411);
    		tv5.setText(s511);
    		tv6.setText(s611);
    		tv7.setText(s711);
    		tv8.setText(s811);
    		tv9.setText(s911);
    		tv10.setText(s1011);
    		break;
		case 3:
			DataBase db111 = new DataBase(this);
    		db111.open();
    		String day112 = db111.getDay(4);
    		String s112 = db111.getS1(4);
    		String s212 = db111.getS2(4);
    		String s312 = db111.getS3(4);
    		String s412 = db111.getS4(4);
    		String s512 = db111.getS5(4);
    		String s612 = db111.getS6(4);
    		String s712 = db111.getS7(4);
    		String s812 = db111.getS8(4);
    		String s912 = db111.getS9(4);
    		String s1012 = db111.getS10(4);
    		db111.close();
    		tv0.setText(day112);
    		tv1.setText(s112);
    		tv2.setText(s212);
    		tv3.setText(s312);
    		tv4.setText(s412);
    		tv5.setText(s512);
    		tv6.setText(s612);
    		tv7.setText(s712);
    		tv8.setText(s812);
    		tv9.setText(s912);
    		tv10.setText(s1012);
    		break;
		case 4:
			DataBase db1111 = new DataBase(this);
    		db1111.open();
    		String day1121 = db1111.getDay(5);
    		String s1121 = db1111.getS1(5);
    		String s2121 = db1111.getS2(5);
    		String s3121 = db1111.getS3(5);
    		String s4121 = db1111.getS4(5);
    		String s5121 = db1111.getS5(5);
    		String s6121 = db1111.getS6(5);
    		String s7121 = db1111.getS7(5);
    		String s8121 = db1111.getS8(5);
    		String s9121 = db1111.getS9(5);
    		String s10121 = db1111.getS10(5);
    		db1111.close();
    		tv0.setText(day1121);
    		tv1.setText(s1121);
    		tv2.setText(s2121);
    		tv3.setText(s3121);
    		tv4.setText(s4121);
    		tv5.setText(s5121);
    		tv6.setText(s6121);
    		tv7.setText(s7121);
    		tv8.setText(s8121);
    		tv9.setText(s9121);
    		tv10.setText(s10121);
    		break;
		case 5:
			DataBase db11111 = new DataBase(this);
    		db11111.open();
    		String day11211 = db11111.getDay(6);
    		String s11211 = db11111.getS1(6);
    		String s21211 = db11111.getS2(6);
    		String s31211 = db11111.getS3(6);
    		String s41211 = db11111.getS4(6);
    		String s51211 = db11111.getS5(6);
    		String s61211 = db11111.getS6(6);
    		String s71211 = db11111.getS7(6);
    		String s81211 = db11111.getS8(6);
    		String s91211 = db11111.getS9(6);
    		String s101211 = db11111.getS10(6);
    		db11111.close();
    		tv0.setText(day11211);
    		tv1.setText(s11211);
    		tv2.setText(s21211);
    		tv3.setText(s31211);
    		tv4.setText(s41211);
    		tv5.setText(s51211);
    		tv6.setText(s61211);
    		tv7.setText(s71211);
    		tv8.setText(s81211);
    		tv9.setText(s91211);
    		tv10.setText(s101211);
    		break;
		}}catch(Exception e){
			Toast.makeText(this, "SPINNER FAILED to fetch data, choose day again",Toast.LENGTH_SHORT).show();
			tv0.setText("Day not selected");
		}
		
	}

	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void update(View view){
		
		try{
		switch(view.getId()){
		case R.id.update:
			
			
			
			Tday = tv0.getText().toString();
			String sl1 = tv1.getText().toString();
			String sl2 = tv2.getText().toString();
			String sl3 = tv3.getText().toString();
			String sl4 = tv4.getText().toString();
			String sl5 = tv5.getText().toString();
			String sl6 = tv6.getText().toString();
			String sl7 = tv7.getText().toString();
			String sl8 = tv8.getText().toString();
			String sl9 = tv9.getText().toString();
			String sl10 = tv10.getText().toString();
			
			
			
			if(Tday.equals("MONDAY")){
				
				
				DataBase edb1 = new DataBase(this);
				edb1.open();
	    		edb1.editEntry(1,Tday,sl1,sl2,sl3,sl4,sl5,sl6,sl7,sl8,sl9,sl10);
	    		edb1.close();  		
	    		
			}
			if(Tday.equals("TUESDAY")){
				
				DataBase edb2 = new DataBase(this);
				edb2.open();
	    		edb2.editEntry(2,Tday,sl1,sl2,sl3,sl4,sl5,sl6,sl7,sl8,sl9,sl10);
	    		edb2.close();  		
	    		
			}
			if(Tday.equals("WEDNESDAY")){
				DataBase edb3 = new DataBase(this);
				edb3.open();
	    		edb3.editEntry(3,Tday,sl1,sl2,sl3,sl4,sl5,sl6,sl7,sl8,sl9,sl10);
	    		edb3.close();  		
	    		
			}
			if(Tday.equals("THURSDAY")){
				DataBase edb4 = new DataBase(this);
				edb4.open();
	    		edb4.editEntry(4,Tday,sl1,sl2,sl3,sl4,sl5,sl6,sl7,sl8,sl9,sl10);
	    		edb4.close();  		
	    		
			}
			if(Tday.equals("FRIDAY")){
				DataBase edb5 = new DataBase(this);
				edb5.open();
	    		edb5.editEntry(5,Tday,sl1,sl2,sl3,sl4,sl5,sl6,sl7,sl8,sl9,sl10);
	    		edb5.close();  		
	    		
			}
			if(Tday.equals("SATURDAY")){
				DataBase edb6 = new DataBase(this);
				edb6.open();
	    		edb6.editEntry(6,Tday,sl1,sl2,sl3,sl4,sl5,sl6,sl7,sl8,sl9,sl10);
	    		edb6.close();  		
	    		
			}
						
			
			DataBase infoUp = new DataBase(this);
			infoUp.open();
			String slot1data1 = infoUp.getData1();
			String slot2data1 = infoUp.getData2();
			String slot3data1 = infoUp.getData3();
			String slot4data1 = infoUp.getData4();
			String slot5data1 = infoUp.getData5();
			String slot6data1 = infoUp.getData6();
			String slot7data1 = infoUp.getData7();
			String slot8data1 = infoUp.getData8();
			String slot9data1 = infoUp.getData9();
			String slot10data1 = infoUp.getData10();
			infoUp.close();
			
			if(slot1data1.equals("SLOT 1 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot2data1.equals("SLOT 2 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot3data1.equals("SLOT 3 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot4data1.equals("SLOT 4 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot5data1.equals("SLOT 5 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot6data1.equals("SLOT 6 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot7data1.equals("SLOT 7 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot8data1.equals("SLOT 8 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot9data1.equals("SLOT 9 \n\n\n\n\n\n\n\n\n\n\n\n\n") && slot10data1.equals("SLOT 10 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
				dis11.setText("SLOTS \n\n No data\n\n No data\n\n No data\n\n No data\n\n No data\n\n No data");
			}else{
				dis11.setVisibility(View.GONE);
			}
			
			if(slot1data1.equals("SLOT 1 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
				dis1.setVisibility(View.GONE);	
				}else{
					dis1.setVisibility(View.VISIBLE);	
					dis1.setText(slot1data1);	
				}
				if(slot2data1.equals("SLOT 2 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
					dis2.setVisibility(View.GONE);	
					}else{
						dis2.setVisibility(View.VISIBLE);	
							dis2.setText(slot2data1);	
					}
				if(slot3data1.equals("SLOT 3 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
					dis3.setVisibility(View.GONE);	
					}else{
						dis3.setVisibility(View.VISIBLE);	
						dis3.setText(slot3data1);	
					}
				if(slot4data1.equals("SLOT 4 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
					dis4.setVisibility(View.GONE);	
					}else{
						dis4.setVisibility(View.VISIBLE);	
						dis4.setText(slot4data1);	
					}
				if(slot5data1.equals("SLOT 5 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
					dis5.setVisibility(View.GONE);	
					}else{
						dis5.setVisibility(View.VISIBLE);	
						dis5.setText(slot5data1);	
					}
				if(slot6data1.equals("SLOT 6 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
					dis6.setVisibility(View.GONE);	
					}else{
						dis6.setVisibility(View.VISIBLE);	
						dis6.setText(slot6data1);	
					}
				if(slot7data1.equals("SLOT 7 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
					dis7.setVisibility(View.GONE);	
					}else{
						dis7.setVisibility(View.VISIBLE);	
						dis7.setText(slot7data1);	
					}
				if(slot8data1.equals("SLOT 8 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
					dis8.setVisibility(View.GONE);	
					}else{
						dis8.setVisibility(View.VISIBLE);	
						dis8.setText(slot8data1);	
					}
				if(slot9data1.equals("SLOT 9 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
					dis9.setVisibility(View.GONE);	
					}else{
						dis9.setVisibility(View.VISIBLE);	
						dis9.setText(slot9data1);	
					}
				if(slot10data1.equals("SLOT 10 \n\n\n\n\n\n\n\n\n\n\n\n\n")){
					dis10.setVisibility(View.GONE);	
					}else{
						dis10.setVisibility(View.VISIBLE);	
						dis10.setText(slot10data1);	
					}
			break;
			
			
			
		}
		
		if(Tday.equals("Day not selected")){
			Toast.makeText(this, "DAY NOT CHOSEN",Toast.LENGTH_SHORT).show();
				
		}
		else{
		Toast.makeText(this, "TIME TABLE updated!",Toast.LENGTH_SHORT).show();
		}
		
		}catch(Exception e){
			Toast.makeText(this, "FAILED ,press the button again",Toast.LENGTH_SHORT).show();
			
		}
	}
	
	
	
	
	
	
}