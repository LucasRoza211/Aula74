public class DayTime {

    public static void main(String[] args) {
        int hour = 6;
        if (hour < 12){
            System.out.println("Bom dia!");
            System.out.println("São " + hour + " horas da manhã");
        }else if(hour > 12 && hour < 18){
            System.out.println("Bom tarde!");
            System.out.println("São " + hour + " horas da tarde");
        }else{
            System.out.println("Bom noite!");
            System.out.println("São " + hour + " horas da noite");
        }
    }
}
