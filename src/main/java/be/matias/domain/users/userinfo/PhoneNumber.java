package be.matias.domain.users.userinfo;

public class PhoneNumber {
    private int areaCode;
    private int number;

    public PhoneNumber(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getNumber() {
        return number;
    }

    public String getFullNumber() {
        return areaCode+"/"+number;
    }
}