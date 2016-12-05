package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float a = scn.nextFloat();
		System.out.println(summer(a));
		System.out.println(notsummer(a));
	}


public static float summer (float a){
	float sum =0,sum1=0;
	if(a<=120){
		sum=(float) (a*2.1);
	}else if(a>120&&a<=330){
		sum=(float) (252+((a-120)*3.02));
	}else if(a>330&&a<=500){
		sum=(float) (886.2+((a-330)*4.39));
	}else if(a>500&&a<=700){
		sum=(float) (1632.5+(a-500)*4.97);
	}else if(a>700){
		sum=(float) (2626.5+(a-700)*5.63);
	}
	return sum;
	}

public static float notsummer(float a){
	float sum =0;
	if(a<=120){
		sum=(float) (a*2.1);
	}else if(a>120&&a<=330){
		sum=(float) ((120*2.1)+((a-120)*2.68));
	}else if(a>330&&a<=500){
		sum=(float) ((120*2.1)+(210*2.68)+((a-330)*3.61));
	}else if(a>500&&a<=700){
		sum=(float) ((120*2.1)+(210*2.68)+(170*3.61)+(a-500)*4.01);
	}else if(a>700){
		sum=(float) ((120*2.1)+(210*2.68)+(170*3.61)+(200*4.01)+(a-700)*4.5);
	}
	return sum;
	}
}