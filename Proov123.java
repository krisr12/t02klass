public class Proov123{
    public static void main (String[] args){
        Koonus test1=new Koonus(2,3,5,300);
        System.out.printf("Koonuse ruumala on %.2f ",test1.ruumala());
        System.out.println("Koonuse pindala on "+test1.pindala());
		System.out.printf("Koonuse tihedus on %.2f ",test1.tihedus());
    }
}