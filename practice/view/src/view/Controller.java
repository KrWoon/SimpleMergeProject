package view;

import java.io.File;
import java.io.IOException;

public class Controller {
	
	
	public static void loadFile(File ldfile, int num){//���� load ȣ��
		Model.load(ldfile, num);
	}
	public static void saveFile(File svfile, String content, int num) throws IOException{//���� saveȣ��
		Model.save(svfile, content, num);
	}
}
