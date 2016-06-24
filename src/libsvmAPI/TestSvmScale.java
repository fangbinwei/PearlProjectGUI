package libsvmAPI;
import java.io.IOException;


public class TestSvmScale {
	public static void main(String[] args) {
		
		String[] scaleArgs={"-l","0","-u","1","-s","DataSet/train/ForModel/ScaleSave","DataSet/train/ForModel/trainData"};
		String[] scaleArgs2={"-r","DataSet/train/ForModel/ScaleSave","DataSet/train/ForModel/testData"};
		try {
			svm_scale_mine a=new svm_scale_mine("DataSet/train/ForModel/normalTrainData");
			a.run(scaleArgs);
			a=new svm_scale_mine("DataSet/train/ForModel/normalTestData");
			a.run(scaleArgs2);
//			svm_scale.main(scaleArgs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
