import java.util.EmptyStackException;

public class Queue implements DQueue{

double[] Qframe = new double[5]; //array initializer

public Queue(){
// empty constructor
}

public boolean isEmpty(){
  boolean bool = false; //boolean initializer

  if(Qframe[0] == 0) {
	  bool = true;
	  return bool;
	  //if 1st index empty then array is empty
  }

  return bool;
}

public void enqueue(double d){
//1st check if array full
  if(Qframe[Qframe.length -1] != 0.0){
    double[] newArr = new double[Qframe.length * 2]; //makes array w/ 2X length

    for(int i = 0; i <Qframe.length; i++){
      newArr[i] = Qframe[i];
    } //putting old values into newArr

    newArr[Qframe.length] = d; //puts d value at next open spot in new Array
    Qframe = newArr; //resets Qframe as newArr
    return;
  }

  for(int i = 0; i <Qframe.length; i ++){
    if(Qframe[i] == 0.0){
      Qframe[i] = d;
      return;
    }  //if array not full, add to first empty spot
  }

}

public double dequeue(){
  double val = 0.0; //double initializer

  if(Qframe[0] == 0.0){
    throw new EmptyStackException();
    //if queue empty then throw exception
  }

  val = Qframe[0]; //sets returned value to 1st index in array
  for(int i = 1; i< Qframe.length; i++){
    Qframe[i-1] = Qframe[i];
  }
  Qframe[Qframe.length - 1] = 0.0; //for loop does not account for last index

  return val;
}

public double peek(){
  double val = 0.0;

  if(Qframe[0] == 0.0){
    throw new EmptyStackException();
  } //1st check if queue is empty

  val = Qframe[0]; //set value to 1st index in array
  return val;
}

public String toString(){
  String str = ""; //string initializer

  if(Qframe[0] == 0){
    return str;
  } //if Qframe empty then nothing to return

  for(int i = 0; i < Qframe.length; i++){
	  
	  if(Qframe[i] != 0){
      str = str + Qframe[i] + " ";
    } //only adds nonzero indices
	  
  }

  return str;
}

}
