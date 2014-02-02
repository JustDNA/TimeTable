package blogspot.destinationengineering.TimeTable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class Email extends Activity implements View.OnClickListener {
	EditText personsEmail, pro, con, suggestion;
	String emailAdd, good, bad, sugg;
	Button sendEmail;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email);
		initializeVars();
		sendEmail.setOnClickListener(this);
	}
	private void initializeVars() {
		// TODO Auto-generated method stub
		personsEmail = (EditText) findViewById(R.id.etEmails);
		pro = (EditText) findViewById(R.id.pro);
		con = (EditText) findViewById(R.id.con);
		suggestion = (EditText) findViewById(R.id.sug);
		sendEmail = (Button) findViewById(R.id.bSentEmail);
		personsEmail.setText("dhiwakaraliasjd@gmail.com");
	}
	public void onClick(View v) {
		// TODO Auto-generated method stub
		convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated();
		String emailaddress[] ={ emailAdd };
		String message = "Well hello "
				+ "Dhiwakar!" + "\n"
				+ "I just wanted to say that the good thing about your app is that "
				+ good + "\n"
				+ "And the bad thing about your app is that " + bad +
				'\n' +"And i suggest you that you " +sugg
				;
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Hey i just used your time table app");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message );
		emailIntent.setType("plain/text");
		startActivity(emailIntent);
	}
	private void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated() {
		// TODO Auto-generated method stub
		
		emailAdd = personsEmail.getText().toString();
		good = pro.getText().toString();
		bad = con.getText().toString();
		sugg = suggestion.getText().toString();
		}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}