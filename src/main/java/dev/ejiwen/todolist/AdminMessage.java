package dev.ejiwen.todolist;

public class AdminMessage {
    private boolean shown;
    private String message;

    public AdminMessage(boolean shown, String message) {
        this.shown = shown;
        this.message = message;
    }

    public boolean isShown() {
        return this.shown;
    }

    public boolean getShown() {
        return this.shown;
    }

    public void setShown(boolean shown) {
        this.shown = shown;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
