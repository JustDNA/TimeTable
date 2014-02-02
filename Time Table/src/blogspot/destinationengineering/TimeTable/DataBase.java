package blogspot.destinationengineering.TimeTable;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase {
	
	
	public static final String KEY_ROWID ="_id";
	public static final String KEY_DAY ="day";
	public static final String KEY_S1 ="slot1";
	public static final String KEY_S2 ="slot2";
	public static final String KEY_S3 ="slot3";
	public static final String KEY_S4 ="slot4";
	public static final String KEY_S5 ="slot5";
	public static final String KEY_S6 ="slot6";
	public static final String KEY_S7 ="slot7";
	public static final String KEY_S8 ="slot8";
	public static final String KEY_S9 ="slot9";
	public static final String KEY_S10 ="slot10";
	
	private static final String DATABASE_NAME ="TimeTableData7";
	private static final String DATABASE_TABLE ="TimeTable7";
	private static final int DATABASE_VERSION =1;
	
	private DBhelper ourHelper;
	private static SQLiteDatabase ourDatabase;
	private final Context ourContext;
	
	
	private static class DBhelper extends SQLiteOpenHelper{
	
		
		public DBhelper(Context context) 
		{
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
			// TODO Auto-generated constructor stub
			
			
			
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL("CREATE TABLE " + DATABASE_TABLE + " (" + KEY_ROWID +
					" INTEGER PRIMARY KEY AUTOINCREMENT, " + 
					KEY_DAY + " TEXT NOT NULL, " + 
					KEY_S1 + " TEXT, " + 
					KEY_S2 + " TEXT, " + 
					KEY_S3 + " TEXT, " + 
					KEY_S4 + " TEXT, " + 
					KEY_S5 + " TEXT, " + 
					KEY_S6 + " TEXT, " +
					KEY_S7 + " TEXT, " + 
					KEY_S8 + " TEXT, " +
					KEY_S9 + " TEXT, " + 
					KEY_S10 + " TEXT)");
			
			ContentValues initialValues = new ContentValues();
		 	initialValues.put(KEY_DAY, "MONDAY");
            initialValues.put(KEY_S1, "");
            initialValues.put(KEY_S2, "");
            initialValues.put(KEY_S3, "");
            initialValues.put(KEY_S4, "");
            initialValues.put(KEY_S5, "");
            initialValues.put(KEY_S6, "");
            initialValues.put(KEY_S7, "");
            initialValues.put(KEY_S8, "");
            initialValues.put(KEY_S9, "");
            initialValues.put(KEY_S10, "");
            db.insert(DATABASE_TABLE, null, initialValues);
           
            ContentValues initialValues2 = new ContentValues();
		 	initialValues2.put(KEY_DAY, "TUESDAY");
            initialValues2.put(KEY_S1, "");
            initialValues2.put(KEY_S2, "");
            initialValues2.put(KEY_S3, "");
            initialValues2.put(KEY_S4, "");
            initialValues2.put(KEY_S5, "");
            initialValues2.put(KEY_S6, "");
            initialValues2.put(KEY_S7, "");
            initialValues2.put(KEY_S8, "");
            initialValues2.put(KEY_S9, "");
            initialValues2.put(KEY_S10, "");
            db.insert(DATABASE_TABLE, null, initialValues2);
           
            ContentValues initialValues3 = new ContentValues();
		 	initialValues3.put(KEY_DAY, "WEDNESDAY");
            initialValues3.put(KEY_S1, "");
            initialValues3.put(KEY_S2, "");
            initialValues3.put(KEY_S3, "");
            initialValues3.put(KEY_S4, "");
            initialValues3.put(KEY_S5, "");
            initialValues3.put(KEY_S6, "");
            initialValues3.put(KEY_S7, "");
            initialValues3.put(KEY_S8, "");
            initialValues3.put(KEY_S9, "");
            initialValues3.put(KEY_S10, "");
            db.insert(DATABASE_TABLE, null, initialValues3);
         
            ContentValues initialValues4 = new ContentValues();
		 	initialValues4.put(KEY_DAY, "THURSDAY");
            initialValues4.put(KEY_S1, "");
            initialValues4.put(KEY_S2, "");
            initialValues4.put(KEY_S3, "");
            initialValues4.put(KEY_S4, "");
            initialValues4.put(KEY_S5, "");
            initialValues4.put(KEY_S6, "");
            initialValues4.put(KEY_S7, "");
            initialValues4.put(KEY_S8, "");
            initialValues4.put(KEY_S9, "");
            initialValues4.put(KEY_S10, "");
            db.insert(DATABASE_TABLE, null, initialValues4);
          
            ContentValues initialValues5 = new ContentValues();
		 	initialValues5.put(KEY_DAY, "FRIDAY");
            initialValues5.put(KEY_S1, "");
            initialValues5.put(KEY_S2, "");
            initialValues5.put(KEY_S3, "");
            initialValues5.put(KEY_S4, "");
            initialValues5.put(KEY_S5, "");
            initialValues5.put(KEY_S6, "");
            initialValues5.put(KEY_S7, "");
            initialValues5.put(KEY_S8, "");
            initialValues5.put(KEY_S9, "");
            initialValues5.put(KEY_S10, "");
            db.insert(DATABASE_TABLE, null, initialValues5);
       
            ContentValues initialValues6 = new ContentValues();
		 	initialValues6.put(KEY_DAY, "SATURDAY");
            initialValues6.put(KEY_S1, "");
            initialValues6.put(KEY_S2, "");
            initialValues6.put(KEY_S3, "");
            initialValues6.put(KEY_S4, "");
            initialValues6.put(KEY_S5, "");
            initialValues6.put(KEY_S6, "");
            initialValues6.put(KEY_S7, "");
            initialValues6.put(KEY_S8, "");
            initialValues6.put(KEY_S9, "");
            initialValues6.put(KEY_S10, "");
            db.insert(DATABASE_TABLE, null, initialValues6);


		}

		

		
		
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
			onCreate(db);
			
			
		}
		
		
		
		
	}
	
	public DataBase(Context c){
		ourContext = c;		
	}
	public DataBase open(){
		ourHelper = new DBhelper(ourContext);
		ourDatabase = ourHelper.getWritableDatabase();
		return this;
	}
	
	public void close(){
		ourHelper.close();
	}
	
	public String getData1() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "SLOT 1 \n";
		for(c.moveToFirst() ; !c.isAfterLast() ; c.moveToNext())
		{
			result = result + "\n" + c.getString(1) +"\n";
		}
		
		return result;
	}
	public String getData2() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "SLOT 2 \n";
		for(c.moveToFirst() ; !c.isAfterLast() ; c.moveToNext())
		{
			result = result + "\n" +c.getString(2) +"\n";
		}
		
		return result;
	}
	public String getData3() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "SLOT 3 \n";
		for(c.moveToFirst() ; !c.isAfterLast() ; c.moveToNext())
		{
			result = result + "\n" +c.getString(3) +"\n";
		}
		
		return result;
	}
	public String getData4() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "SLOT 4 \n";
		for(c.moveToFirst() ; !c.isAfterLast() ; c.moveToNext())
		{
			result = result + "\n" +c.getString(4) +"\n";
		}
		
		return result;
	}
	public String getData5() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "SLOT 5 \n";
		for(c.moveToFirst() ; !c.isAfterLast() ; c.moveToNext())
		{
			result = result + "\n" +c.getString(5) +"\n";
		}
		
		return result;
		}
	public String getData6() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "SLOT 6 \n";
		for(c.moveToFirst() ; !c.isAfterLast() ; c.moveToNext())
		{
			result = result + "\n" +c.getString(6) +"\n";
		}
		
		return result;
	}
	public String getData7() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "SLOT 7 \n";
		for(c.moveToFirst() ; !c.isAfterLast() ; c.moveToNext())
		{
			result = result + "\n" +c.getString(7) +"\n";
		}
		
		return result;
}
	public String getData8() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "SLOT 8 \n";
		for(c.moveToFirst() ; !c.isAfterLast() ; c.moveToNext())
		{
			result = result + "\n" +c.getString(8) +"\n";
		}
		
		return result;
	}
	public String getData9() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "SLOT 9 \n";
		for(c.moveToFirst() ; !c.isAfterLast() ; c.moveToNext())
		{
			result = result + "\n" +c.getString(9) +"\n";
		}
		
		return result;
	}
	public String getData10() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "SLOT 10 \n";
		for(c.moveToFirst() ; !c.isAfterLast() ; c.moveToNext())
		{
			result = result +"\n" + c.getString(10) +"\n";
		}
		
		return result;
	}
	
	public String getDay(long l){
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_ROWID + "=" + l, null, null, null, null);
		if(c != null){
			c.moveToFirst();
			String day = c.getString(0);
			return day;
		}
		return null;
	
	
	}
	public String getS1(long l){
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_ROWID + "=" + l, null, null, null, null);
		if(c != null){
			c.moveToFirst();
			String s = c.getString(1);
			return s;
		}
		return null;
	}
	public String getS2(long l){
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_ROWID + "=" + l, null, null, null, null);
		if(c != null){
			c.moveToFirst();
			String s = c.getString(2);
			return s;
		}
		return null;
	}
	public String getS3(long l){
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_ROWID + "=" + l, null, null, null, null);
		if(c != null){
			c.moveToFirst();
			String s = c.getString(3);
			return s;
		}
		return null;
	}
	public String getS4(long l){
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_ROWID + "=" + l, null, null, null, null);
		if(c != null){
			c.moveToFirst();
			String s = c.getString(4);
			return s;
		}
		return null;
	}
	public String getS5(long l){
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_ROWID + "=" + l, null, null, null, null);
		if(c != null){
			c.moveToFirst();
			String s = c.getString(5);
			return s;
		}
		return null;
	}
	public String getS6(long l){
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_ROWID + "=" + l, null, null, null, null);
		if(c != null){
			c.moveToFirst();
			String s = c.getString(6);
			return s;
		}
		return null;
	}
	public String getS7(long l){
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_ROWID + "=" + l, null, null, null, null);
		if(c != null){
			c.moveToFirst();
			String s = c.getString(7);
			return s;
		}
		return null;
	}
	public String getS8(long l){
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_ROWID + "=" + l, null, null, null, null);
		if(c != null){
			c.moveToFirst();
			String s = c.getString(8);
			return s;
		}
		return null;
	}
	public String getS9(long l){
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_ROWID + "=" + l, null, null, null, null);
		if(c != null){
			c.moveToFirst();
			String s = c.getString(9);
			return s;
		}
		return null;
	}
	public String getS10(long l){
		// TODO Auto-generated method stub
		String[] columns = new String[]{KEY_DAY,KEY_S1,KEY_S2,KEY_S3,KEY_S4,KEY_S5,KEY_S6,KEY_S7,KEY_S8,KEY_S9,KEY_S10};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, KEY_ROWID + "=" + l, null, null, null, null);
		if(c != null){
			c.moveToFirst();
			String s = c.getString(10);
			return s;
		}
		return null;
	}
	public void editEntry(long l,String day, String sl1, String sl2, String sl3, String sl4, String sl5, String sl6, String sl7, String sl8, String sl9, String sl10){
		// TODO Auto-generated method stub
		
		
		ContentValues cvN = new ContentValues();
		cvN.put(KEY_DAY, day);
		cvN.put(KEY_S1, sl1);
		cvN.put(KEY_S2, sl2);
		cvN.put(KEY_S3, sl3);
		cvN.put(KEY_S4, sl4);
		cvN.put(KEY_S5, sl5);
		cvN.put(KEY_S6, sl6);
		cvN.put(KEY_S7, sl7);
		cvN.put(KEY_S8, sl8);
		cvN.put(KEY_S9, sl9);
		cvN.put(KEY_S10, sl10);
		ourDatabase.update(DATABASE_TABLE, cvN, KEY_ROWID + "=" + l , null);
	}
	
	
	
}