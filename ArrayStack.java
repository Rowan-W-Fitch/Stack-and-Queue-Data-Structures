import java.util.EmptyStackException;

public class ArrayStack implements DStack{
double[] stackFrame = new double[5];

public ArrayStack(){
} //empty constructor

public double pop(){

double pop_val = 0.0; //returned value initializer
  
if(stackFrame[0] == 0){
    throw new EmptyStackException();
  }  //check 1st if stack is empty

if(stackFrame[stackFrame.length -1] != 0) {
	pop_val = stackFrame[stackFrame.length -1];
	stackFrame[stackFrame.length -1] = 0;
	return pop_val;
} //checks if the array is full, then deletes the last index

for(int i = 0; i < stackFrame.length; i ++) {
	if(stackFrame[i] == 0) {
		pop_val = stackFrame[i -1]; //if index empty, the top is the index before
		stackFrame[i -1] =0; //if index empty, then delete one before(top)
		return pop_val;
	}
}

return pop_val;

}

@Override
public boolean isEmpty() {
	boolean bool = false; //boolean initializer
	
	if(stackFrame[0] == 0) { //if 1st index is 0 stack is empty -> return true
		bool = true;
		return bool;
	}
	else {
		return bool;
	}
}

@Override
public void push(double d) {

if(stackFrame[0]== 0) {
	stackFrame[0] = d;
	return;
} //if stack is empty add to beginning

if(stackFrame[stackFrame.length -1] != 0) {
	//if stack is full double length
	int old_length = stackFrame.length; //instance variable for old length
	double[] stackFrame2 = new double[old_length * 2]; //double length
	
	for(int i = 0; i < stackFrame.length; i ++) {
		stackFrame2[i] = stackFrame[i]; //fills new 2x length array w old indices
	}
	
	stackFrame = stackFrame2; //reassigns stackframe to 2x length array
	stackFrame[old_length] = d; //adds value to the next available space in array
	return;
}

//if edge cases N/A go to normal for loop
for(int i = 0; i < stackFrame.length; i ++) {
	if(stackFrame[i] == 0) {
		stackFrame[i] = d;
		return;
	}
}
	
}

@Override
public double peek() {
	double val_rtrn = 0.0; //value initializer
	
	if(stackFrame[0] == 0) {
		throw new EmptyStackException(); //if stack empty throw exception
	}
	
	for(int i = 0; i <stackFrame.length; i ++) {
		
		if(stackFrame[i] == 0) {
			val_rtrn = stackFrame[i -1];
			return val_rtrn;
		} //if stack not full, returns index before 1st empty index(top)
		
	}
	
	//if stack full return last value in array(top)
	val_rtrn = stackFrame[stackFrame.length -1];
	return val_rtrn;
	
}

public String toString() {
	String str = ""; //string initializer
	
	if(stackFrame[0] == 0) {
		return str; //testing is stack empty
	}
	
	for(int i = stackFrame.length -1; i >= 0; i--) {
		
		if(stackFrame[i] != 0) {
			str = str + stackFrame[i] + " ";
		} //only print indices that arent empty
		
	}
	
	return str;
}
}

