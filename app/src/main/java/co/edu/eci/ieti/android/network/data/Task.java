package co.edu.eci.ieti.android.network.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.Date;

import co.edu.eci.ieti.android.ui.utils.ToDate;

@Entity(tableName = "task")
public class Task {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "task")
    private long id;
    private String description;
    private int priority;
    @Ignore
    private User assignedTo;
    @TypeConverters(ToDate.class)
    private Date dueDate;

    public Task(){}
    @Ignore
    public Task(long id, String description, int priority, User assignedTo, Date dueDate) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
