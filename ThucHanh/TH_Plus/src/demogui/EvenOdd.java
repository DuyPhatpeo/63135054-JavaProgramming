package demogui;

// Bài 10
import javax.swing.JOptionPane;
public class EvenOdd	{
public static void main(String[]	args)	{
int qes;
do{
String	numStr=JOptionPane.showInputDialog("Nhập 1 số nguyên:");
if(numStr!=null &&	!numStr.trim().equals("")){
try{
int num=Integer.parseInt(numStr);
String	result="Số vừa nhập là số "+
((num%2==0)	?	"chẵn" :	"lẻ");
JOptionPane.showMessageDialog(null,	result,
"Output",JOptionPane.INFORMATION_MESSAGE);
}catch(NumberFormatException	ex){
JOptionPane.showMessageDialog(null,	"Nhập sai dữ liệu");
}
}
qes=JOptionPane.showConfirmDialog(null,	"Tiếp tục không?",
"Question",JOptionPane.YES_NO_OPTION);
}while(qes==JOptionPane.YES_OPTION);
}
}