package dev.ejiwen.todolist;

public class Note {
    private String tag;
    private String note;

    public Note(String tag, String note) {
        this.tag = tag;
        this.note = note;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
