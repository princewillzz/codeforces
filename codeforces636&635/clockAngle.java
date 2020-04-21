import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clockAngle {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time_period = Integer.parseInt(br.readLine());
        float longitude = Float.parseFloat(br.readLine());
        float ist = (float)(time_period/360.00) * (float)longitude;
        //ist = Math.round(ist*100)/100;

        System.out.println((int)solve(ist, time_period));

    }
    
    static float solve(float ist, int time_period) {
        int ans = 0;
        time_period /= 2;
        float clockAngle = 360/time_period;
        int hour = (int)ist;
        int minute = (int) (ist*100 - Math.floor(ist)*100);
        minute = (minute*60)/100;
        minute = minute/5;
        
        if(hour == minute) return 0;
        else if((hour==12 && minute==12) || (hour==0 && minute==0) || (hour==0 && minute==12) || (hour==12 && minute==0)) return 0;
        else {
        ans = (int)(Math.abs(hour-minute) * clockAngle/2);
        if(Math.abs(hour-minute)>6) {
            int a = (int)(12 - Math.abs(hour-minute)) * (int)clockAngle/2; 
        
        Math.min(ans, a);
        }
        }

        return (int)ans;
    }

}