package blogspot.destinationengineering.TimeTable;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OverView extends Activity{
	

	private TextView disp,dispb;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.ov);
	Typeface tf = Typeface.createFromAsset(getAssets(),"font/hing.TTF"); 
	Typeface tf2 = Typeface.createFromAsset(getAssets(),"font/font3.TTF"); 
    
	disp = (TextView) findViewById(R.id.tx);
	disp.setTypeface(tf);
	dispb = (TextView) findViewById(R.id.dispb);
	dispb.setTypeface(tf2);
	dispb.setText(">>This is a Lecture scheduler application, with a clean interface. \r\n \r\n " +
			">>You can have track of your lectures easily. No unnecessary features, no confusion.  \r\n \r\n " +
			">>This app is soon to be updated to have an exam scheduler functionality  \r\n \r\n " +
			">>If you are also an android developer, you are most welcome to connect with us on FB so that we can share our ideas and we would also love to hear your valuable suggestions. \r\n \r\n" + 
			">>Write your views to the developer by clicking the below button ");
    
    
	
	}
	
	public void mail(View view)
	{
		switch(view.getId())
		{
		case R.id.mail:
			Intent eml = new Intent(this,Email.class); 
			startActivity(eml);
			break;
		case R.id.fb:
			String url = "http://www.facebook.com/dhiwakar.na";
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setData(Uri.parse(url));
			startActivity(i);
			break;
		case R.id.blog:
			String url2 = "http://www.dhiwakar-destinationengineering.blogspot.com";
			Intent i2 = new Intent(Intent.ACTION_VIEW);
			i2.setData(Uri.parse(url2));
			startActivity(i2);
			break;
		}
	}
	

}
