package com.forest.study6.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeatherMain {

		public static void main(String[] args) {			
			
			try {
				new WeatherController().start();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
}
