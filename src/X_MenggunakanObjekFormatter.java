import java.text.NumberFormat;

public class X_MenggunakanObjekFormatter {
    public static void main(String[] args) {
        double doubleVal=1280.8/2.5;
        NumberFormat numberFormatter= NumberFormat.getNumberInstance();
        NumberFormat currFormatter= NumberFormat.getNumberInstance();
        NumberFormat percentformatter= NumberFormat.getNumberInstance();
        String NumberStr =numberFormatter.format(doubleVal);
        String currStr=currFormatter.format(doubleVal);
        String parcentStr = percentformatter.format(doubleVal);
        System.out.println("double 1280.8/2.5 berformat number :"+ NumberStr);
        System.out.println("double 1280.8/2.5 berformat currency:"+currStr);
        System.out.println("double 1280.8/2.5 berformat percent:"+parcentStr);



    }    }