package saoasuna.advancedtodo;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Ryan on 17/11/2015.
 */
// purpose: main data items
public class Assignment {

    private UUID mUUID;
    private String mTitle;
    private String mDetails;
    private int mRepeats; // interval to repeat at, stored in hours? 0 represents no repeat
    private Date mDueDate;
    private int mHourOfDay;
    private int mMinuteOfDay;

    // CONSTRUCTORS
    public Assignment() {
        this(UUID.randomUUID());
    }

    public Assignment(UUID uuid) {
        mUUID = uuid;
    }

    public Assignment(UUID uuid, String title, String details, int repeats, Date dueDate) {
        mUUID = uuid;
        mTitle = title;
        mDetails = details;
        mRepeats = repeats;
        mDueDate = dueDate;
    }

    public Assignment(String title, String details, int repeats, Date dueDate) {
        mUUID = UUID.randomUUID();
        mTitle = title;
        mDetails = details;
        mRepeats = repeats;
        mDueDate = dueDate;
    }

    public Assignment(String title, String details, int repeats, Date dueDate, int hour, int minute) {
        mUUID = UUID.randomUUID();
        mTitle = title;
        mDetails = details;
        mRepeats = repeats;
        mDueDate = dueDate;
        mHourOfDay = hour;
        mMinuteOfDay = minute;
    }

    //GETTERS AND SETTERS

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDetails() {
        return mDetails;
    }

    public void setDetails(String details) {
        mDetails = details;
    }

    public int getRepeats() {
        return mRepeats;
    }

    public void setRepeats(int repeats) {
        mRepeats = repeats;
    }

    public Date getDueDate() {
        return mDueDate;
    }

    public void setDueDate(Date dueDate) {
        mDueDate = dueDate;
    }

    public UUID getUUID() {
        return mUUID;
    }

    public void updateDate(Date currentDate) {

    }

}
