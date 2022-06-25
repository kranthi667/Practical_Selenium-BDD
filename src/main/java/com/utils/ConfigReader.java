package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;


	static {

		init_prop();
	}
	public static  Properties init_prop() {


		prop = new Properties();



		FileInputStream propFile;
		try {
			propFile = new FileInputStream(System.getProperty("user.dir")+"//config.properties");




			prop.load(propFile);
		} catch (IOException e1) {

			e1.printStackTrace();
		}


		return prop;

	}


}

