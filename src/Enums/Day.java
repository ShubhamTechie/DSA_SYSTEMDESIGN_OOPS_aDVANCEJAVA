package Enums;

public enum Day {


    monday(true), tuesday(true),wednusday(true),thusday(true), friday(true),satureday(false),sunda(false);

    private final boolean isWeekday;


    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType(){
        return  isWeekday ? "weekday" : "weekend" ;
    }
}
