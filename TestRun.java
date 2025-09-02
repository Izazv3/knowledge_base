import java.util.ArrayList;
import java.util.Arrays;

public class TestRun {

    public static void main(String args[]) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        int n = start.length;

        findMaxMeetings(start, end, n);
    }

    private static void findMaxMeetings(int[] start, int[] end, int n) {

        ArrayList<Meeting> meetings = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            meetings.add(new Meeting(start[i], end[i], i + 1));

        }

        ArrayList<Integer> selectedMeetingIndex = new ArrayList<>();
        int lastEndTime = -1;

        for (int i = 0; i < meetings.size(); i++) {

            if (meetings.get(i).start > lastEndTime) {
                selectedMeetingIndex.add(meetings.get(i).index);
                lastEndTime = meetings.get(i).end;
            }

        }

        System.out.println(selectedMeetingIndex.toString());

    }

}

class Meeting {
    int start;
    int end;
    int index;

    Meeting(int start, int end, int index) {
        this.start = start;
        this.end = end;
        this.index = index;

    }

}