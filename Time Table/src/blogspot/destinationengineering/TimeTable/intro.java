package blogspot.destinationengineering.TimeTable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class intro extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro);
	
	}
	
	
	public void introclick(View view)
	{
		switch(view.getId())
		{
		case R.id.intro:
			Intent StartApp = new Intent(this,TimeTableActivity.class); 
			startActivity(StartApp);
			
			finish();
		}
			
	}
	
	

}
