package be.matias.service.customerdto;

public class PhoneNumberDto {
    private int areaCode;
    private int number;

    public PhoneNumberDto(int areaCode, int number) {
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
