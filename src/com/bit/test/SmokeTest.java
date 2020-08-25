package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {

	static void main(String[] args) {

		BaseTest bt = new BaseTest();
		bt.targetTest();
	}

}
