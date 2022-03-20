package fis.topic01.practice01;

import java.text.SimpleDateFormat;

public class DateValidation implements IValidation {
	private String format;

	public boolean validate(String data) {
		SimpleDateFormat dateFormat  = new SimpleDateFormat("dd-MM-yyyy");
		try {
			dateFormat .setLenient(false);
			dateFormat .parse(data);
		return true;
		} catch (Exception e) {
		return false;
		}
		
	}
}
