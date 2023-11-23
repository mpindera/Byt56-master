package poolpattern;

public class Telephone {
    final String phoneNum;

    public Telephone(int phoneNum) {
        System.out.println("Create phone call with: " + phoneNum);
        this.phoneNum = String.valueOf(phoneNum);
    }

    public String getPhoneNum() {
        return phoneNum;
    }
}
