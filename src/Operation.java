public class Operation {
    double num1;
    double num2;
    double result;
    String type;
    int userId;
    public Operation(){}
    public Operation(double num1, double num2, String type) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
    }
    public Operation(double num1, double num2, double result, String type) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.type = type;
    }
    public Operation(double num1, double num2, String type, int userId) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
        this.userId = userId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    public String getType() {
        return type;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  "num1 = " + this.num1 +
                ", num2 = " + this.num2 +
                ", result = " + this.result +
                ", type = " + this.type + "\n";
    }
    public String toStringStorage() {
        return this.num1 + " " +
                this.num2 + " " +
                this.type + " " +
                this.result;
    }
    public String toNewStringStorage() {
        return this.num1 + " " +
                this.num2 + " " +
                this.type + " " +
                this.result + " " +
                this.userId;
    }
}
