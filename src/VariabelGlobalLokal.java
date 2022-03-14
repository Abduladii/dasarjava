public class VariabelGlobalLokal {
    static  int varGlobal=34;

    public static void main(String[] args) {
        varGlobal = 25;
        System.out.println("varGlobal diakses di method main dengan nilai = "+ varGlobal);
        double varGlobal = 3.14;
        System.out.println("varLokal hanya bisa diakses di method main dengan nilai=" + varGlobal);
        aksesVaribelLokal();
    }
    public static void aksesVaribelLokal() {
        System.out.println("varGlobal bisa diakses dimethod aksesVaribelLokal dengan nilai=" + varGlobal);
        //varLokal=2.5;
        System.out.println("varLokal tidak bisa diaksesVariabel ini");
    }
}