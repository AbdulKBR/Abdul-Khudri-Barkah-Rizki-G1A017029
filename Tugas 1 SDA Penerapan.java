import java.util.Scanner;
import javax.swing.JOptionPane;
public class pengukur_waktu_tidur 
{
    public static void main(String[] args) 
    {
        int waktu;
        Scanner input = new Scanner(System.in);
        System.out.println("tolong masukkan berapa jam anda tidur sehari:");
        waktu = input.nextInt();
        if (waktu >=7 && waktu <= 9){
            System.out.println("normal");
        }else if(waktu > 9){
            System.out.println("berlebihan");
        }else if(waktu < 7){
            System.out.println("kurang");
        }
    }
}
