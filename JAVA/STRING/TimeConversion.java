package JAVA.STRING;

public class TimeConversion {

    public static void main(String[] args) {

        String time = "07:05:45PM";

        System.out.println("24-Hour Format: " + timeConversion(time));
    }

    private static String timeConversion(String s) {

        // Extract time and period
        String time = s.substring(0, 8);
        String period = s.substring(8);

        // Extract hour
        int hour = Integer.parseInt(time.substring(0, 2));

        // Convert according to AM/PM
        if ("PM".equals(period)) {

            if (hour < 12) {
                hour += 12;
            }

        } else { // AM

            if (hour == 12) {
                hour = 0;
            }

        }

        // Return final time
        return String.format("%02d", hour) + time.substring(2);
    }
}

/*
 * Question:
 * 
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * 
 * Note:
 * - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM remains 12:00:00.
 * 
 * Input Format:
 * A single string in the format:
 * 
 * HH:MM:SSAM
 * or
 * HH:MM:SSPM
 * 
 * Sample Input 1:
 * 07:05:45PM
 * 
 * Sample Output 1:
 * 19:05:45
 * 
 * ------------------------------------------
 * 
 * Sample Input 2:
 * 12:01:00AM
 * 
 * Sample Output 2:
 * 00:01:00
 * 
 * ------------------------------------------
 * 
 * Sample Input 3:
 * 12:01:00PM
 * 
 * Sample Output 3:
 * 12:01:00
 * 
 * ------------------------------------------
 * 
 * Logic:
 * 
 * 1. Extract the time (HH:MM:SS).
 * 2. Extract the period (AM/PM).
 * 3. Convert the first two characters (hour) into an integer.
 * 4. If it is PM:
 * - If hour is not 12, add 12.
 * 5. If it is AM:
 * - If hour is 12, change it to 00.
 * 6. Combine the updated hour with the remaining time.
 * 
 * ------------------------------------------
 * 
 * Dry Run
 * 
 * Input:
 * 07:05:45PM
 * 
 * time = 07:05:45
 * period = PM
 * hour = 7
 * 
 * PM and hour != 12
 * 
 * hour = 7 + 12
 * hour = 19
 * 
 * Return:
 * 19:05:45
 * 
 * ------------------------------------------
 * 
 * Edge Cases
 * 
 * Input:
 * 12:00:00AM
 * 
 * hour = 12
 * AM
 * 
 * Convert to:
 * 00:00:00
 * 
 * ------------------------------------------
 * 
 * Input:
 * 12:30:45PM
 * 
 * hour = 12
 * PM
 * 
 * Keep hour as 12
 * 
 * Output:
 * 12:30:45
 * 
 * ------------------------------------------
 * 
 * Time Complexity:
 * O(1)
 * 
 * Space Complexity:
 * O(1)
 * 
 * Key Java Methods Used:
 * 
 * substring(beginIndex)
 * substring(beginIndex, endIndex)
 * Integer.parseInt()
 * String.format("%02d", value)
 * equals()
 */

// %02d
// Part Meaning
// % Start of a format specifier
// 0 Pad with zeros
// 2 Minimum width is 2 characters
// d Decimal integer
