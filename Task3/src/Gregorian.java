public class Gregorian {
    private int day;
    private int month;
    private int year;
    private int[] thirtyOne = {1,3,5,7,8,10,12};
    private int[] thirty = {4,6,9,11};
    public Gregorian(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void toNextDay() {
        if ((year % 4 == 0) & ((year % 4 == 0) & (year % 100 == 0) & (year % 400 == 0))) {
            if (month == 2) {
                if (day < 29) {
                    day++;

                } else {
                    day = 1;
                    month++;
                }
                return;
            }
        } else {
            if (month == 2) {
                if (day < 28) {
                    day++;

                } else {
                    day = 1;
                    month++;
                }
                return;
            }
        }
        for(int i=0; i<thirtyOne.length; i++){
            if(month == thirtyOne[i]){
                if(day < 31){
                    day++;
                    return;
                }else{
                    day = 1;
                    if(month < 12) {
                        month++;
                    }else{
                        month = 1;
                        year++;
                    }
                    return;
                }
            }
        }
        for(int i=0; i<thirty.length; i++){
            if(month == thirty[i]){
                if(day < 30){
                    day++;
                    break;
                }else{
                    day = 1;
                    if(month < 12) {
                        month++;
                    }else{
                        month = 1;
                        year++;
                    }
                    break;
                }
            }
        }


    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}

