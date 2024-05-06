public class Mode{
	public static void main(String...args ){

int inputNumber[] = { 1,1,2,3,4};
int mode = inputNumber[0];
int counter = 0;



for (int i = 0; i < inputNumber.length; i++){
int count = 0;
for (int j = 0; j < inputNumber.length; i++){

if (inputNumber[j] == inputNumber[i]){
count++;
}
}

if( count > counter ){
counter = count;
mode = inputNumber[i];
}
}
System.out.print(mode);

}
	}