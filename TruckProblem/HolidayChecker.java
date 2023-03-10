package TruckProblem;

import java.time.LocalDateTime;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class HolidayChecker {
	public static boolean isHoliday(LocalDateTime date) {
		
		WeekFields weekFields = WeekFields.of(Locale.getDefault()); 
		int weekNumber = date.get(weekFields.weekOfMonth());

		if(date.getDayOfWeek().getValue() == 7) {
			return true;
		}
		else if(weekNumber == 2 && date.getDayOfWeek().getValue() == 6) {
			return true;
		}
		else if(date.getMonth().getValue() == 1 && date.getDayOfMonth() == 1) {
			return true;
		}
		else if(date.getMonth().getValue() == 1 && date.getDayOfMonth() == 26) {
			return true;
		}
		else if(date.getMonth().getValue() == 8 && date.getDayOfMonth() == 15) {
			return true;
		}
		else {
			return false;
		}
	}
}
