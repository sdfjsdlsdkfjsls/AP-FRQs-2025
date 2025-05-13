public class SignedText {
    private String first;
    private String last;

    public SignedText(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getSignature() {
        String result = "";
        if (first.length() != 0) {
            result += first.substring(0,1) + "-";
        }
        result += last;

        return result;
    }

    public String addSignature(String str) {
        String sign = getSignature();
        if (str.indexOf(sign) == -1) {
            return str + sign;
        }
        if (str.indexOf(sign) == 0) {
            return str.substring(sign.length()) + str.substring(0, sign.length());
        }
        if (str.indexOf(sign) == str.length() - sign.length()) {
            return str;
        }
        return sign;
    }
}
