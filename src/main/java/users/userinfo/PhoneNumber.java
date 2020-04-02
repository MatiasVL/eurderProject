package users.userinfo;

public class PhoneNumber {
    private int areaCode;
    private int number;
    private String fullNumber;

    public PhoneNumber(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
        fullNumber = areaCode + "/" + fullNumber;
    }
}