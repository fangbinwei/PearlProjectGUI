package libsvmAPI;
import java.io.IOException;

import libsvm.*;

public class LibSVMTest {

	/**JAVA test code for LibSVM
	 * @author yangliu
	 * @throws IOException 
	 * @blog http://blog.csdn.net/yangliuy
	 * @mail yang.liu@pku.edu.cn
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Test for svm_train and svm_predict
		//svm_train: 
		//	  param: String[], parse result of command line parameter of svm-train
		//    return: String, the directory of modelFile
		//svm_predect:
		//	  param: String[], parse result of command line parameter of svm-predict, including the modelfile
		//    return: Double, the accuracy of SVM classification

		

		/*
		 * 第二步 从好的中继续分   200颗 8（形状特征）   cross validation 69.375%  test 67.5%
		 */
//		String[] trainArgs = {"-c","16","-g","0.25","DataSet/train/ForModel/normalTrainData"};//directory of training file
		String modelFile = "normalTrainData.model";
//		System.out.print("Cross validation is done! The modelFile is " + modelFile);
		String[] testArgs = {"DataSet/train/ForModel/normalTestData", modelFile, "DataSet/train/ForModel/result"};//directory of test file, model file, result file
		Double accuracy = svm_predict.main(testArgs);
		System.out.println("SVM Classification is done! The accuracy is " + accuracy);
		

	}

}

