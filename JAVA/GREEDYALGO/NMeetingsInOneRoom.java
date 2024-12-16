package JAVA.GREEDYALGO;

import java.util.*;

public class NMeetingsInOneRoom {

    public static void main(String args[]) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        int n = start.length;

        findMaxMeetings(start, end, n);
    }

    public static void findMaxMeetings(int[] start, int[] end, int n) {
        List<Meeting> meetings = new ArrayList<>();

        // Create Meeting objects
        for (int i = 0; i < n; i++) {
            meetings.add(new Meeting(start[i], end[i], i + 1)); // Use 1-based indexing for meeting IDs
        }

        // Sort meetings by their end times
        Collections.sort(meetings);

        // Select meetings
        List<Integer> selectedMeetings = new ArrayList<>();
        int lastEndTime = 0;

        for (Meeting meeting : meetings) {
            if (meeting.start > lastEndTime) {
                selectedMeetings.add(meeting.index);
                lastEndTime = meeting.end;
            }
        }

        // Print the order of selected meetings
        System.out.println("Maximum number of meetings: " + selectedMeetings.size());
        System.out.println("Order of meetings: " + selectedMeetings);
    }
}

class Meeting implements Comparable<Meeting> {
    int start;
    int end;
    int index;

    public Meeting(int start, int end, int index) {
        this.start = start;
        this.end = end;
        this.index = index;
    }

    @Override
    public int compareTo(Meeting other) {
        if (this.end != other.end) {
            return this.end - other.end; // Sort by end time
        }
        return this.index - other.index; // If end times are the same, sort by original index
    }
}