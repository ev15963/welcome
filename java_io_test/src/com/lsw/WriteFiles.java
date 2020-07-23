package com.lsw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFiles {
	public static void main(String[] args) {
		int data;
		FileInputStream fis;
		FileOutputStream fos;
		String inFname = "src/com/lsw/WriteFiles.java";
		String outFname = "src/com/lsw/WriteFiles.back";
		
		try {
			//���� ���� �̸����� FileInputStream ����
			fis=new FileInputStream(inFname);
			
			//���� ���� ���� �̸����� FileOutputStream ����
			fos=new FileOutputStream(outFname);
			
			//�� ����Ʈ�� �о� FileOutputStream���� ���
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			System.out.println(outFname + ":������ �����Ǿ����ϴ�.");
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	public WriteFiles() {
		// TODO Auto-generated constructor stub
	}

}