package org.example;

import com.github.f4b6a3.tsid.Tsid;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(in);
		String id;
		String result;
		out.println("Informe o valor do id: ");
		id =  scanner.nextLine();

		if(NumberUtils.isDigits(id)){
			result = convertToStringValue(Long.valueOf(id));
		}else{
			result = String.valueOf(convertToLongValue(String.valueOf(id)));
		}
		out.println("Resultado: " + result);
		scanner.close();
	}


	private static String convertToStringValue(Long longValue){

		return Tsid.from(longValue).toString();
	}
	private static Long convertToLongValue(String value){

		return Tsid.from(value).toLong();
	}
}